/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mock_exam;

/**
 *
 * @author E7470
 */
public abstract class Booking {
    public String Number;
    public String Customer;
    
    
   public Booking(String number, String customer){
       this.Number= number;
       this.Customer = customer;
   }
   
   public String toString(){
       return this.Number + " - " + this.Customer;
   }
   
    public abstract  double price();
           
}
