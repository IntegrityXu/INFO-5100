/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Music;


import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author xutao
 */
public class SingerDirectory {
    
    private List <Singer> singerList ;
    
    public SingerDirectory() {
        singerList = new ArrayList<>();
    }

    public List<Singer> getSingerList() {
        return singerList;
    }
    
    public int AddSinger(Singer singer) {
        if (!this.ContainsSinger(singer)) {
            singerList.add(singer);
            return 1;
        }
        return 0;
    }
    
    public int RemoveSinger(int id) {
        if (this.searchSinger(id ) != null) {
            for(Singer singer : this.singerList) {
                if(singer.getId() == id){
                    this.singerList.remove(singer);
                    return 1;
                }
            }    
        }
        return 0;
    }
    
    public boolean ContainsSinger(Singer singer) {
        for (Singer s : this.singerList) {
            if (s.getId() == singer.getId() || s.getName().equals(singer.getName())) 
                return true;
        }
        return false;
    }
      
    public Singer searchSinger(int id) {
        for(Singer s : singerList) {
            if(s.getId()==id) {
                return s;
            }
        }
        return null;
    }
    
    public Singer findSinger(String name) {
        for (Singer s : singerList) {
            if (s.getName().equals(name)) {
                return s;
            }
        }
        return null;
    }
    
    public String getNameFromeID (int id) {
        for (Singer singer : this.singerList) {
            if (singer.getId() == id) {
                return singer.getName();
            }
        }
        return null;
    }
    
    public int getIdFromName (String name) {
        for (Singer singer : this.singerList) {
            if (singer.getName().equals(name))
                return singer.getId();
        }
        return -1;
    }
    
}
