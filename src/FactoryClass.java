public class FactoryClass {

    public Shape createShape(TipiDiShape tipodiShape) {
        //System.out.println("questo è il: ");
        if (tipodiShape == TipiDiShape.RETTANGOLO) {
            Rettangolo rettangolo = new Rettangolo();
            //System.out.println("è un rettangolo");
            return rettangolo;
        }
        if (tipodiShape == TipiDiShape.QUADRATO) {
            Quadrato quadrato = new Quadrato();
            //System.out.println("è un quadrato");
            return quadrato;
        }
        return null;
    }


}