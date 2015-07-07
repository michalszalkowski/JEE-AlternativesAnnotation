package pl.btbw;

import pl.btbw.shop.ShopEngine;

import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;

@Path("/")
public class App {

    @Inject
    private ShopEngine shopEngine;

    @GET
    public String testShop() {
        return shopEngine.getName();
    }

}
