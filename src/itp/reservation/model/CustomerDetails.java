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

    

    
    private String cid;
    private String Cname;
    private String Cemail;
    private String NIC;
    private int Ccontact;
    
    

    public CustomerDetails(String Cname, String Cemail,String NIC, int Ccontact) {
        this.Cname = Cname;
        this.Cemail = Cemail;
        this.NIC = NIC;
        this.Ccontact = Ccontact;
    }

    public CustomerDetails() {
   //     throw new UnsupportedOperationException("Not supported yet. Provide information in the constructor in Cname, Cemail, NIC, Ccontac order"); //To change body of generated methods, choose Tools | Templates.
    }
    
    
     public String getCname() {
        return Cname;
    }

    public String getCemail() {
        return Cemail;
    }
    
    public String getNIC() {
        return NIC;
    }

    public int getCcontact() {
        return Ccontact;
    }
    
    public String getCid() {
        return cid;
    }

    public void setCid(String cid) {
        this.cid = cid;
    }
    
    public void setCname(String Cname) {
        this.Cname = Cname;
    }

    public void setCemail(String Cemail) {
        this.Cemail = Cemail;
    }
    
    public void setNIC(String NIC) {
        this.NIC = NIC;
    }

    public void setCcontact(int Ccontact) {
        this.Ccontact = Ccontact;
    }
}
