/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mock_exam;

/**
 *
 * @author E7470
 */
public class Date {
    public int year;
    public int month;
    public int day;
    private static final int[] DAYS_IN_MONTH = {31,28,31,30,31,30,31,31,30,31,30,31};

    public Date(int year, int month, int day ){
        this.year = year;
        this.month = month;
        this.day = day;
        
    }
    
    public static int numofDays(int year, int month ){
        if (month == 2 && year %4 == 0){
            return 29;
        }    
        return DAYS_IN_MONTH[month-1];
    }
    
     public String toString(){
        String st =" ";
        st += this.year +"/";
        if(this.month <10){
            st += "0";
        }
        st += this.month +"/";
        if(this.day<10){
            st += "0";
        }
        st += this.day;
        return st; 
     }
     
     
}
