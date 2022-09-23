package EjercicioN2;

public class Main {

    public static void main(String args[])
    {
        /*Arreglo arreglo = new Arreglo();

        arreglo.setArreglo(6);
        arreglo.setArreglo(7);
        arreglo.setArreglo(8);

        arreglo.getArreglo();

        arreglo.buscarValor(9);*/


        int matriz[][] = {{1,2,3},{4,5,6},{7,8,9}};

        ///int matriz[][] = {{1,2},{4,5,6}, {1}};

        //System.out.println(matriz.length);

        for(int i=0; i<matriz.length; i++) {

            for(int j=0; j<matriz[i].length; j++) {

                System.out.print(matriz[i][j]+" ");
            }

            System.out.println();
        }
    }
}
