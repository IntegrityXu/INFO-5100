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
public class TravelAgency {
    
    private ArrayList <AirLine> airlineList;
    private ArrayList <Customer> customerList;
    private ArrayList <Flight> masterFlightSchedule;
    
    public TravelAgency () {
        
        this.airlineList = new ArrayList<> ();
        this.customerList = new ArrayList<> ();
        this.masterFlightSchedule = new ArrayList<> ();
        
    }

    public ArrayList<AirLine> getAirlineList() {
        return airlineList;
    }

    public ArrayList<Customer> getCustomerList() {
        return customerList;
    }

    public ArrayList<Flight> getMasterFlightSchedule() {
        return masterFlightSchedule;
    }
    
    
    
    public AirLine AddAirLine() {
        AirLine al = new AirLine();
        this.airlineList.add(al);
        return al;
    }
    
    public AirLine SearchAirLine( String alName ) {
        for ( AirLine al : this.airlineList) {
            if ( alName.equals(al.getName()))
                return al;
        }
        return null;
    }
    
    public void DeleteAirLine ( AirLine al ) {
        this.airlineList.remove(al);
    }
    
    public Customer AddCostumer() {
        Customer cs = new Customer();
        this.customerList.add(cs);
        return cs;
    }
    
    public Customer SearchCustomer(int userID) {
        for ( Customer cs : this.customerList ) {
            if( cs.getUserID() == userID )
                return cs;
        }
        return null;
    }
    
    public void DeleteCustomer( Customer cs ) {
        this.customerList.remove(cs);
    }
    
    public Flight AddFlight() {
        Flight ft = new Flight();
        this.masterFlightSchedule.add(ft);
        return ft;
    }
    
    public Flight SearchFlight( int idNum ) {
        for (Flight fl : this.masterFlightSchedule) {
            if ( fl.getIdNumber() == idNum)
                return fl;
        }
        return null;
    }
    
    public void DeleteFlight( Flight ft ) {
        this.masterFlightSchedule.remove(ft);
    }
    
}
