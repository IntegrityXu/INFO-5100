/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Music;
import java.util.List;
import java.util.ArrayList;

/**
 *
 * @author xutao
 */
public class SongDirectory {
    
    List <Song> songList;
    
    public SongDirectory() {
        songList = new ArrayList<> ();
    }

    public List<Song> getSongList() {
        return songList;
    }

    public int AddSong( Song song ) {
        if ( !ContainsSong(song)  ) {
            songList.add(song);
            return 1;
        }
        return 0;
    }
    
    public int RemoveSong ( int id ) {
        if (this.searchSong(id) != null) {
            for (Song song : this.songList) {
                if( song.getId() == id) {
                    this.songList.remove(song);
                    return 1;
                }
            }
        }
        return 0;
    }
    
    public boolean ContainsSong( Song song ) {
        for (Song s : this.songList) {
            if ( s.getId() == song.getId() || (s.getSingerid() == song.getSingerid() && s.getName().equals(song.getName())) ) {
                return true;
            }
           
        }
        return false;
    }
    public Song searchSong(int id) {
        for(Song s : songList) {
            if(s.getId() == id) {
                return s;
            }
        }
        return null;
    }
}
