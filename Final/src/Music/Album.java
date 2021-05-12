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

public class Album {
    
    
    public enum Limit {
        Pri("private"),
        Pub("public");
        
        private String value;
        private Limit ( String value) {
            this.value = value;
        }
        public String getValue() {
            return value;
        }
        
        @Override
        public String toString() {
            return value;
        }
    }

    private String name;
    private String limit;
    private SongDirectory songDirectory;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    
    
    
    public Album (String name) {
        this.name = name;
        this.limit = Limit.Pub.getValue();
        songDirectory = new SongDirectory();
    }

    public String getLimit() {
        return limit;
    }

    public void setLimit(String limit) {
        this.limit = limit;
    }

    public SongDirectory getSongDirectory() {
        return songDirectory;
    }

    
    public boolean equals(Album al) {
       if (al.getName().equals(name))
           return true;
       return false;
    }
    
    
    @Override
    public String toString() {
        return this.name;
    }
}
