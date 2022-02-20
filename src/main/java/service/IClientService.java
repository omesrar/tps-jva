package service;


import models.Client;

public interface IClientService {

    Client save(Client c);
    Client modify(Client c);
    void removeById(long id);
    Client getById(long id);
}