package entity;

import java.io.Serializable;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;

@Entity
public class Navio implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int cod;
    
    private String nome;
    private String pais;
    
    private int capacidade;
    
    @OneToOne(mappedBy = "navio", cascade = CascadeType.ALL, orphanRemoval = true)
    private Transporte transporte;

    @ManyToOne(cascade = CascadeType.ALL)
    private Comandante comandante;
    
    public Navio() {
    }

    public int getCod() {
        return cod;
    }

    public void setCod(int cod) {
        this.cod = cod;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public int getCapacidade() {
        return capacidade;
    }

    public void setCapacidade(int capacidade) {
        this.capacidade = capacidade;
    }
    
    public int getId() {
        return cod;
    }

    public void setId(int id) {
        this.cod = cod;
    }

    public Comandante getComandante() {
        return comandante;
    }

    public void setComandante(Comandante comandante) {
        this.comandante = comandante;
    }

    public Transporte getTransporte() {
        return transporte;
    }

    public void setTransporte(Transporte transporte) {
        this.transporte = transporte;
    }
    
}
