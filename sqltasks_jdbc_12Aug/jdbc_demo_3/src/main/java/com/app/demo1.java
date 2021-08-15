package com.app;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class demo1 {

	public static void main(String[] args) {

		Connection connection = null;
		try {
			// Step 1 - Load Driver
			Class.forName("com.mysql.cj.jdbc.Driver");
			System.out.println("Driver Loaded successfully");

			// Step 2 - Open Connection
			// urljdbc:mysql://localhost:3306/dbname
			String url = "jdbc:mysql://localhost:3306/tempdb";
			String username = "root";
			String password = "root"; // Give your DB username and Password
			connection = DriverManager.getConnection(url, username, password);
			System.out.println("Connection established");
			
			//Step 3 - Create Statement
			Statement statement=connection.createStatement();
			String sql="select * from favorite_movies order by year_of_release";
			
			//Step 4 - Execute Query
			ResultSet resultSet=statement.executeQuery(sql);
			System.out.println("Query executed successfully");
			
			//Step 5 - Process Results
			while(resultSet.next()) {
				System.out.print("Movie Name : "+resultSet.getString("movie_name"));
				System.out.print(" Genre : "+resultSet.getString("genre"));
				System.out.print(" Movie ID : "+resultSet.getInt("movie_id"));
				System.out.print(" Year of Release : "+resultSet.getInt("year_of_release"));
				System.out.println(" Critic Ratings : "+resultSet.getDouble("rating"));
			}
			
			//Insert
			
			String sql1="insert into favorite_movies(movie_name,genre,movie_id,year_of_release,rating) values('Rush Hour','Comedy',12345,2000,7.0)";
			int resultSet1=statement.executeUpdate(sql1);
			if(resultSet1==1) {
			resultSet=statement.executeQuery(sql);
			System.out.println("Insert Query executed successfully");
			while(resultSet.next()) {
				System.out.print("Movie Name : "+resultSet.getString("movie_name"));
				System.out.print(" Genre : "+resultSet.getString("genre"));
				System.out.print(" Movie ID : "+resultSet.getInt("movie_id"));
				System.out.print(" Year of Release : "+resultSet.getInt("year_of_release"));
				System.out.println(" Critic Ratings : "+resultSet.getDouble("rating"));
			}
			System.out.println("Insert Results Processed");
			}
		   //Update
			
			String sql2="update favorite_movies set genre='action' where movie_id=12345";
			int resultSet2=statement.executeUpdate(sql2);
			if(resultSet2==1){
			resultSet=statement.executeQuery(sql);
			System.out.println("Update Query executed successfully");
			while(resultSet.next()) {
				System.out.print("Movie Name : "+resultSet.getString("movie_name"));
				System.out.print(" Genre : "+resultSet.getString("genre"));
				System.out.print(" Movie ID : "+resultSet.getInt("movie_id"));
				System.out.print(" Year of Release : "+resultSet.getInt("year_of_release"));
				System.out.println(" Critic Ratings : "+resultSet.getDouble("rating"));
			}
			System.out.println("Update Results Processed");
			}
			
		} catch (ClassNotFoundException e) {
			System.out.println(e);
		} catch (SQLException e) {
			System.out.println(e);
		} finally {
			try {
				// Step 6 - Close connection
				connection.close();
				System.out.println("Connection closed");
			} catch (SQLException e) {
				System.out.println(e);
			}
		}

	}

}
