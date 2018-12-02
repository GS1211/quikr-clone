/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modal;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author manu1
 */
public class bajajDAO {
    
    public ArrayList<bajajinfo> getbike() {
        
        ArrayList<bajajinfo> a = new ArrayList<>();
        
        String url="jdbc:mysql://localhost:3306/quikr?useSSL=false";
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con=DriverManager.getConnection(url,"root","Macbookpro123#");
            PreparedStatement pstmt=con.prepareStatement("select *from bajaj;");
            
            ResultSet rs=pstmt.executeQuery();
            
            while(rs.next()) {
            
                bajajinfo c = new bajajinfo();
                
                c.car = rs.getString(1);
                
                c.price = rs.getString(2);
                
                a.add(c);
            }
            
            
            
        }
        catch(ClassNotFoundException | SQLException e)
        {
            System.out.println(e);
        } 
        
        return a;
    }
    
}
