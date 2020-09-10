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
public class RoomReservation {

    private int roomNumber;
    private float price;
    private boolean status;

    public RoomReservation() {
    }

    public RoomReservation(int roomNumber, float price, boolean status) {
        this.roomNumber = roomNumber;
        this.price = price;
        this.status = status;
    }

    public RoomReservation(int roomNumber, boolean status) {
        this.roomNumber = roomNumber;
        this.status = status;
    }

    public int getRoomNumber() {
        return roomNumber;
    }

    public void setRoomNumber(int roomNumber) {
        this.roomNumber = roomNumber;
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
        hash = 37 * hash + this.roomNumber;
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
        final RoomReservation other = (RoomReservation) obj;
        if (this.roomNumber != other.roomNumber) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "RoomReservation{" + "roomNumber=" + roomNumber + ", price=" + price + ", status=" + status + '}';
    }

}
