/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectoempresalvp.gestoras;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import proyectoempresalvp.datos.Dato;

/**
 *
 * @author Oscar
 */
public class GestoraBaseDatos {

    private static Connection conexion;
    private static Statement sentencia;

    public static boolean conectarBaseDatos() {

        try {

            Class.forName("net.ucanaccess.jdbc.UcanaccessDriver");
            GestoraBaseDatos.conexion = DriverManager.getConnection("jdbc:ucanaccess://../DataBase/BaseDeDatosLVP.accdb");
            if (sentencia == null) 
                sentencia = GestoraBaseDatos.conexion.createStatement();
            
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(GestoraBaseDatos.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        } catch (SQLException ex) {
            Logger.getLogger(GestoraBaseDatos.class.getName()).log(Level.SEVERE, null, ex);
        }

        return true;
    }

    public static void ejecutarSentencia(String textoSentencia) {

        try {
            if (sentencia == null) 
                sentencia = GestoraBaseDatos.conexion.createStatement();

            sentencia.executeUpdate(textoSentencia);
        } catch (SQLException ex) {
            Logger.getLogger(GestoraBaseDatos.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public static void cerrarConexion() {

        try {

            GestoraBaseDatos.sentencia.close();
            GestoraBaseDatos.conexion.commit();
            GestoraBaseDatos.conexion.close();
        } catch (SQLException ex) {
            Logger.getLogger(GestoraBaseDatos.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public static boolean insertarDatos(Dato d) {

        String[] claves = d.devuelveOrdenDeColumnas();

        if (!comprobarExiste(d, claves[0])) {

            StringBuilder textoSentencia = construyeSentencia(d, claves);
            GestoraBaseDatos.ejecutarSentencia(textoSentencia.toString());
            return comprobarExiste(d, claves[0]);
        }
        return false;
    }

    public static boolean comprobarExiste(Dato d, String primaryKey) {

        try {
            ResultSet rs = sentencia.executeQuery("Select " + primaryKey + " from " + d.devuelveNombreTablaDato()
                    + " where " + primaryKey + " = " + d.get(primaryKey));

            return rs.next();

        } catch (SQLException ex) {
            Logger.getLogger(GestoraBaseDatos.class.getName()).log(Level.SEVERE, null, ex);
        }

        return false;
    }

    private static StringBuilder construyeSentencia(Dato d, String[] claves) {
        StringBuilder textoSentencia = new StringBuilder("insert into ");
        textoSentencia.append(d.devuelveNombreTablaDato());
        textoSentencia.append("(");
        for (String clave : claves) {

            textoSentencia.append(clave).append(",");
        }
        textoSentencia.replace(textoSentencia.length() - 1, textoSentencia.length(), ")");
        textoSentencia.append(" VALUES(");
        for (String clave : claves) {

            Object rec = d.get(clave);
            if (rec instanceof String) {

                textoSentencia.append("'");
                textoSentencia.append(rec);
                textoSentencia.append("'");
            } else if (rec instanceof Integer) {

                textoSentencia.append(rec);
            } else if (rec instanceof Float) {

                textoSentencia.append(rec);
            }
            textoSentencia.append(" ,");
        }
        textoSentencia.replace(textoSentencia.length() - 2, textoSentencia.length(), ");");

        return textoSentencia;
    }
}
