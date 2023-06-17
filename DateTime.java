/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mock_exam;

/**
 *
 * @author E7470 
 */
public class DateTime {
    public Date date;
    public Time time;
    
    public DateTime(Date date, Time time){
        this.date = date;
        this.time = time;
    }
    
    public String toString(){
       
        return this.date.toString() + " and  " + this.time.toString();
    }
}
 