public class formaRectangulo implements Forma{

    private double lado1;
    private double lado2;


    public formaRectangulo (double lado1, double lado2){

        this.lado1=lado1;
        this.lado2=lado2;
    }

    public void setLado1(double lado1) {
        this.lado1 = lado1;
    }

    public void setLado2(double lado2) {
        this.lado2 = lado2;
    }


    @Override
    public double perimetroCalc() {

        double perimetro= lado1*2+lado2*2;

        return perimetro;
    }

    @Override
    public double areaCalc() {

        double area=lado1*lado2;
        return area;
    }
}
