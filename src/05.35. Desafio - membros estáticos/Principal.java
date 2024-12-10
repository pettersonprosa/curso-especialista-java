public class Principal {

    public static void main(String[] args) {
        double areaQuadrado = FormasGeometricas.calculaAreaQuadrado(25.7);
        double areaCirculo = FormasGeometricas.calculaAreaCirculo(40.5);

        System.out.printf("A área do quadrado: %.3f%n", areaQuadrado);
        System.out.printf("A área do círculo: %.3f%n", areaCirculo);
    }
}