/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectoempresalvp.gestoras;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import proyectoempresalvp.datos.ArrayListDato;
import proyectoempresalvp.datos.Dato;
import proyectoempresalvp.datos.Empleado;
import static proyectoempresalvp.gestoras.GestoraDatos.*;

/**
 *
 * @author Oscar
 */
public class HiloActualizarDatos implements Runnable{

    
    private static ObservadorGestoraDatos observador;    
    private final int datoActualizar;
    
    public HiloActualizarDatos(int datoActualizar) {
        
        this.datoActualizar = datoActualizar;
    }

    @Override
    public void run() {
        
        if(datoActualizar == ACTUALIZAR_TODO || datoActualizar == ACTUALIZAR_EMPLEADOS)
            actualizarEmpleados();
    }

    private void actualizarEmpleados() {
       
        ArrayListDato<Dato> empleados = null;
         ResultSet empleadosComprobar = GestoraBaseDatos.ejecutarSentenciaQuery(GestoraBaseDatos.construyeSentenciaSelect(Empleado.getOrden(), Empleado.getTabla()));
        if (empleados == null) {
            empleados = new ArrayListDato();
        } else {
            empleados.clear();
        }
        
        Empleado empleadoActual;

        try {
            while (empleadosComprobar.next()) {

                empleadoActual = new Empleado(empleadosComprobar.getInt(1), empleadosComprobar.getInt(2), empleadosComprobar.getString(3), 
                        empleadosComprobar.getString(4),empleadosComprobar.getString(5),empleadosComprobar.getString(6),empleadosComprobar.getInt(7),
                        empleadosComprobar.getString(8),empleadosComprobar.getInt(9),empleadosComprobar.getInt(10),empleadosComprobar.getString(11),
                        empleadosComprobar.getString(12),empleadosComprobar.getString(13),empleadosComprobar.getInt(14),empleadosComprobar.getInt(15),"","");
                empleados.add(empleadoActual);
            }
        } catch (SQLException ex) {
            Logger.getLogger(GestoraTareas.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        GestoraDatos.dameGestora().put("EMPLEADOS", empleados);
        observador.avisar(datoActualizar);
    }    

    public static void setObservador(ObservadorGestoraDatos observador) {
        HiloActualizarDatos.observador = observador;
    }
    
}