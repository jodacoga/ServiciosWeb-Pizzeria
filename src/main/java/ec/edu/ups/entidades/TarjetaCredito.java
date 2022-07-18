package ec.edu.ups.entidades;
import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;
import java.util.Date;

/**
 *
 * @author johan
 */
@Entity
public class TarjetaCredito {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int idTarjeta;
    private String numeroTarjeta;
    private Date fechaCa;
    private String codigoSegu;
    private String nombreTarj;

    @ManyToOne
    @JoinColumn
    @JsonIgnore
    private Cuenta cuenta;

    public TarjetaCredito() {
    }

    public TarjetaCredito(String numeroTarjeta, Date fechaCa, String codigoSegu, String nombreTarj, Cuenta cuenta) {
        this.numeroTarjeta = numeroTarjeta;
        this.fechaCa = fechaCa;
        this.codigoSegu = codigoSegu;
        this.nombreTarj = nombreTarj;
        this.cuenta = cuenta;
    }

    public int getIdTarjeta() {
        return idTarjeta;
    }

    public void setIdTarjeta(int idTarjeta) {
        this.idTarjeta = idTarjeta;
    }

    public String getNumeroTarjeta() {
        return numeroTarjeta;
    }

    public void setNumeroTarjeta(String numeroTarjeta) {
        this.numeroTarjeta = numeroTarjeta;
    }

    public Date getFechaCa() {
        return fechaCa;
    }

    public void setFechaCa(Date fechaCa) {
        this.fechaCa = fechaCa;
    }

    public String getCodigoSegu() {
        return codigoSegu;
    }

    public void setCodigoSegu(String codigoSegu) {
        this.codigoSegu = codigoSegu;
    }

    public String getNombreTarj() {
        return nombreTarj;
    }

    public void setNombreTarj(String nombreTarj) {
        this.nombreTarj = nombreTarj;
    }

    public Cuenta getCuenta() {
        return cuenta;
    }

    public void setCuenta(Cuenta cuenta) {
        this.cuenta = cuenta;
    }

    @Override
    public String toString() {
        return "TarjetaCredito{" +
                "idTarjeta=" + idTarjeta +
                ", numeroTarjeta='" + numeroTarjeta + '\'' +
                ", fechaCa=" + fechaCa +
                ", codigoSegu='" + codigoSegu + '\'' +
                ", nombreTarj='" + nombreTarj + '\'' +
                '}';
    }
}

