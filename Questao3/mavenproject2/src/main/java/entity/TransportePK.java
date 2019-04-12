package entity;

import java.io.Serializable;

public class TransportePK implements Serializable{
    
    private int codNavio;
    private int codCarga;
    private int codProduto;

    public int getNavio() {
        return codNavio;
    }

    public void setNavio(int navio) {
        this.codNavio = navio;
    }

    public int getCarga() {
        return codCarga;
    }

    public void setCarga(int carga) {
        this.codCarga = carga;
    }

    public int getProduto() {
        return codProduto;
    }

    public void setProduto(int produto) {
        this.codProduto = produto;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 17 * hash + this.codNavio;
        hash = 17 * hash + this.codCarga;
        hash = 17 * hash + this.codProduto;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final TransportePK other = (TransportePK) obj;
        if (this.codNavio != other.codNavio) {
            return false;
        }
        if (this.codCarga != other.codCarga) {
            return false;
        }
        if (this.codProduto != other.codProduto) {
            return false;
        }
        return true;
    }
    
}
