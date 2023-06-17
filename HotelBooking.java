/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mock_exam; 

/**
 *
 * @author E7470
 */
public class HotelBooking extends Booking{
    public String hotel;
    public Date checkin;
    public int duration;
    public double costPerDay;
    
    public HotelBooking(String number, String customer, String hotel, Date checkin, int duration, double costPerDay){
       super(number, customer);
       this.hotel = hotel;
       this.checkin = checkin;
       this.duration = duration;
       this.costPerDay = costPerDay;
       }

 
    
    @Override
    public double price() {
        double total = this.duration * costPerDay;
       if (this.duration > 5){
           total = 0.9 * total;
       }
       return total;
    }
    
    public Date getCheckOut(){
        int endDay = this.checkin.day + duration;
        int endMonth = this.checkin.month;
        int endYear = this.checkin.year;
        
        if (endDay > Date.numofDays(endYear, endMonth)){
            endDay = endDay - Date.numofDays(endYear, endMonth);
            endMonth++;
        }
        
        if (endMonth>12){
             endMonth -= 12;
            endYear++;
        }
        return new Date(endYear,endMonth,endDay);
    }
    
    
       public String toString(){
        String st = " ";
        st += super.toString();
        st += this.hotel;
        st += this.checkin;
        st += this.getCheckOut().toString();
        st += "(Price: " + this.price()+ ")";
        return st;
               
    }
}

  