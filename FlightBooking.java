/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mock_exam;

/**
 *
 * @author E7470
 */
public class FlightBooking extends Booking{
    public Airline airline;
    public String flight;
    public DateTime departure;
    public int DurationInMinute;
    public double price;
    
    public FlightBooking(String number, String customer, Airline airline, String flight, DateTime departure, int DurationInMinute, double price){
        super(number,customer);
        this.airline = airline;
        this.flight = flight;
        this.departure = departure;
        this.DurationInMinute = DurationInMinute;
        this.price = price;
    }

    @Override
    public double price() {
       return this.price;
    }
    
    public String toString(){
        String st = " ";
        st += super.toString();
        st += this.airline;
        st += "; departs at" + this.departure + ".";
        st += this.flight + " duration is  ";
        int hour = this.DurationInMinute/60;
        int minutes = this.DurationInMinute%60;
        
        st += hour + "hrs";
        st += minutes + "mins";
        
        st += "Price: " + this.price();
        
        return st;
    }
}
