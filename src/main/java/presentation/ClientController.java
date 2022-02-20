package presentation;

import models.Client;
import service.IClientService;

public class ClientController {
    IClientService service;

    public void setService(IClientService service) {
        this.service = service;
    }

    public IClientService getService() {
        return service;
    }


    public void save(Client c) {
        service.save(c);


    }
    public void modify(Client c){
        service.modify(c);
    }
    public void removeById(long id){
        service.removeById(id);
    }
    public Client getById(long id){
        return service.getById(id);
    }

}