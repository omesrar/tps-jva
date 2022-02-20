package service;

import dao.IClientDao;
import dao.ClientDaoImpl;
import models.Client;

public class ClientServiceImpl implements IClientService{
    IClientDao dao ;


    public void setDao(IClientDao dao) {
        this.dao = dao;
    }

    public IClientDao getDao() {
        return dao;
    }

    @Override
    public Client save(Client c) {


        return  dao.save(c);
    }

    public Client modify(Client c) {
        return dao.update(c);
    }

    @Override
    public void removeById(long id) {
        dao.deleteById(id);

    }
    @Override
    public Client getById(long id) {
        return dao.findById(id);
    }
}