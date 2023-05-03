package org.jsanmarco.java.jdbc;

import util.ConexionBaseDeDatos;

import java.sql.*;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {

        try( Connection con =  ConexionBaseDeDatos.getConnection();
            Statement sts = con.createStatement();
            ResultSet resultado = sts.executeQuery("SELECT * FROM productos");) {

            while (resultado.next()){
                System.out.println(resultado.getString("nombre"));
            }

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

        System.out.println( "Fin!" );
    }
}
