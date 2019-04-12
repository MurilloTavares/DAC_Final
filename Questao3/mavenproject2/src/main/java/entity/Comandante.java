package entity;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import java.util.List;
import javax.persistence.CascadeType;

@Entity
public class Comandante implements Serializable {
    
    @Id
    @GeneratedValue
    private int cod;
    
    private String nome;
    private String destino;
    
    @OneToMany(mappedBy = "comandante", cascade = CascadeType.ALL )
    private List<Navio> navios;

    public Comandante() {
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

    public String getDestino() {
        return destino;
    }

    public void setDestino(String destino) {
        this.destino = destino;
    }

    public List<Navio> getNavios() {
        return navios;
    }

    public void setNavios(List<Navio> navios) {
        this.navios = navios;
    }
    
}
