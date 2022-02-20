package service;

import dao.IClientDao;
import models.Client;

public interface IClientService {
    public Client save(Client c);
    public IClientDao getIClientDao();
}