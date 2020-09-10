/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package itp.reservation.model;

/**
 *
 * @author SHADOWRATH
 */
public class CustomerDetails {

    private String Cname;
    private String Cemail;
    private String Ccontact;

    public CustomerDetails(String Cname, String Cemail, String Ccontact) {
        this.Cname = Cname;
        this.Cemail = Cemail;
        this.Ccontact = Ccontact;
    }
    
    
     public String getCname() {
        return Cname;
    }

    public String getCemail() {
        return Cemail;
    }

    public String getCcontact() {
        return Ccontact;
    }
}
