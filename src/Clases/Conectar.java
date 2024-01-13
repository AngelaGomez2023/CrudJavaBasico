/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;

import java.sql.Connection;
import java.sql.DriverManager;
import org.w3c.dom.ls.LSOutput;

/**
 *
 * @author ag957
 */
public class Conectar {

    Connection cn;

    public Connection conexion() {

        try {
            Class.forName("com.mysql.jsbc.Driver");

            cn = DriverManager.getConnection("jdbc:mysql://localhost/bd", "root", "");

            System.out.println("conectado");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return cn;
    }

}
