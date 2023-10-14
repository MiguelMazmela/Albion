/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Variables;

import javax.swing.ImageIcon;

/**
 *
 * @author miguel
 */
public class Ingredientes {
    private String codigo;
    private String nombre;
    private String codigo_proveedor;
    private ImageIcon imagen;
    private String unidad_de_compra;
    private String unidad_de_uso;
    private int factor_compra;
    private int factor_uso;
    private long precio;

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCodigo_proveedor() {
        return codigo_proveedor;
    }

    public void setCodigo_proveedor(String codigo_proveedor) {
        this.codigo_proveedor = codigo_proveedor;
    }

    public ImageIcon getImagen() {
        return imagen;
    }

    public void setImagen(ImageIcon imagen) {
        this.imagen = imagen;
    }

    public String getUnidad_de_compra() {
        return unidad_de_compra;
    }

    public void setUnidad_de_compra(String unidad_de_compra) {
        this.unidad_de_compra = unidad_de_compra;
    }

    public String getUnidad_de_uso() {
        return unidad_de_uso;
    }

    public void setUnidad_de_uso(String unidad_de_uso) {
        this.unidad_de_uso = unidad_de_uso;
    }

    public int getFactor_compra() {
        return factor_compra;
    }

    public void setFactor_compra(int factor_compra) {
        this.factor_compra = factor_compra;
    }

    public int getFactor_uso() {
        return factor_uso;
    }

    public void setFactor_uso(int factor_uso) {
        this.factor_uso = factor_uso;
    }

    public long getPrecio() {
        return precio;
    }

    public void setPrecio(long precio) {
        this.precio = precio;
    }
    
    
}
