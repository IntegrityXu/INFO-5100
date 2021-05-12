/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MusicEcosystem;

import Music.Singer;
import Music.Song;
import MusicEcosystem.Enterprise.*;
import MusicEcosystem.Network.Network;
import MusicEcosystem.Organization.RecordCompanyOrganization;
import MusicEcosystem.Role.MusicPlatFormAdmin;
import MusicEcosystem.Role.NetworkAdmin;
import MusicEcosystem.Role.RecordCompanyAdmin;
import MusicEcosystem.Role.SystemAdmin;
import MusicEcosystem.UserAccount.UserAccount;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
/**
 *
 * @author xutao
 */
public class ConfigureASystem {
    public static Ecosystem configure() throws FileNotFoundException, IOException{
        
        Ecosystem system = Ecosystem.getInstance();
        
        //Create a network
        //create an enterprise
        //initialize some organizations
        //have some employees 
        
        //create user account
        SystemAdmin sysAdmin = new SystemAdmin();
        UserAccount account = new UserAccount("sysadmin", "abc", sysAdmin);
        system.getUserAccountDirectory().AddUserAccount(account);
        
        Network network = new Network("CN");
        system.getNetworkList().add(network);
        RecordCompanyEnterprise recordCompany = null;
        MusicPlatEnterprise musicPlat = null;
        
        UserAccount recordCompanyAdmin = new UserAccount("rcadmin", "123", new RecordCompanyAdmin());
        UserAccount musicPlatAdmin = new UserAccount("mpAdmin", "123", new MusicPlatFormAdmin());
        
        UserAccount networkAdmin = new UserAccount("CNAdmin", "123", new NetworkAdmin());
        network.getUserAccountDirectory().AddUserAccount(networkAdmin);
        
        for (Enterprise ep : network.getEnterpriseDirectory().getEnterpaiseList()) {
            if (ep instanceof RecordCompanyEnterprise)
                recordCompany = (RecordCompanyEnterprise) ep;
            if (ep instanceof MusicPlatEnterprise)
                musicPlat = (MusicPlatEnterprise) ep;
        }
        
        recordCompany.getUserAccountDirectory().AddUserAccount(recordCompanyAdmin);
        musicPlat.getUserAccountDirectory().AddUserAccount(musicPlatAdmin);
        
        RecordCompanyOrganization rco = new RecordCompanyOrganization("GOOD MUSIC");
        recordCompany.getOrganizationDirectory().addOrganization(rco);
        
        BufferedReader singerReader = new BufferedReader(new FileReader("./singer.csv"));
        String line = null;
        while ((line = singerReader.readLine()) != null) {
            String tmp = "";
            String[] item = new String[2];
            for (int i = 0; i < line.length(); i++) {
                if ( line.charAt(i)== ',') {
                    item[0] = tmp;
                    tmp += ",";
                    tmp = line.replace(tmp, "");
                    tmp = tmp.replace("\"", "");
                    item[1] = tmp;
                    break;
                } 
                tmp += line.charAt(i);
            }
            if(item[0] == "NAME")
                continue;
            System.out.println(item[0] + " , " + item[1]);
            Singer singer = new Singer(item[0]);
            singer.setDescription(item[1]);
            rco.getSingerDirectory().AddSinger(singer); 
        }
        
        BufferedReader songReader = new BufferedReader(new FileReader("./song.csv"));
        line = null;
        while ((line = songReader.readLine()) != null) {
            String [] item = line.split(",");
            int id = rco.getSingerDirectory().getIdFromName(item[2]);
            if (id == -1) {
                continue;
            }
            Song song = new Song(item[0], item[1], id, item[3]);
            song.setSinger(item[2]);
            song.setVip((Integer.parseInt(item[4]) == 1));
            rco.getSongDirectory().AddSong(song);
            System.out.println(item[0] + "," + item[1]);
        }
        
        return system;
    }
}
