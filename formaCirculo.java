public class formaCirculo implements Forma{

    private double radio;

    public formaCirculo (double radio){

        this.radio=radio;

    }

    public void setRadio(double radio) {
        this.radio = radio;
    }

    @Override
    public double perimetroCalc() {

        double perimetro= 2* Math.PI*radio;

        return perimetro;
    }

    @Override
    public double areaCalc() {

        double area= Math.PI*radio*radio;

        return area;
    }
}
