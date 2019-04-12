package dao;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

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
    
    
    
}
