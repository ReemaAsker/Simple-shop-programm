
package theshopprogramm;

import java.io.IOException;
import java.sql.*;
//import net.ucanaccess.jdbc.*;


public class DBconnected {
     
    Connection  con = DriverManager.getConnection("jdbc:ucanaccess://DataBase.accdb");
    Statement statment = con.createStatement(1005, 1008);
    DBconnected() throws SQLException, IOException, ClassNotFoundException{
   
    try{
       Class.forName("net.ucanaccess.jdbc.UcanaccessDriver");
       String m="create table Reem("+"product product(50), "+
                "price float, "+
                "sum float"+
                ")";
 statment.executeUpdate(m);
        
    }catch(Exception e) {
            	e.printStackTrace();
        }    
    }
    public static void main( String[] args) throws SQLException, IOException, ClassNotFoundException{
       DBconnected db = new DBconnected();
      // db.createTable("rr");
    }
    
    public  void createTable(String table_name) throws SQLException{
       statment.executeUpdate("create table "+table_name+"("+"product varchar(50),"+ "price float,"+"date varchar(50),"+"PaymentStatus varchar(8),"+"sum float"+")");
    }
    public  void checkTable(String table_name) throws SQLException{
       statment.executeUpdate("create table "+table_name+"("+"product varchar(50),"+ "price float,"+"date varchar(50),"+"PaymentStatus varchar(8),"+"Sum float"+")");
    }
    public  void cleanTable(String table_name) throws SQLException{
       statment.executeUpdate("update "+table_name+" set product=’ ’, price=0.0 , PaymentStatus = ‘ ‘");
    }
    
    
    
}
