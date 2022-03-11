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
    
    
    public static String validarCamposVacios(Producto producto,String NomProducto){
        
        
        String mensaje = "";
        
        if(producto.getId().equals("")){
            
            mensaje = "Debes introducir un valor para el id";
        }else if(producto.getNomProducto().equals(""))
        {
            mensaje = "Debes introducir un valor para el nombre";
        } else if(NomProducto.matches(".*\\d.*")){
            
            mensaje = "El nombre no debe contener numeros";
            
        }else if(producto.getPrecio()<=0)
        {
            mensaje = "Debes introducir un valor para el precio";
        }
        
        return mensaje;
        
    }// fin comprobar
    
    
  // fin comprobar nombre
    }