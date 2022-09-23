package EjercicioN1;

import java.util.*;
public class transpuestaMatriz {
    int[][] matriz;
    int[][] transpuesta;
    int fila;
    int columna;
    int valor;

    public void tamanoMatriz() {
        Scanner scan = new Scanner(System.in);
        System.out.println("digite fila");
        this.fila = scan.nextInt();
        System.out.println("digite columna");
        this.columna = scan.nextInt();

        this.matriz = new int[this.fila][this.columna];
        this.transpuesta = new int[this.columna][this.fila];

    }

    public void agregarMatriz() {
        Scanner scan = new Scanner(System.in);
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.println("digite valor ["+i+"]["+j+"]");
                this.valor = scan.nextInt();
                this.matriz[i][j] = this.valor;
            }
        }
    }

    public static void main(String[] args) {
        transpuestaMatriz matriz = new transpuestaMatriz();

        matriz.tamanoMatriz();
        matriz.agregarMatriz();
        matriz.mostrarMatriz();
        matriz.transponerMatriz();
        matriz.mostrarTranspuesta();


    }

    public void transponerMatriz() {
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                this.transpuesta[j][i] = this.matriz[i][j];

            }
        }
    }

    public void mostrarTranspuesta() {
        System.out.println("\nMatriz transpuesta");
        for (int i = 0; i < transpuesta.length; i++) {
            for (int j = 0; j < transpuesta[i].length; j++) {
                System.out.print(this.transpuesta[i][j] + " ");
            }
            System.out.println();
        }
    }

    public void mostrarMatriz() {
        System.out.println("\nMatriz ingresada");
        for (int i = 0; i < matriz.length; i++){
            for (int j = 0; j < matriz[i].length; j++){
                System.out.print(this.matriz[i][j]+ " ");
            }
            System.out.print("\n");
        }
    }
}