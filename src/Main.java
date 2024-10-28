//Andrés Felipe Ortega Cárdenas

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        laptop lap1 = new laptop();

        lap1.setNombre("Victus");
        lap1.setMarca("HP");
        lap1.setPrecio(90999);
        lap1.setRAM("16GB");
        lap1.setProcesador("Amd 5000 series");
        lap1.setCantStock(5);

        celular cel1 = new celular();

        cel1.setNombre("Xia");
        cel1.setMarca("Xiaomi");
        cel1.setPrecio(750000);
        cel1.setCantStock(5);
        cel1.setCapBateria("60mhz");
        cel1.setCamResolucion("50mxp");

        Scanner teclado = new Scanner(System.in);


        int op = 0;

        System.out.println("1- Laptop");
        System.out.println("2- Celular");
        System.out.print("Que deseas comprar: ");
        op = teclado.nextInt();

        switch (op){
            case 1:
                System.out.println("1- Info de laptops");
                System.out.println("2- Comprar laptops");
                op = teclado.nextInt();

                switch (op){
                    case 1:
                        System.out.println(lap1.mostDetalles());
                        break;
                    case 2:
                        System.out.print("Cuantas laptops deseas comprar: ");
                        op = teclado.nextInt();

                        lap1.calPrecioVenta(op);

                        break;
                }
                break;
            case 2:
                System.out.println("1- Info de celulares");
                System.out.println("2- Comprar celulares");
                op = teclado.nextInt();

                switch (op){
                    case 1:
                        System.out.println(cel1.mostDetalles());
                        break;
                    case 2:
                        System.out.print("Cuantas laptops deseas comprar: ");
                        op = teclado.nextInt();

                        cel1.calPrecioVenta(op);

                        break;
                }
                break;
        }

    }
}