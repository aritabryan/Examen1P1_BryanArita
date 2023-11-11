/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package examen1p1_bryanarita;

import java.util.Scanner;
import java.util.Random;

/**
 *
 * @author mlope
 */
public class Examen1P1_BryanArita {

    static Scanner duki = new Scanner(System.in);

    public static void main(String[] args) {
        Random duko = new Random();
        System.out.print("******MENU******\n[1]Fight or Flight \n[2]Tri-Fuerza "
                + "\n[3]salir del programa \nSeleccione una opcion: ");
        int opcion = duki.nextInt();

        while (opcion != 3) {

            switch (opcion) {

                case 1:
                    System.out.println("Ingrese maestria"
                            + "\n1. Principiante (0% hit extra + extra damage)"
                            + "\n2. Intermedio (5% de hit extra + extra damage)"
                            + "\n3. Experto (15% de hit extra + extra damage)");
                    int maes = duki.nextInt();

                    int prob = 0;
                    int dano = 0;
                    int dist = duko.nextInt(30 - 15 + 1) + 15;
                    int ava = 0;
                    int balas = 25;
                    int vida = 25;
                    if (maes < 4 && maes > 0) {

                        char resp = 's';
                        switch (maes) {
                            case 1:
                                while (resp == 's' || resp == 'S') {
                                    System.out.println("El zombie se encuentra a: " + dist + "metros");
                                    System.out.println("\nEl jugador cuenta con: " + balas + " balas");

                                    prob = duko.nextInt(100) + 1;
                                    dano = duko.nextInt(7) + 1;
                                    ava = duko.nextInt(5 - 3 + 1) + 3;
                                    if (prob <= 65) {
                                        System.out.println("\nHIT!! El tiro le ha bajado: " + dano + " de HP al zombie");
                                        balas = balas - 1;

                                        if (dano > 0) {
                                            vida = vida - dano;
                                            if (vida <= 0) {
                                                vida = 0;
                                                System.out.println("\nVida restante del zombie: " + vida);
                                                System.out.println("BIG W, has logrado vencer al zombie!");
                                                break;
                                            }
                                            System.out.println("\nVida restante del zombie: " + vida);
                                            System.out.println("El zombie se encuentra a: " + dist + "metros");
                                        } else {
                                            System.out.println("Ha fallado! El zombie se encuentra a " + dist + "metros");
                                        }

                                        if (dist <= 0) {
                                            System.out.println("Ha fallado!! El zombie se encuentra a: " + dist);
                                            System.out.println("GAME OVER, la distancia se redujo a 0!");
                                            break;
                                        }

                                        System.out.print("Listo para el siguiente round? [S/N]: ");
                                        resp = duki.next().charAt(0);
                                    }
                                }// fin del while

                                break;

                            case 2:
                                while (resp == 's' || resp == 'S') {
                                    System.out.println("El zombie se encuentra a: " + dist + "metros");
                                    System.out.println("\nEl jugador cuenta con: " + balas + " balas");

                                    prob = duko.nextInt(100) + 1;
                                    dano = duko.nextInt(7) + 1;
                                    ava = duko.nextInt(5 - 3 + 1) + 3;
                                    if (prob <= 70) {
                                        System.out.println("\nHIT!! El tiro le ha bajado: " + dano + " de HP al zombie");
                                        balas = balas - 1;

                                        if (dano > 0) {
                                            vida = vida - dano;
                                            if (vida <= 0) {
                                                vida = 0;
                                                System.out.println("\nVida restante del zombie: " + vida);
                                                System.out.println("BIG W, has logrado vencer al zombie!");
                                                break;
                                            }
                                            System.out.println("\nVida restante del zombie: " + vida);
                                            System.out.println("El zombie se encuentra a: " + dist + "metros");
                                        } else {
                                            System.out.println("Ha fallado! El zombie se encuentra a " + dist + "metros");
                                        }

                                        if (dist <= 0) {
                                            System.out.println("Ha fallado!! El zombie se encuentra a: " + dist);
                                            System.out.println("GAME OVER, la distancia se redujo a 0!");
                                            break;
                                        }

                                        System.out.print("Listo para el siguiente round? [S/N]: ");
                                        resp = duki.next().charAt(0);
                                    }
                                }// fin del while
                                break;

                            case 3:
                                while (resp == 's' || resp == 'S') {
                                    System.out.println("El zombie se encuentra a: " + dist + "metros");
                                    System.out.println("\nEl jugador cuenta con: " + balas + " balas");

                                    prob = duko.nextInt(100) + 1;
                                    dano = duko.nextInt(7) + 1;
                                    ava = duko.nextInt(5 - 3 + 1) + 3;
                                    if (prob <= 80) {
                                        System.out.println("\nHIT!! El tiro le ha bajado: " + dano + " de HP al zombie");
                                        balas = balas - 1;

                                        if (dano > 0) {
                                            vida = vida - dano;
                                            if (vida <= 0) {
                                                vida = 0;
                                                System.out.println("\nVida restante del zombie: " + vida);
                                                System.out.println("BIG W, has logrado vencer al zombie!");
                                                break;
                                            }
                                            System.out.println("\nVida restante del zombie: " + vida);
                                            System.out.println("El zombie se encuentra a: " + dist + "metros");
                                        } else {
                                            System.out.println("Ha fallado! El zombie se encuentra a " + dist + "metros");
                                        }

                                        if (dist <= 0) {
                                            System.out.println("Ha fallado!! El zombie se encuentra a: " + dist);
                                            System.out.println("GAME OVER, la distancia se redujo a 0!");
                                            break;
                                        }

                                        System.out.print("Listo para el siguiente round? [S/N]: ");
                                        resp = duki.next().charAt(0);
                                    }
                                }// fin del while

                                break;

                        }// fin del switch

                    }// fin del if maestria
                    else {
                        System.out.println("Ingrese solo una de las 3 maestrias disponibles");
                    }
                    break;

                case 2:
                    figura();
                    break;
                default:
                    System.out.println("Ingrese solo una de las opciones en el menu");
                    break;
            }// fin del switch prinicpal
            System.out.print("\n******MENU******\n[1]Fight or Flight \n[2]Tri-Fuerza "
                    + "\n[3]salir del programa \nSeleccione una opcion: ");
            opcion = duki.nextInt();
        }// fin del while principal

    }// fin del main

    public static void figura() {
        System.out.println("Ingrese el tamano de la figura: ");
        int n = duki.nextInt();

        int n2 = n / 2 + 1;
int n3=n/2;
        if ((n % 2 == 0 && n >= 20) && n3%2!= 0) {
            for (int i = 0; i <= n2; i++) {
                for (int j = 0; j <= n; j++) {
                    if (i == n2 && j == n2 - 1) {
                        System.out.print(" ");// espacio de abajo
                    } else if (j + 2 == i && (i > n2 / 2 && i < n2)) {
                        System.out.print("*");//diagonal triangulo abajo \
                    } else if (i == n2) {
                        System.out.print("*");// parte de abajo
                    } else if (i + j == n + 2 && (i > n2 / 2 && i < n2)) {
                        System.out.print("*");// diagonal triangulo abajo /
                    } else if (i + j == n2 && i>0) {
                        System.out.print("*");// diagonal triangulo abajo /
                    }else if (n2/2==i && (j>n2/2 && j<n-n2/2)){
                        System.out.print("*");   // linea de abajo primer triangulo
                    }else if (j-i==n2/2+n2/2-2 && i>1){
                        System.out.print("*");        
                    } else {
                        System.out.print(" ");
                    }
                }// fin del for interior
                System.out.println("");
            }// fin del for externo



        }
        System.out.println("solo se puede un numero par y mayor que 20");
    }

}// fin de la clase
