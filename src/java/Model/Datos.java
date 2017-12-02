/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author user
 */
@Entity
@Table(name = "datos", catalog = "local_licores", schema = "")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Datos.findAll", query = "SELECT d FROM Datos d")
    , @NamedQuery(name = "Datos.findByCodigo", query = "SELECT d FROM Datos d WHERE d.codigo = :codigo")
    , @NamedQuery(name = "Datos.findByPresentacion", query = "SELECT d FROM Datos d WHERE d.presentacion = :presentacion")
    , @NamedQuery(name = "Datos.findByDescripcion", query = "SELECT d FROM Datos d WHERE d.descripcion = :descripcion")
    , @NamedQuery(name = "Datos.findByPrecioCompra", query = "SELECT d FROM Datos d WHERE d.precioCompra = :precioCompra")
    , @NamedQuery(name = "Datos.findByPrecioVenta", query = "SELECT d FROM Datos d WHERE d.precioVenta = :precioVenta")
    , @NamedQuery(name = "Datos.findByCantidad", query = "SELECT d FROM Datos d WHERE d.cantidad = :cantidad")
    , @NamedQuery(name = "Datos.findByMarca", query = "SELECT d FROM Datos d WHERE d.marca = :marca")})
public class Datos implements Serializable {

    private static final long serialVersionUID = 1L;
    @Column(name = "Codigo")
    private Integer codigo;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 150)
    @Column(name = "Presentacion")
    private String presentacion;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 150)
    @Column(name = "Descripcion")
    private String descripcion;
    @Column(name = "Precio_Compra")
    private Integer precioCompra;
    @Column(name = "Precio_Venta")
    private Integer precioVenta;
    @Basic(optional = false)
    @NotNull
    @Column(name = "Cantidad")
    private int cantidad;
    @Id
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 150)
    @Column(name = "Marca")
    private String marca;

    public Datos() {
    }

    public Datos(String marca) {
        this.marca = marca;
    }

    public Datos(String marca, String presentacion, String descripcion, int cantidad) {
        this.marca = marca;
        this.presentacion = presentacion;
        this.descripcion = descripcion;
        this.cantidad = cantidad;
    }

    public Integer getCodigo() {
        return codigo;
    }

    public void setCodigo(Integer codigo) {
        this.codigo = codigo;
    }

    public String getPresentacion() {
        return presentacion;
    }

    public void setPresentacion(String presentacion) {
        this.presentacion = presentacion;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public Integer getPrecioCompra() {
        return precioCompra;
    }

    public void setPrecioCompra(Integer precioCompra) {
        this.precioCompra = precioCompra;
    }

    public Integer getPrecioVenta() {
        return precioVenta;
    }

    public void setPrecioVenta(Integer precioVenta) {
        this.precioVenta = precioVenta;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (marca != null ? marca.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Datos)) {
            return false;
        }
        Datos other = (Datos) object;
        if ((this.marca == null && other.marca != null) || (this.marca != null && !this.marca.equals(other.marca))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Model.Datos[ marca=" + marca + " ]";
    }
    
}
