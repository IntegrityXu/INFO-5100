/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business;

/**
 *
 * @author xutao
 */
public class Seat {
    
    private int availNum;
    private int location[][];
    
    public Seat () {
        this.availNum = 150;
        location = new int [25][6];
        for (int i = 0; i < 25; i ++) {
            for (int j = 0; j < 6; j++)
                location[i][j] = 1;
        }
    }

    public int getAvailNum() {
        return availNum;
    }

    public void setAvailNum(int availNum) {
        this.availNum = availNum;
    }

    public int[][] getLocation() {
        return location;
    }

    public void setLocation(int i1, int i2) {
        location[i1][i2] = 0;
        availNum --;
    }
    
    
    
    
}
