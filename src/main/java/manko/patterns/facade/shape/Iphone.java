package manko.patterns.facade.shape;

/**
 * Created by Sergej on 20.02.2016.
 */
public class Iphone implements MobileShop {
    @Override
    public void modelNo() {
        System.out.println(" Iphone 6 ");
    }

    @Override
    public void price() {
        System.out.println(" Rs 65000.00 ");
    }
}
