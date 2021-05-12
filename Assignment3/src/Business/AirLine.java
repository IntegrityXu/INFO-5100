/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business;
import java.util.ArrayList;
/**
 *
 * @author xutao
 */
public class AirLine {
    
    private String name;
    private ArrayList <Airplane> fleet;
    private ArrayList <Flight> flightSchedule;
    
    public AirLine() {
        this.name = null;
        this.fleet = new ArrayList<> ();
        this.flightSchedule = new ArrayList<> ();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ArrayList<Airplane> getFleet() {
        return fleet;
    }

    public ArrayList<Flight> getFlightSchedule() {
        return flightSchedule;
    }
    
    
    
    public Airplane AddAirPlane () {
        Airplane al = new Airplane();
        this.fleet.add(al);
        return al;
    }
    
    public int FleetNumber() {
        return fleet.size();
    }
    
    public Airplane SearchAirplane (int serialNum) {
        for (Airplane ap : this.fleet) {
            if ( ap.getSerialNumber() == serialNum ) {
                return ap;
            }
        }
        return null;
    }
    
    public void DeleteAirplane (Airplane ap) {
        this.fleet.remove(ap);
    }
    
    public Flight AddFlight () {
        Flight flight = new Flight();
        this.flightSchedule.add(flight);
        return flight;
    }
    
    public Flight searchFlight (int idnumber) {
        for ( Flight ft : flightSchedule ) {
            if (ft.getIdNumber() == idnumber) 
                return ft;
        }
        return null;
    }
    
    public void DeleteFlight (Flight flight) {
        this.flightSchedule.remove(flight);
    }
    
    @Override
    public String toString() {
        return name;
    }
    
}
