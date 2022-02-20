package presentation;

import models.Client;
import service.IClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller("controller")
public class ClientController {
    @Autowired
    IClientService IClientService;
    public ClientController(IClientService IClientService){
        this.IClientService = IClientService;
    }
    public Client save(Client c){
        return IClientService.save(c);
    }

    public IClientService getIClientService() {
        return IClientService;
    }
}