package com.jmunoz.sql;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;




public class Main {

	public static void main(String[] args) throws SQLException {
		Connection miConexion;
		miConexion = BaseDatos.GetConnection();
		ArrayList<Informes> informes = new ArrayList<>();
        if(miConexion!=null)
        {
        	try {
        		Statement stmt = miConexion.createStatement();
                ResultSet rs;
     
                rs = stmt.executeQuery("SELECT * FROM INFORMES");
                while ( rs.next() ) {
                	informes.add(new Informes(rs.getString("IDINFORME"), rs.getString("INFORME"), rs.getString("SECCION"), rs.getString("HREF")));
                }
                
			} catch (Exception e) {
				System.out.println(e.getMessage());
			} finally {
				miConexion.close();
			}
        }
        
        for (Informes inf : informes) {
			System.out.println("Id: " + inf.getId() + ",Informe: " + inf.getInforme() + ", Seccion: " + inf.getSeccion() + ", href: "+  inf.getHref());
		}

	}

}
