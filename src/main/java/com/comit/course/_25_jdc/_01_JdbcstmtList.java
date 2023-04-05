package com.comit.course._25_jdc;
import java.sql.Connection;
import java.util.List;

import com.comit.course._25_jdc_user.User;

import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Date;

public class _01_JdbcstmtList {

	public static void main(String[] args) {
		String dbUrl="jdbc:mysql://localhost:3306/userdb";
		String dbUsername="root";
		String dbPassword="Sai08deepu!";
		List<User> users=new ArrayList<>();
		//Connection con=null;
		String sql="SELECT * FROM USER";
		try(Connection con=DriverManager.getConnection(dbUrl,dbUsername,dbPassword);
				Statement st=con.createStatement();
				ResultSet rs=st.executeQuery(sql);) {
			
			while(rs.next()) {
				int idUser=rs.getInt("ID_USER");
				String firstName=rs.getString("FIRST_NAME");
				String lastName=rs.getString("LAST_NAME");
				String username=rs.getString("USERNAME");
				String password=rs.getString("PASSWORD");
				Date birth=rs.getDate("BIRTH");
				String status=rs.getString("STATUS");
				System.out.println(idUser +" "+firstName+" "+lastName+" "+username+" "+password+" " +birth+" "+status);
			}
			
			System.out.println("connection successful!");
		}catch (SQLException e) {
			System.err.println("error");
			e.printStackTrace();
		}
	}

}                                     
