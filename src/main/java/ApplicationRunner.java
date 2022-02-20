import models.CarteFidelio;
import models.Facture;
import models.Promotion;
import presentation.ClientController;
import models.Client;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.Arrays;
import java.util.List;

public class ApplicationRunner {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
        ClientController ctrl = (ClientController) context.getBean("controller");
        Client client = new Client("Anass");

        List<Facture> factures=Arrays.asList(
                new Facture(1500,"facture1",client),new Facture(2000,"facture2",client)
        );
        client.setFactures(factures);
        List<Promotion> promotions=Arrays.asList(
                new Promotion("remise 10%"),new Promotion("solde 40%")
        );
        client.setPromotions(promotions);

        CarteFidelio carteFidelio=new CarteFidelio("A254202545");
        carteFidelio.setClient(client);
        client.setCarteFidelio(carteFidelio);

        ctrl.save(client);
    }
}