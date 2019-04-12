package dao;

import entity.Comandante;
import entity.ConsultaVO;
import entity.Transporte;
import java.util.Date;
import java.util.List;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;

@Stateless
public class MyDAO {
    
    @PersistenceContext(unitName = "MyPU")
    private EntityManager em;
    
    public void init() {
        System.out.println("Testando banco...");
    }
    
    public void persist(Object t){
        em.persist(t);
    }
    
    // Questao 4: Letra A
    public List<ConsultaVO> listarNomePais(){
        String sql = "SELECT new ConsultaVO(c.nome, c.pais) "
                + "FROM Comandante c WHERE c.nome ilike :letra ";
        
        return em.createQuery(sql, ConsultaVO.class).getResultList();
    }
    
    // Questao 4: Letra B
    public List<Transporte> listarTransporte(){        
        return em.createNamedQuery("AcimaMedia", Transporte.class).getResultList();
    }
    
    // Questao 4: Letra C
    public List<Comandante> listarPelaData(){
        String sql = "SELECT c FROM Comandante c WHERE c.data = :data";
        TypedQuery<Comandante> query = em.createQuery(sql, Comandante.class);
        query.setParameter("data", new Date(1990, 06, 06));
        return query.getResultList();
    }
    
}
