import java.util.Scanner;

public class MainFormas {

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        boolean seguir=true;

        do {
            int tipo;


                System.out.println(" ");
                System.out.println("Seleccione el tipo de forma: \n1:Triangulo. \n2: " + "Rectangulo. \n3: Circulo." + "\n4: Salir.");

                tipo = sc.nextInt();

                if (tipo < 1 || tipo > 4) {

                    System.out.println("Seleccione el tipo de forma: \n1:Triangulo. \n2: " + "Rectangulo. \n3: Circulo." + "\n4: Salir.");
                    tipo = sc.nextInt();

                }

                switch (tipo) {

                    case 1 -> {


                        System.out.println("Introduce el lado 1");
                        double lado1 = sc.nextDouble();
                        System.out.println("Introduce el lado 2");
                        double lado2 = sc.nextDouble();
                        System.out.println("Introduce el lado 3");
                        double lado3 = sc.nextDouble();
                        FormaFactory formaTri = new FormaFactory(lado1, lado2, lado3);

                    }
                    case 2 -> {

                        System.out.println("Introduce el lado 1");
                        double lado1 = sc.nextDouble();
                        System.out.println("Introduce el lado 2");
                        double lado2 = sc.nextDouble();
                        FormaFactory formaRec = new FormaFactory(lado1, lado2);

                    }

                    case 3 -> {

                        System.out.println("Introduce el radio");
                        double radio = sc.nextDouble();
                        FormaFactory formCir = new FormaFactory(radio);

                    }

                    case 4 -> {
                        System.out.println("Saliendo.");
                        seguir = false;
                    }
                }

        }while (seguir);
    }
}

