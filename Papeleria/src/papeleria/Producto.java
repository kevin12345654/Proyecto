/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package papeleria;

/**
 *
 * @author kevin
 */
 public class Producto {
    
    public static String marca;
    public static int precio;
    public static String tipo;
    public static int cantidad;
    public static String tamaño;
    public static int n_colores;
    public static String  color;
    public static String t_pasta;

    public Producto(String m, int p, String chic, int nc) {
           
            marca = m;
            precio = p;
            tamaño = chic;
            n_colores = nc;
            
    }
  
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    public String desplegarMarca() {
        return marca;
    }

    public void almacenarMarca(String marca) {
        this.marca = marca;
    }

    public int desplegarPrecio() {
        return precio;
    }

    public void almacenarPrecio(int precio) {
        this.precio = precio;
    }

    public String desplegarTipo() {
        return tipo;
    }

    public void almacenarTipo(String tipo) {
        this.tipo = tipo;
    }

    public int desplegarCantidad() {
        return cantidad;
    }

    public void almacenarCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public String desplegarTamaño() {
        return tamaño;
    }

    public void almacenarTamaño(String tamaño) {
        this.tamaño = tamaño;
    }

    public int desplegarN_colores() {
        return n_colores;
    }

    public void almacenarN_colores(int n_colores) {
        this.n_colores = n_colores;
    }

    public String desplegarColor() {
        return color;
    }

    public void almacenarColor(String color) {
        this.color = color;
    }

    public String desplegarT_pasta() {
        return t_pasta;
    }

    public void almacenarT_pasta(String t_pasta) {
        this.t_pasta = t_pasta;
    }
    
}
