package manko.patterns.facade.shape;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Sergej on 20.02.2016.
 */
public class Rectangle implements Shape {
    private List<String> list = new ArrayList<>();
    @Override
    public void draw() {
        System.out.println("Rectangle::draw()");
    }
}
