/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clases;

/**
 *
 * @author mariu
 */
public class Validation {
    
    
    public static String comprobarString(Producto producto){
        
        
        String mensaje = "";
        
        if(producto.getId().equals("")){
            
            mensaje = "Debes introducir un valor para el id";
        }else if(producto.getNomProducto().equals(""))
        {
            mensaje = "Debes introducir un valor para el nombre";
        }
        
        return mensaje;
        
    }// fin comprobar
    
    
    public static String validarNombre(String NomProducto)
        {
        String mensaje = "";
        
        if(NomProducto.matches(".*\\d.*")){
            
            mensaje = "El nombre no debe contener numeros";
            
        }
        
        return mensaje;
        
    } // fin comprobar nombre
    }