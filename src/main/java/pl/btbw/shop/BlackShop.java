package pl.btbw.shop;

import javax.enterprise.inject.Alternative;

@Alternative
public class BlackShop implements ShopEngine {

    public String getName() {
        return "Black Shop";
    }
}
