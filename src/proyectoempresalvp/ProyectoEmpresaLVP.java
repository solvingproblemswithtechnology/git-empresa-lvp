/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectoempresalvp;

import proyectoempresalvp.datos.FacturaExtra;
import proyectoempresalvp.datos.FacturaExtraDetalles;
import proyectoempresalvp.gestoras.GestoraBaseDatos;

/**
 *
 * @author Administrador
 */
public class ProyectoEmpresaLVP {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        
        GestoraBaseDatos.conectarBaseDatos();
        GestoraBaseDatos.insertarDatos(new FacturaExtraDetalles(0, 1, "hola", 1));
        GestoraBaseDatos.cerrarConexion();
    }
    
}
