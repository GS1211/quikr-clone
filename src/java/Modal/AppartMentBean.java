package Modal;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;

public class AppartMentBean {
 String RoomId="0";
 String Email;
 String Address;
 String State;
 String Bedrooms;
 InputStream fin;
 public void setRoomId(String RoomId)
 {
     this.RoomId=RoomId;
 }
 public void setEmail(String Email)
 {
     this.Email=Email;
 }
 public void setAddress(String Address)
 {
     this.Address=Address;
 }
 public void setBedrooms(String bedrooms)
 {
     this.Bedrooms=bedrooms;
 }
 public void setState(String State)
 {
     this.State=State;
 }
 public void setImage(InputStream Imageid) throws FileNotFoundException
 {
     this.fin=Imageid;
 }
 public String getRoomId()
 {
     return this.RoomId;
 }
 public String getEmail()
 {
     return this.Email;
 }
 public String getAddress()
 {
     return this.Address;
 }
 public String getState()
 {
     return this.State;
 }
 public String getBedrooms()
 {
     return this.Bedrooms;
 }
 public InputStream getImage()
 {
     return this.fin;
 }
}
