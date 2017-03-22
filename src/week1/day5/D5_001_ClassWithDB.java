package week1.day5;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class D5_001_ClassWithDB {
	
	public static void main(String[] args) throws SQLException {

			Connection myConn = null;
			Statement myStmt = null;
			ResultSet myRs = null;
			
			try {
				// 1. Get a connection to database
			myConn = DriverManager.getConnection(
					"jdbc:sqlserver://sql2k801.discountasp.net:1433;databaseName=SQL2008_841902_tr; user=SQL2008_841902_tr_user;password=52645264hrm;");
				
				System.out.println("Database connection successful!\n");
				
				// 2. Create a statement
				myStmt = myConn.createStatement();
				
				// 3. Execute SQL query
			myRs = myStmt.executeQuery("Select FirstSearchItem, SecondSearchItem from ECommerceShoppingCartTestData");
				
				// 4. Process the result set
				while (myRs.next()) {
				System.out.println(myRs.getString("FirstSearchItem") + ", " + myRs.getString("SecondSearchItem"));
				}
			}
			catch (Exception exc) {
				exc.printStackTrace();
			}
			finally {
				if (myRs != null) {
					myRs.close();
				}
				
				if (myStmt != null) {
				try {
					myStmt.close();
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				}
				
				if (myConn != null) {
					myConn.close();
				}
			}
		}

	}


