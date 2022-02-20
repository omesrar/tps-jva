package dao;

import models.Client;
import org.springframework.stereotype.Repository;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

@Repository
public class ClientDaoImpl implements IClientDao {
    @PersistenceContext
    private EntityManager em;



    @Override
    public Client save(Client c) {
        em.merge(c);
        return null;
    }

    public ClientDaoImpl(){
        System.out.println("creation bean dao");
    }

}