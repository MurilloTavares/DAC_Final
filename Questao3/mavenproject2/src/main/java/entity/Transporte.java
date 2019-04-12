package entity;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@IdClass(TransportePK.class)
public class Transporte implements Serializable {
    
    @Id
    @Column(insertable = false, updatable = false)
    private int codNavio;
    
    @Id
    @Column(insertable = false, updatable = false)
    private int codCarga;
    
    @Id
    @Column(insertable = false, updatable = false)
    private int codProduto;
    
    @Temporal(TemporalType.DATE)
    private Date data;
    
    private float valor;
    
    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "codNavio")
    private Navio navio;
    
    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "codCarga")
    private Carga carga;
    
    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "codProduto")
    private Produto produto;

    public Transporte() {
    }

    public int getCodNavio() {
        return codNavio;
    }

    public void setCodNavio(int codNavio) {
        this.codNavio = codNavio;
    }

    public int getCodCarga() {
        return codCarga;
    }

    public void setCodCarga(int codCarga) {
        this.codCarga = codCarga;
    }

    public int getCodProduto() {
        return codProduto;
    }

    public void setCodProduto(int codProduto) {
        this.codProduto = codProduto;
    }

    public Navio getNavio() {
        return navio;
    }

    public void setNavio(Navio navio) {
        this.navio = navio;
    }

    public Carga getCarga() {
        return carga;
    }

    public void setCarga(Carga carga) {
        this.carga = carga;
    }

    public Produto getProduto() {
        return produto;
    }

    public void setProduto(Produto produto) {
        this.produto = produto;
    }

    public Date getData() {
        return data;
    }

    public void setData(Date data) {
        this.data = data;
    }

    public float getValor() {
        return valor;
    }

    public void setValor(float valor) {
        this.valor = valor;
    }
    
}
