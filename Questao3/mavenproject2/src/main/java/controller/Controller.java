package controller;

import dao.MyDAO;
import entity.Carga;
import entity.Comandante;
import entity.Navio;
import entity.Produto;
import entity.Transporte;
import java.util.Date;
import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

@ManagedBean
@RequestScoped
public class Controller {
    
    @EJB
    private MyDAO dao;
    
    public void init() {
        Carga carga = new Carga();
        carga.setOrigem("Cajazeiras");
        carga.setDestino("João Pessoa");
        
        Comandante jack = new Comandante();
        jack.setNome("Jack Sparrow");
        
        Navio navio = new Navio();
        navio.setComandante(jack);
        
        Transporte transporte = new Transporte();
        transporte.setCarga(carga);
        transporte.setNavio(navio);
        transporte.setValor(2500f);
        transporte.setProduto(new Produto());
        transporte.setData(new Date(2019, 10, 23));
        
        dao.persist(transporte);
    }
    
}
