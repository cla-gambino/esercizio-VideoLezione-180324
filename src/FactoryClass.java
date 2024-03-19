public class FactoryClass {

    public static Shape createShape(TipiDiShape tipodiShape) {
        if (tipodiShape == TipiDiShape.RETTANGOLO) {
            Rettangolo rettangolo = new Rettangolo();
            return rettangolo;
        }
        if (tipodiShape == TipiDiShape.CERCHIO) {
            Cerchio cerchio = new Cerchio();
            return cerchio;
        }
        return null;
    }


}