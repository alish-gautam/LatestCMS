package CMS;

import java.sql.Connection;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.*;
public class Conn{
	Connection c;
	Statement s;
	Conn(){
		try {
			c=DriverManager.getConnection("jdbc:mysql:///courseManagementSystem","root","meswiz");
			s=c.createStatement();
			Statement s1=c.createStatement();
			Statement s2=c.createStatement();
		}
		catch(Exception e){
			System.out.println(e);
		}
	}

}
