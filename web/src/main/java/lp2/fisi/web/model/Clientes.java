package lp2.fisi.web.model;

import org.hibernate.annotations.SQLDelete;
import org.hibernate.annotations.Where;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="clientes")
@SQLDelete(sql = "UPDATE clientes SET estado=0 WHERE idclientes=?")
@Where(clause = "estado=1")

public class Clientes {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idcliente;
    private String nombres;
    private String apellidos;
    private String numerodocumento;
    private String direccion;
    private String telefono;
    private String email;
    private Integer estado=1;
    public Integer getIdcliente() {
        return idcliente;
    }
    public void setIdcliente(Integer idcliente) {
        this.idcliente = idcliente;
    }
    public String getNombres() {
        return nombres;
    }
    public void setNombres(String nombres) {
        this.nombres = nombres;
    }
    public String getApellidos() {
        return apellidos;
    }
    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }
    public String getNumerodocumento() {
        return numerodocumento;
    }
    public void setNumerodocumento(String numerodocumento) {
        this.numerodocumento = numerodocumento;
    }
    public String getDireccion() {
        return direccion;
    }
    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }
    public String getTelefono() {
        return telefono;
    }
    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public Integer getEstado() {
        return estado;
    }
    public void setEstado(Integer estado) {
        this.estado = estado;
    }
    @Override
    public String toString() {
        return "Clientes [idcliente=" + idcliente + ", nombres=" + nombres + ", apellidos=" + apellidos
                + ", numerodocumento=" + numerodocumento + ", direccion=" + direccion + ", telefono=" + telefono
                + ", email=" + email + ", estado=" + estado + "]";
    }
    
}
