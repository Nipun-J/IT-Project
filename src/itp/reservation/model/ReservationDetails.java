/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package itp.reservation.model;

import java.util.Date;

/**
 *
 * @author SHADOWRATH
 */
public class ReservationDetails {

   
    
    public Date Checkin;
    public Date Checkout;
    
    
    public ReservationDetails(Date Checkin, Date Checkout) {
        this.Checkin = Checkin;
        this.Checkout = Checkout;
    
    }
    
     public ReservationDetails(){
     
     }
     
      public Date getCheckin() {
        return Checkin;
    }

    public Date getCheckout() {
        return Checkout;
    }
    
     public void setCheckin(Date Checkin) {
        this.Checkin = Checkin;
    }

    public void setCheckout(Date Checkout) {
        this.Checkout = Checkout;
    }
     
     
    
}
