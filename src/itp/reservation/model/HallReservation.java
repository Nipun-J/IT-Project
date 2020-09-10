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
public class HallReservation {

    
    private char hallName;
    private float price;
    private boolean status;
    
    public HallReservation() {
    }
    
    public HallReservation(char hallName, float price, boolean status) {
        this.hallName = hallName;
        this.status = status;
        
    }
    
    public HallReservation(char hallName, boolean status) {
        this.hallName = hallName;
        this.status = status;
    }

    public char getHallName() {
        return hallName;
    }

    public void setHallName(char hallName) {
        this.hallName = hallName;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 37 * hash + this.hallName;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final HallReservation other = (HallReservation) obj;
        if (this.hallName != other.hallName) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "HallReservation{" + "roomNumber=" + hallName + ", price=" + price + ", status=" + status + '}';
    }

    
}
