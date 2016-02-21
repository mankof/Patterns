package manko.patterns.facade.shape;

/**
 * Created by Sergej on 20.02.2016.
 */
public class Circle implements Shape {

    @Override
    public void draw() {
        System.out.println("Circle::draw()");
        System.out.println("");
    }
}