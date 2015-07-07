package pl.btbw.shop;

import javax.enterprise.inject.Alternative;

@Alternative
public class RedShop implements ShopEngine {

    public String getName() {
        return "Red Shop";
    }
}
