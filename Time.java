/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mock_exam;

import java.util.ArrayList;

/**
 *
 * @author E7470
 */
public class Time {
    public int hour;
    public int minute;
    
    //creating the constructor
    public Time(int hour, int minute){
        this.hour = hour;
        this.minute = minute;
    }
    
    public String toString(){
        String st =" ";
        if (this.hour < 10){
            st += "0";
        }
        st += + this.hour +":";
        if (this.minute < 10){
            st += "0";
        }
        st  += this.minute;
        return st; 
    }
      
   public static void main(String[] args) {       
    }
    
} 
