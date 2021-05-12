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
public class Customer {
    private int userID;
    private String name;
    private Flight flight;
    private int [] seat ;
    
    public Customer () {
        userID = 0;
        name = null;
        flight = new Flight();
        seat = new int[] {-1, -1};
    }

    public int getUserID() {
        return userID;
    }

    public void setUserID(int userID) {
        this.userID = userID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Flight getFlight() {
        return flight;
    }

    public void setFlight(Flight flight) {
        this.flight = flight;
    }

    public int[] getSeat() {
        return seat;
    }

    public void setSeat(int[] seat) {
        this.seat = seat;
    }
    
    @Override
    public String toString() {
        return this.name;
    }
    
    
}
