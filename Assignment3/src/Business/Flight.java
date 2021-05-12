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
public class Flight {
    private int idNumber;
    private String destination;
    private String departure;
    private int depDate;
    private int depTime;
    private Airplane airplane;
    private Seat seat;
    
    public Flight () {
        idNumber = 0;
        destination = null;
        departure = null;
        depDate = 0;
        depTime = 0;
        airplane = new Airplane();
        seat = new Seat();
    }

    public int getIdNumber() {
        return idNumber;
    }
    
    public void setIdNumber(int idNumber) {
        this.idNumber = idNumber;
    }

    public String getDestination() {
        return destination;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    public String getDeparture() {
        return departure;
    }

    public void setDeparture(String departure) {
        this.departure = departure;
    }

    public int getDepDate() {
        return depDate;
    }

    public void setDepDate(int depDate) {
        this.depDate = depDate;
    }

    public int getDepTime() {
        return depTime;
    }

    public void setDepTime(int depTime) {
        this.depTime = depTime;
    }

    public Airplane getAirplane() {
        return airplane;
    }

    public void setAirplane(Airplane airplane) {
        this.airplane = airplane;
    }

    public Seat getSeat() {
        return seat;
    }

    public void setSeat(Seat seat) {
        this.seat = seat;
    }

    
    public int getSeatNumber () {
        return this.seat.getAvailNum();
    }
    
    public int [][] getSeatLocation () {
        return this.seat.getLocation();
    }
    
    public void setSeatLocation (int row, int col) {
        this.seat.getLocation()[row][col] = 0;
        int num = this.seat.getAvailNum() -1 ;
        this.seat.setAvailNum(num);
    }
    
    public String getAroundTime() {
        if ( this.depTime < 900)
            return "morning";
        else if ( this.depTime > 900 && this.depTime < 1800)
            return "day";
        else if ( this.depTime >= 1800 )
            return "evening";
        else 
            return "wrong_time";
    }
    
    
    @Override
    public String toString(){
        return String.valueOf(this.idNumber);
    }
    
}
