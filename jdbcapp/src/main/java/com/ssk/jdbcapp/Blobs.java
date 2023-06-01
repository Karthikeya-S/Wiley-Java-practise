package com.ssk.jdbcapp;
import java.sql.*;
import java.io.*;
public class Blobs {
	public static void writeBlob(int candidateId, String filename) throws FileNotFoundException, ClassNotFoundException {
        String query = "UPDATE candidates SET resume = ? WHERE id=?";
        Connection conn = null;
        PreparedStatement ps = null;
        try {
        	conn = DBConnection.createDBConnection();
            ps = conn.prepareStatement(query);
            File file = new File(filename);
            FileInputStream input = new FileInputStream(file);


            ps.setBinaryStream(1, input);
            ps.setInt(2, candidateId);

            System.out.println("Added file in the database");
            ps.executeUpdate();

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
	public static void main(String[] args) throws FileNotFoundException, ClassNotFoundException {
		String filePath = "C:/Users/kathi/Desktop/test.pdf";
        
        try (Connection connection = DBConnection.createDBConnection()) {
            String insertQuery = "INSERT INTO blob_table (blob_data) VALUES (?)";
            
            try (PreparedStatement statement = connection.prepareStatement(insertQuery)) {
                FileInputStream inputStream = new FileInputStream(filePath);
                statement.setBinaryStream(1, inputStream);
                
                statement.executeUpdate();
                
                inputStream.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
		writeBlob(1, "test_from_wileyjdbc.pdf");
	}
}
