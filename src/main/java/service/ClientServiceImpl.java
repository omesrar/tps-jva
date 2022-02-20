package service;

import models.Client;
import dao.IClientDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class ClientServiceImpl implements IClientService {
    @Autowired
    private IClientDao iClientDao;

    public ClientServiceImpl(){
        System.out.println("creation bean dao");
    }

    @Override
    public Client save(Client c) {
        return iClientDao.save(c);
    }

    public IClientDao getIClientDao() {
        return iClientDao;
    }
}