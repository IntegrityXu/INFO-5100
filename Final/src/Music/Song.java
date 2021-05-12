/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Music;

import org.w3c.dom.css.Counter;

/**
 *
 * @author xutao
 */
public class Song {
    private String name;
    private String time;
    private String singer;
    private int singerid;
    private int id;
    private String album;
    public static int count = 0;
    private boolean vip;
    
    public Song(  String name, String time, int singerid, String album ) {
        this.name = name;
        this.time = time;
        this.singer = null;
        this.singerid =  singerid;
        this.album = album;
        this.vip = false;
        this.id = count;
        count ++;
        
    }

    public String getAlbum() {
        return album;
    }

    public void setAlbum(String album) {
        this.album = album;
    }

    public boolean isVip() {
        return vip;
    }

    public void setVip(boolean vip) {
        this.vip = vip;
    }
    
    

    public int getSingerid() {
        return singerid;
    }

    public void setSingerid(int singerid) {
        this.singerid = singerid;
    }

    
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public String getSinger() {
        return singer;
    }

    public void setSinger(String singer) {
        this.singer = singer;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    
    @Override
    public String toString() {
        return this.name;
    }
    
    
}
