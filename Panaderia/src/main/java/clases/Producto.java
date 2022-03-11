/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clases;


public class Producto {
    private String id;
    private String NomProducto;
    private double precio;
    private int cantidad;
    private String fechaFabricacion ;
    private String fechaCad;
    private String descripcion;

   

    public Producto() {
    this.id="";
    this.NomProducto="";
    this.precio=0.0;
    this.cantidad=0;
    this.fechaFabricacion="";
    this.fechaCad="";
    this.descripcion="";
    
    }

    public Producto(String id, String NomProducto, double precio, int cantidad, String fechaFabricacion, String fechaCad, String descripcion) {
        this.id = id;
        this.NomProducto = NomProducto;
        this.precio = precio;
        this.cantidad = cantidad;
        this.fechaFabricacion = fechaFabricacion;
        this.fechaCad = fechaCad;
        this.descripcion = descripcion;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNomProducto() {
        return NomProducto;
    }

    public void setNomProducto(String NomProducto) {
        this.NomProducto = NomProducto;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public String getFechaFabricacion() {
        return fechaFabricacion;
    }

    public void setFechaFabricacion(String fechaFabricacion) {
        this.fechaFabricacion = fechaFabricacion;
    }

    public String getFechaCad() {
        return fechaCad;
    }

    public void setFechaCad(String fechaCad) {
        this.fechaCad = fechaCad;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    

  
 
    
    
}
