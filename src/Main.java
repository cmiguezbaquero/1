import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
       /*
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

        if (descuento = true) {
            System.out.println(precio * 0.9 + "€");
        } else {
            System.out.println(precio);

        }

        String nombre1 = "Carol";
        System.out.println("Hola mi nombre es " + nombre1);

        int baseRectángulo = 8;
        int alturaRectángulo = 4;

        System.out.println(baseRectángulo * alturaRectángulo + "m²");

        int edad2 = 18;
        int edad3 = 40;

        if (edad2 < edad3) {
            System.out.println(edad3 + " es mayor");

        } else {
            System.out.println(edad2 + " es mayor");
        }

        int nota1 = 40;

        if (nota1 >= 60) {
            System.out.println("El examen está aprobado");

        } else {
            System.out.println("El examen está suspenso");

            int temperatura = 31;

            if (temperatura > 30) {
                System.out.println("Hace calor");

            } else {
                System.out.println("Clima agradable");

            }

            int numero = 0;

            if (numero > 0) {
                System.out.println("Es positivo");

            } else {
                System.out.println("Es negativo");

                if (numero == 0) {
                    System.out.println("Es cero");

                } else {
                }
            }

            int num1 = 24;
            int num2 = 100;
            int num3 = 20;

            if (num3 > num2 && num3 > num1) {
                System.out.println(num3 + " es mayor");

            } else if (num2 > num1 && num2 > num3) {
                System.out.println(num2 + " es mayor");

            } else {
                System.out.println(num1 + " es mayor");

            }

            int precio1 = 17;

            if (precio1 > 100) {
                System.out.println(precio1 * 0.8 + "€");
            } else {
                System.out.println(precio1 * 0.95 + "€");
            }


            boolean diafestivo = true;

            if (diafestivo = true) {
                System.out.println("Día libre");
            } else {
                System.out.println("Día laboral");
            }


            int f = 8;

            if (f >= 1 && f <= 10) {
                System.out.println("Está dentro del rango");
            } else {
                System.out.println("Está fuera del rango");
            }


            int saldo = 15;
            boolean habilitada = true;

            if (habilitada = true) {
                System.out.println("Puede hacer la transacción");
            } else {
                System.out.println("No puede hacer la transacción");
            }


            int nota2 = 40;
            boolean asistióclase = true;

            if (nota2 >= 60 && asistióclase == true) {
                System.out.println("Está aprobada");

            } else {
                System.out.println("No está aprobada");
            }


            String usuario = "Carolmguez";
            String contraseña = "1234";

            if (usuario == "Carolmguez" && contraseña == "1234") {
                System.out.println("Acceso permitido");
            } else {
                System.out.println("Acceso denegado");
            }

            int g = 1000;
            boolean tarjetacliente = false;

            if (g > 200 && tarjetacliente == false) {
                System.out.println(g * 0.85 + "€");

            } else if (g > 200 && tarjetacliente == true) {
                System.out.println(g * 0.8 + "€");

            } else {
                System.out.println(g + "€");
            }
        }

        int edad4 = 70;

        if (edad4 < 12) {
            System.out.println("Niño");

        } else {
        }

        if (edad4 >= 12 && edad4 <= 17) {
            System.out.println("Adolescente");

        } else {
        }

        if (edad4 >= 18 && edad4 <= 64) {
            System.out.println("Adulto");

        } else {

            if (edad4 > 65) {
                System.out.println("Adulto mayor");

            } else {
            }

        }


        int num2 = 50;

        if (num2 % 2 == 0 && num2 % 5 == 0) {
            System.out.println("El número es par y multiplo de 5");

        } else {
            System.out.println("No lo es");
        }

        String par2 = (num2 % 2 == 0) ? "Par " : "Impar ";
        String multiplo5 = (num2 % 5 == 0) ? "Multiplo 5" : "No multiplo 5";
        System.out.println(par2 + multiplo5);


        String contraseña1 = "24593@";

        if (contraseña1.contains("@") && contraseña1.length() >= 8) {
            System.out.println("Contraseña segura");

        } else {
            System.out.println("Contraseña insegura");
        }

        int h = 40;
        int i = 80;

        if (i > 0 && h > 0) {
            System.out.println("Ambos son postivos");

        } else if (i < 0 && i < 0) {
            System.out.println("Ambos son negativos");

        } else {
            System.out.println("Son diferentes");
        }

        int edad5 = 18;
        String resultado = (edad5 >= 18) ? "Mayor edad" : "Menor edad";
        System.out.println(resultado);

        Scanner sc = new Scanner(System.in);
        System.out.println("Ingresa una temperatura: ");
        int temperatura2 = sc.nextInt();
        String temp = (temperatura2 < 0) ? "Hace frío" : (temperatura2 > 30) ? "Hace calor" : "Templado";
        System.out.println(temp);


        System.out.println("Ingresa un color: ");
        sc.nextLine();
        String color = sc.nextLine();
        String col = (color.contains("rojo") || color.contains("azul") || color.contains("verde")) ? "Color primario" : "Otro color";
        System.out.println(col);


        System.out.println("Ingresa velocidad de un coche: ");
        int velocidad = sc.nextInt();
        String veloc = (velocidad > 120) ? "Multa" : "Velocidad correcta";
        System.out.println(veloc);


        System.out.println("Ingresa un animal: ");
        sc.nextLine();
        String animal = sc.nextLine();
        String anm = (animal.contains("perro") || animal.contains("gato")) ? "Domestico" : (animal.contains("tigre") || animal.contains("leon")) ? "Salvaje" : "No clasificado";
        System.out.println(anm);


        System.out.println("Ingresa edad: ");
        int edad6 = sc.nextInt();
        String ed = (edad6 < 12) ? "No puede entar" : (edad6 >= 12 && edad6 <= 17) ? "Necesita un adulto para entrar" : "Puede entrar solo";
        System.out.println(ed);


        System.out.println("Ingresa un color: ");
        sc.nextLine();
        String color1 = sc.nextLine();
        String col1 = (color1.contains("rojo")) ? "DETENTE" : (color1.contains("amarillo")) ? "PRECAUCION" : (color1.contains("verde")) ? "AVANZA" : "Error";
        System.out.println(col1);


        System.out.println("Ingresa un número secreto: ");
        int numsecreto = sc.nextInt();
        String secret = (numsecreto > 15) ? "Menor" : (numsecreto < 15) ? "Mayor" : "Acerto";
        System.out.println(secret);


        System.out.println("Ingresa la primera palabra: ");
        sc.nextLine();
        String palabra1 = sc.nextLine();
        System.out.println("Ingresa la segunda palabra: ");
        String palabra2 = sc.nextLine();
        String pal = (palabra1.equals(palabra2)) ? "Coinciden" : "No coinciden";
        System.out.println(pal);

*/
        Scanner sc = new Scanner(System.in);
        int votosA = 0;
        int votosB = 0;
        int votosC = 0;

        System.out.println("Primer voto: ");
        String voto1 = sc.nextLine();
        if (voto1.equals("A")) {
            votosA++;
        } else if (voto1.equals("B")) {
            votosB++;
        } else {
            votosC++;


        }
        System.out.println("Segundo voto: ");
        String voto2 = sc.nextLine();

        if (voto2.equals("A")) {
            votosA++;
        } else if (voto2.equals("B")) {
            votosB++;
        } else {
            votosC++;
        }

        System.out.println("Tercer voto: ");
        String voto3 = sc.nextLine();

        if (voto3.equals("A")) {
            votosA++;
        } else if (voto3.equals("B")) {
            votosB++;
        } else {
            votosC++;
        }

        System.out.println("Votos de A: " + votosA);
        System.out.println("Votos de B: " + votosB);
        System.out.println("Votos de C: " + votosC);

       if (votosA > votosB && votosA > votosC) {
           System.out.println("Gana A");
       }else if(votosB > votosA && votosB > votosC) {
           System.out.println("Gana B");
       }else if (votosC > votosA && votosC > votosB) {
           System.out.println("Gana C");
       }else{
           System.out.println("Empate");
       }
        sc.close();


    }
}









