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
    
    private Connection connection = DBConnection.getDbConnection();
    
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
