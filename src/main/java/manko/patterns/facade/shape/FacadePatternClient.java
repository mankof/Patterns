package manko.patterns.facade.shape;

/**
 * Created by Sergej on 20.02.2016.
 */
public class FacadePatternClient {
    public static void main(String[] args) {
        ShopKeeper sk=new ShopKeeper();
        sk.iphoneSale();
        sk.samsungSale();
    }
}
