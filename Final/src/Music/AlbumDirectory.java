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
public class AlbumDirectory {
    private List <Album> albumList;
    
    public AlbumDirectory() {
        albumList = new ArrayList<> ();
    }

    public List<Album> getAlbumList() {
        return albumList;
    }
    
    public boolean ContainsAlbum (Album album) {
        for (Album al : this.albumList) {
            if (al.equals(album))
                return true;
        }
        return false;
    }
    
    public int AddAlbum (Album album) {
        if (!this.ContainsAlbum(album)) {
            this.albumList.add(album);
            return 1;
        }
        return 0;
    }
    
    public int RemoveAlbum(Album album) {
        if (this.ContainsAlbum(album)) {
            this.albumList.remove(album);
            return 1;
        }
        return 0;
    }
    
}
