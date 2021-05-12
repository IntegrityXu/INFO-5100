/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Music;

import java.util.*;

/**
 *
 * @author xutao
 */
public class Singer {
    private String name;
    private String description;
    private ArrayList <String> album;
    private int id;
    public static int count = 0;
    
    public Singer ( String name ) {
        this.name = name;
        this.id = count;
        count ++;
        album = new ArrayList<>();
        description = null;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }

    public void setName(String name) {
        this.name = name;
    }
    
    

    public int getCount() {
        return count;
    }

    
    @Override 
    public String toString() {
        return this.name;
    }

    public ArrayList<String> getAlbum() {
        return album;
    }

    public void setAlbum(ArrayList<String> album) {
        this.album = album;
    }
    
    public int addAlbum (String name) {
        if (!this.album.contains(name)) {
            album.add(name);
            return 1;
        }
        return 0;
    }
     public int removeAlbum (String name) {
        if (this.album.contains(name)) {
            album.remove(name);
            return 1;
        }
        return 0;
    }
    
}
