package entidades;
// Generated 11/10/2019 05:19:46 AM by Hibernate Tools 4.3.1



/**
 * Producto generated by hbm2java
 */
public class Producto  implements java.io.Serializable {


     private int idProducto;
     private int idMarca;
     private int idPresentacion;
     private int idProveedor;
     private int idZona;
     private int codigo;
     private String descripcionProducto;
     private double precio;
     private int stock;
     private int iva;
     private double peso;

    public Producto() {
    }

	
    public Producto(int idProducto, int idMarca, int idPresentacion, int idProveedor, int idZona, int codigo, double precio, int stock, int iva, double peso) {
        this.idProducto = idProducto;
        this.idMarca = idMarca;
        this.idPresentacion = idPresentacion;
        this.idProveedor = idProveedor;
        this.idZona = idZona;
        this.codigo = codigo;
        this.precio = precio;
        this.stock = stock;
        this.iva = iva;
        this.peso = peso;
    }
    public Producto(int idProducto, int idMarca, int idPresentacion, int idProveedor, int idZona, int codigo, String descripcionProducto, double precio, int stock, int iva, double peso) {
       this.idProducto = idProducto;
       this.idMarca = idMarca;
       this.idPresentacion = idPresentacion;
       this.idProveedor = idProveedor;
       this.idZona = idZona;
       this.codigo = codigo;
       this.descripcionProducto = descripcionProducto;
       this.precio = precio;
       this.stock = stock;
       this.iva = iva;
       this.peso = peso;
    }
   
    public int getIdProducto() {
        return this.idProducto;
    }
    
    public void setIdProducto(int idProducto) {
        this.idProducto = idProducto;
    }
    public int getIdMarca() {
        return this.idMarca;
    }
    
    public void setIdMarca(int idMarca) {
        this.idMarca = idMarca;
    }
    public int getIdPresentacion() {
        return this.idPresentacion;
    }
    
    public void setIdPresentacion(int idPresentacion) {
        this.idPresentacion = idPresentacion;
    }
    public int getIdProveedor() {
        return this.idProveedor;
    }
    
    public void setIdProveedor(int idProveedor) {
        this.idProveedor = idProveedor;
    }
    public int getIdZona() {
        return this.idZona;
    }
    
    public void setIdZona(int idZona) {
        this.idZona = idZona;
    }
    public int getCodigo() {
        return this.codigo;
    }
    
    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }
    public String getDescripcionProducto() {
        return this.descripcionProducto;
    }
    
    public void setDescripcionProducto(String descripcionProducto) {
        this.descripcionProducto = descripcionProducto;
    }
    public double getPrecio() {
        return this.precio;
    }
    
    public void setPrecio(double precio) {
        this.precio = precio;
    }
    public int getStock() {
        return this.stock;
    }
    
    public void setStock(int stock) {
        this.stock = stock;
    }
    public int getIva() {
        return this.iva;
    }
    
    public void setIva(int iva) {
        this.iva = iva;
    }
    public double getPeso() {
        return this.peso;
    }
    
    public void setPeso(double peso) {
        this.peso = peso;
    }




}


