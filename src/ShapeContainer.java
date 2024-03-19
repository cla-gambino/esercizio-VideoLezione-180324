import java.util.ArrayList;
import java.util.List;

public class ShapeContainer {

    List<Shape> shapeList = new ArrayList<>();

    public ShapeContainer() {
        createShape();
    }

    private void createShape() {
        for (int i = 0; i < 10; i++) {
            if (i % 2 == 0) {
                shapeList.add(new Rettangolo());
            } else {
                shapeList.add(new Cerchio());
            }
        }
    }

    public int shapeCounting(TipiDiShape tipiDiShape) {
        int counter = 0;
        for (Shape shape : shapeList) {
            if (shape.getShape() == tipiDiShape) {
                counter++;
            }
        }
        return counter;
    }

    public void addShape(TipiDiShape tipiDiShape) {
        shapeList.add(FactoryClass.createShape(tipiDiShape));
    }

    @Override
    public String toString() {
        return "ShapeContainer{" +
                "shapeList=" + shapeList +
                '}';
    }
}