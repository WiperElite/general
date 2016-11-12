/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package refuerso_sabado;

import java.util.Scanner;

/**
 *
 * @author SergioIván
 */
public class Refuerso_sabado {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Scanner read = new Scanner(System.in);
        String nombre[] = new String[4];
        nombre[0] = "Sergio";
        nombre[1] = "Ivan";
        nombre[2] = "Galvis";
        nombre[3] = "Motoa";
        String alias = "";
        for (int i = 0; i < nombre.length; i++) {
            if (i < nombre.length - 1) {
                alias = alias + nombre[i].charAt(0);
            } else {
                alias = alias + nombre[i];
            }
            // System.out.println(nombre[i]);}

// TODO code application logic here
        }
        System.out.println(alias.toLowerCase());
        System.out.println("Ingrese el numero de la palabra que quiere consultar");
        int consulta = read.nextInt();

        switch (consulta) {
            case 0:
                System.out.println(nombre[consulta]);
                break;
            case 1:
                break;
            case 2:
                System.out.println(nombre[consulta]);
                break;
            case 3:
                System.out.println(nombre[consulta]);
                break;
            default:
                System.out.println(alias);
                break;

        }

    }
}