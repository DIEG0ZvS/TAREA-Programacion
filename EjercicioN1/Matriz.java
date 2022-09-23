package EjercicioN1;
import java.util.Scanner;

public class Matriz {

    double matriz[][];

    int fila;

    int columna;

    public void ordenMatriz()
    {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese la fila de la matriz: ");
        fila = scanner.nextInt();

        System.out.print("Ingrese la columna de la matriz: ");
        columna = scanner.nextInt();

        matriz = new double[fila][columna];
    }

    public void setMatriz()
    {
        for (int i=0; i<matriz.length; i++) {

            for (int j=0; j<matriz[i].length; j++) {

                Scanner scanner = new Scanner(System.in);

                System.out.print("Ingrese los valores de la matriz: ");

                double valores;

                valores = scanner.nextInt();

                matriz[i][j] =  valores;
            }
        }
    }

    public void mostrarMatrix()
    {
        for (int i=0; i<matriz.length; i++) {

            for (int j=0; j<matriz[i].length; j++) {

                System.out.print(matriz[i][j]+ " ");
            }

            System.out.println();
        }
    }

    public static void main(String args[])
    {
        Matriz matriz = new Matriz();
        matriz.ordenMatriz();
        matriz.setMatriz();
        matriz.mostrarMatrix();
    }
}