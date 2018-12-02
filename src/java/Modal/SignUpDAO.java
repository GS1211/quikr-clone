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

/**
 *
 * @author Gaurav
 */
public class SignUpDAO {
    
    public boolean SignUp(String userfname,String userlname, String password, String address, String useremail)
    {
        String url="jdbc:mysql://localhost:3306/quikr?useSSL=false";
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con=DriverManager.getConnection(url,"root","Macbookpro123#");
            PreparedStatement pstmt=con.prepareStatement("insert into qc values(?,?,?,?,?)");
            pstmt.setString(1,userfname);
            pstmt.setString(2,userlname);
            pstmt.setString(3,password);
            pstmt.setString(4,address);
            pstmt.setString(5,useremail);
            pstmt.executeUpdate();
            
            return true;
            
        }
        catch(ClassNotFoundException | SQLException e)
        {
            System.err.println(e);
        }
        return false;
    }
    
}
