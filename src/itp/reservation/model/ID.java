/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package itp.reservation.model;


import itp.reservation.DBConnection;
import java.util.ArrayList;
import java.sql.*;

/**
 *
 * @author SHADOWRATH
 */
public class ID {
    
    private static Connection connection = DBConnection.getDbConnection();
    private static Statement st = null;
    
    
    public static ArrayList<String> getCustomerIDs() {
				
				ArrayList<String> list = new ArrayList<String>();
				
				try {
				
                                    
                                    
				st = connection.createStatement();
				
				String sql = "select Cid from customer";
				ResultSet res = st.executeQuery(sql);
				
				while (res.next()) {
					list.add(res.getString(1)); 
				}
				
				} catch (Exception e) {
					e.printStackTrace();
				}
				return list; 
			}
			
           public static ArrayList<String> getReserveIDs() {
				
				ArrayList<String> list = new ArrayList<String>();
				
				try {
				
				st = connection.createStatement();
				
				String sql = "select recID from Reservation";
				ResultSet res = st.executeQuery(sql);
				
				while (res.next()) {
					list.add(res.getString(1)); 
				}
				
				} catch (Exception e) {
					e.printStackTrace();
				}
				return list; 
			}
    
    public static String generateIDs(ArrayList<String> arrayList, String prefix) {   //this method generates a unique ID
				
				String ID;
				int next = arrayList.size();
				next++;
				ID = prefix + next;
				if (arrayList.contains(ID)) {
					next++;
				 ID = prefix + next;  
				}
				
			return ID;  
			
			} 
    
}
