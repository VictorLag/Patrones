public class formaTriangulo implements Forma{

    private double lado1;
    private double lado2;
    private double lado3;


    public formaTriangulo(double lado1, double lado2, double lado3) {

        this.lado1=lado1;
        this.lado2=lado2;
        this.lado3=lado3;

   }


    @Override
    public double perimetroCalc() {

        double perimetro= lado1+lado2+lado3;

        return perimetro;

    }
    @Override
    public double areaCalc() {

        double S= (lado1+lado2+lado3)/2;
        double Area= Math.sqrt(S*(S-lado1)*(S-lado2)*(S-lado3));

        return Area;
    }
}
