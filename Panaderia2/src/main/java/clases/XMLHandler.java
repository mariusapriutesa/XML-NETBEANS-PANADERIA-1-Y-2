/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clases;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import com.sun.org.apache.xml.internal.serializer.OutputPropertiesFactory;
import java.io.File;
import java.util.ArrayList;
import java.util.HashSet;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.transform.OutputKeys;
import javax.xml.transform.Result;
import javax.xml.transform.Source;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
import org.w3c.dom.Attr;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.w3c.dom.Text;
import clases.Producto;

/**
 *
 * @author Rafa
 */
public class XMLHandler {
    /*-- Variable para almacenar el XML. El documento se carga una vez ejecutado
    el método loadXML --*/
    private static Document document;
    /*-- Método para cargar el archivo XML en la variable document
    Es el primer método a ejecutar para realizar cualquer operación
    con un documento XML --*/
    public static void loadXML(){
        try {
            File archivo = new File("src/main/java/resources/AlmacenPanaderia.xml");
            DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
            DocumentBuilder documentBuilder = dbf.newDocumentBuilder();
            document = documentBuilder.parse(archivo);
        }catch (Exception e){
            e.printStackTrace();
        }// Fin de try-catch
    } // Fin método loadXML
    
    /*-- Método para guardar el archivo XML si ha sido modificado --*/
    public static void saveXML(){
        try{
            Transformer transformer = TransformerFactory.newInstance().newTransformer();
            transformer.setOutputProperty(OutputKeys.INDENT, "yes");
            transformer.setOutputProperty(OutputPropertiesFactory.S_KEY_INDENT_AMOUNT, "4");
            Result output = new StreamResult(new File("src/main/java/resources/AlmacenPanaderia.xml"));
            Source input = new DOMSource(document);
            transformer.transform(input, output);
        }catch (Exception e){
            e.printStackTrace();
        } //Fin de try-catch
    } // Fin metodo saveXML
    
     public static void crearProducto(Producto producto){
    loadXML();
    Element root= document.getDocumentElement();
    Element eProducto=document.createElement("producto");
   
    Attr attr=document.createAttribute("id");
    attr.setValue(producto.getId());
    eProducto.setAttributeNode(attr);
    
    Attr attr1=document.createAttribute("NomProducto");
    attr1.setValue(producto.getNomProducto());
    eProducto.setAttributeNode(attr1);
    
    Attr attr2=document.createAttribute("precio");//****************************************************************************************************************
  attr2.setValue(String.valueOf(producto.getPrecio()));
    eProducto.setAttributeNode(attr2);
    
    Attr attr3=document.createAttribute("cantidad");
    attr3.setValue(String.valueOf(producto.getCantidad()));
    eProducto.setAttributeNode(attr3);
    
    Attr attr4=document.createAttribute("fechaFabricacion");
    attr4.setValue(producto.getFechaFabricacion());
    eProducto.setAttributeNode(attr4);
    
    Attr attr5=document.createAttribute("fechaCad");
    attr5.setValue(producto.getFechaCad());
    eProducto.setAttributeNode(attr5);
    
    Attr attr6=document.createAttribute("descripcion");
    attr6.setValue(producto.getDescripcion());
    eProducto.setAttributeNode(attr6);
    
    root.appendChild(eProducto);
    saveXML();
    
    }// Fin metodo craerUsuario
    
     public static ArrayList<Producto>obtenerLista(){
    ArrayList<Producto> listaProductos=new ArrayList<Producto>()  ;
       loadXML();
    
    NodeList nodeListProductos= document.getElementsByTagName("producto");
        for (int i = 0; i < nodeListProductos.getLength(); i++) {
            Node nodeProducto =nodeListProductos.item(i);
           
            if (nodeProducto.getNodeType()==Node.ELEMENT_NODE) {
                Element eProducto=(Element) nodeProducto;
                Producto producto= new Producto(eProducto.getAttribute("id"),
                eProducto.getAttribute("NomProducto"),
                        Double.parseDouble(eProducto.getAttribute("precio")),//*****************************************************************************************************************
                        Integer.parseInt(eProducto.getAttribute("cantidad")),
                        eProducto.getAttribute("fechaFabricacion"),
                        eProducto.getAttribute("fechaCad"),
                        eProducto.getAttribute("descripcion")
                        );
                 listaProductos.add(producto);
          
            }//fin if
            
        }//fin bucle for
    return listaProductos;
    
    }//fin metodo obtenerListaUsuario
     
     public static Producto buscrarProducto(String id){
     Producto p = new Producto();
     loadXML();
        
      NodeList nodeListProductos = document.getElementsByTagName("producto");
        for (int i = 0; i < nodeListProductos.getLength(); i++) {
            Node nodeProducto =nodeListProductos.item(i);
           
            if (nodeProducto.getNodeType()== Node.ELEMENT_NODE) {
                Element eProducto=(Element) nodeProducto;  
                
                if (eProducto.getAttribute("id").equals(id)) {
                p= new Producto(eProducto.getAttribute("id"),
                eProducto.getAttribute("NomProducto"),
                        Double.parseDouble(eProducto.getAttribute("precio")),//*****************************************************************************************************************
                        Integer.parseInt(eProducto.getAttribute("cantidad")),
                        eProducto.getAttribute("fechaFabricacion"),
                        eProducto.getAttribute("fechaCad"),
                        eProducto.getAttribute("descripcion") );
                break;
                }
            }//fin if
            
        }//fin bucle for
     
     
     return p;
     }//fin metodo buscarProducto
    
     public static boolean modificarProducto(Producto producto){
     boolean productoEncontrado =false;
     
     loadXML();
     
     NodeList nodeListProductos = document.getElementsByTagName("producto");
        for (int i = 0; i < nodeListProductos.getLength(); i++) {
            Node nodeProducto =nodeListProductos.item(i);
           
            if (nodeProducto.getNodeType()== Node.ELEMENT_NODE) {
                Element eProducto=(Element) nodeProducto;  
                
                if (eProducto.getAttribute("id").equals(producto.getId())) {
                    productoEncontrado =true;
                    eProducto.setAttribute("NomProducto", producto.getNomProducto());
                    eProducto.setAttribute("precio", String.valueOf(producto.getPrecio()));
                     eProducto.setAttribute("cantidad", String.valueOf(producto.getCantidad()));
                    eProducto.setAttribute("fechaFabricacion", producto.getFechaFabricacion());
                    eProducto.setAttribute("fechaCad", producto.getFechaCad());
                    eProducto.setAttribute("descripcion", producto.getDescripcion());
               
                }
            }//fin if
            
        }//fin bucle for
     
     saveXML();
     return productoEncontrado;
     
     }//Fin metodo modificarProducto
     
     public static boolean borrarProducto(String id){
     boolean productoEncontrado =false;
     
     loadXML();
      Element root= document.getDocumentElement();
     NodeList nodeListProductos = document.getElementsByTagName("producto");
        for (int i = 0; i < nodeListProductos.getLength(); i++) {
            Node nodeProducto =nodeListProductos.item(i);
           
            if (nodeProducto.getNodeType()== Node.ELEMENT_NODE) {
                Element eProducto=(Element) nodeProducto;  
                
                if (eProducto.getAttribute("id").equals(id)) {
                    productoEncontrado =true;
                   root.removeChild(nodeProducto);
                    break;
                }
            }//fin if
            
        }//fin bucle for
     
     saveXML();
     return productoEncontrado;
}}