public class FormaFactory {


    public FormaFactory (double lado1, double lado2, double lado3){

        formaTriangulo forTri=new formaTriangulo(lado1,lado2,lado3);
        System.out.println("Area = "+forTri.areaCalc());
        System.out.println("Perimetro = "+forTri.perimetroCalc());

    }

    public FormaFactory (double lado1, double lado2){

        formaRectangulo forRec= new formaRectangulo(lado1,lado2);
        System.out.println("Area = "+forRec.areaCalc());
        System.out.println("Perimetro = "+forRec.perimetroCalc());

    }

    public FormaFactory (double radio){

        formaCirculo forCir= new formaCirculo(radio);
        System.out.println("Area = "+forCir.areaCalc());
        System.out.println("Perimetro = "+forCir.perimetroCalc());

    }
}
