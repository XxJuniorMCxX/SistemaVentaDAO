/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author XxJuniorMxX
 */
public class Conexion {

    public Connection conex;
    private String url = "jdbc:sqlserver://localhost:1433;databaseName=dbsistema;"
            + "trustServerCertificate=true";
    private String user = "sa";
    private String password = "juniorjm/3";

    public static Conexion instancia;

    private Conexion() {
        this.conex = null;
    }

    public Connection conectar() {
        try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            conex = DriverManager.getConnection(url, user, password);
            System.out.println("accedistes con exito");
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Error en la conexión");
            return null;
        }
        return conex;
    }

    public void desconectar() {
        try {
            conex.close();
        } catch (SQLException ex) {
            Logger.getLogger(Conexion.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    public synchronized static Conexion getInstancia() {
        if (instancia == null) {
            instancia = new Conexion();
        }
        return instancia;
    }
}

//public class Conexion {
//
//    private Connection cnn = null;
//
//    String url = "jdbc:sqlserver://localhost:1433;database=dbsistema";
//    String user = "sa";
//    String password = "juniorjm/3";
//
//    public Connection Conectarbd() {
//        try {
//            cnn = DriverManager.getConnection(url, user, password);
//            System.out.println("Conectado");
//        } catch (SQLException e) {
//            e.printStackTrace(System.err);
//            System.out.println(e.getMessage());
//            System.out.println("no se pudo realizar la conexion ");
//            // Manejo de errores
//        }
//        return cnn;
//    }
//}

