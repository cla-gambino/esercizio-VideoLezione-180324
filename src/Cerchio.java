public class Cerchio implements Shape {
    @Override
    public void draw() {
        System.out.println("cerchio");

    }

    @Override
    public TipiDiShape getShape() {
        return TipiDiShape.CERCHIO;
    }

    @Override
    public String toString() {
        return "Cerchio";
    }
}