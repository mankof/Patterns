package manko.patterns.facade.shape;

/**
 * Created by Sergej on 20.02.2016.
 */
public class ShopKeeper {
    private MobileShop iphone;
    private MobileShop samsung;

    public ShopKeeper(){
        iphone= new Iphone();
        samsung=new Samsung();
    }
    public void iphoneSale(){
        iphone.modelNo();
        iphone.price();
    }
    public void samsungSale(){
        samsung.modelNo();
        samsung.price();
    }
}
