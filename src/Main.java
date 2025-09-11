//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        String nombre = "Carolina";
        String edad = "22";

        System.out.println(nombre + edad);

        double Pi = 3.14;
        int radio = 4;
        System.out.println(Pi * radio);


        int a = 3;

        if (a > 0) {
            System.out.println("a es positivo");
        } else {
        }


        int b = 3;

        if (b > 0) {
            System.out.println("b es positivo");
        } else {
            System.out.println("b es negativo");
        }


        int nota = 80;

        if (nota >= 90) {
            System.out.println("La nota es sobresaliente");

        } else {


            if (nota < 90 && nota > 70) {
                System.out.println("La nota es aprobado");

            } else {


                if (nota < 70) {
                    System.out.println("La nota es reprobado");
                } else {
                }
            }
        }


        int c = 27;
        int d = 15;

        if (c > d) {
            System.out.println(c + " es mayor que " + d);

        } else {
            System.out.println(d + " es mayor que " + c);
        }


        int e = 31;
        int resto = e % 2;

        if (e % 2 == 0) {
            System.out.println("El número es par");

        } else {
            System.out.println("El número es impar");

        }

        int edad1 = 21;

        if (edad1 >= 18) {
            System.out.println("La persona es mayor de edad");

        } else {
            System.out.println("La persona es menor de edad");
        }

        int Día = 5;

        switch (Día) {
            case 1:
                System.out.println("Lunes");
                break;
            case 2:
                System.out.println("Martes");
                break;
            case 3:
                System.out.println("Miércoles");
                break;
            case 4:
                System.out.println("Jueves");
                break;
            case 5:
                System.out.println("Viernes");
                break;
            case 6:
                System.out.println("Sábado");
                break;
            case 7:
                System.out.println("Domingo");
                break;
            default:
                System.out.println("Error");

        }

        int precio = 12;
        boolean descuento = true;

        if (descuento = true){
            System.out.println(precio * 0.9 + "€");
            }else{
            System.out.println(precio);

            }

        String nombre1 = "Carol";
            System.out.println("Hola mi nombre es " + nombre1);

        int baseRectángulo = 8;
        int alturaRectángulo = 4;

        System.out.println(baseRectángulo*alturaRectángulo + "m²");

        int edad2 = 18;
        int edad3 = 40;

        if (edad2 < edad3) {
            System.out.println(edad3 + " es mayor");

        }else{
            System.out.println(edad2 + " es mayor");
        }

        int nota1 = 40;

        if ( nota1 >= 60) {
            System.out.println("El examen está aprobado");

        }else {
            System.out.println("El examen está suspenso");

        int temperatura = 31;

        if (temperatura > 30) {
             System.out.println("Hace calor");

        } else {
             System.out.println("Clima agradable");

        }

        int numero = 0;

        if (numero > 0){
            System.out.println("Es positivo");

        }else{
            System.out.println("Es negativo");

        if (numero == 0){
             System.out.println("Es cero");

        }else{
        }
        }

        int num1 = 24;
        int num2 = 100;
        int num3 = 20;

        if (num3 > num2 && num3 > num1){
              System.out.println(num3 + " es mayor");

        }else if (num2 > num1 && num2 > num3){
               System.out.println(num2 + " es mayor");

        }else{
               System.out.println(num1 + " es mayor");

        }






        }











        }


    }






