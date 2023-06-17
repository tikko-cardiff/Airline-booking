/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mock_exam;

import java.util.ArrayList;

public class Storage {
    private final ArrayList<Booking> bookings;
    
    public Storage(){
        this.bookings = new ArrayList();
    }
    public boolean find(Booking booking){
        return this.bookings.contains(booking);
    }
    
    public void add(Booking booking){
        if(!find(booking)){
            this.bookings.add(booking);
        }
    }
    public void delete(Booking booking){
        this.bookings.remove(booking);
    }
    
    public ArrayList<Booking>allBookings(){
        return this.bookings;
    }
    public ArrayList<Booking>gethotelBookings(){
        ArrayList<Booking> result = new ArrayList<>();
        for (Booking h : this.bookings){
            if(h instanceof HotelBooking){
                result.add(h);
            }
        }
        return result;
    }
        public ArrayList<Booking>getflightBookings(){
        ArrayList<Booking> result = new ArrayList<>();
        for (Booking f : this.bookings){
            if(f instanceof FlightBooking){
                result.add(f);
            }
        }
        return result;
    }
}

