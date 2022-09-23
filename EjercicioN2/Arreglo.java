package EjercicioN2;

public class Arreglo {
    int arreglo[];

    int elementos;

    Arreglo()
    {
        arreglo = new int[3];

        elementos = 0;
    }

    public void setArreglo(int valor)
    {
        arreglo[elementos++] = valor;
    }

    public void getArreglo()
    {
        for (int i=0; i<elementos; i++) {

            System.out.println(arreglo[i]);
        }
    }

    public void buscarValor(int valor)
    {
        int i;

        for (i=0; i<elementos; i++) {

            if (arreglo[i] == valor) {

                break;
            }
        }

        if (i == elementos) {

            System.out.println("No se encontro: "+valor);

        } else {

            System.out.println("Se encontro: "+valor);
        }
    }

    public void editarElemento(double valor)
    {
        {
            int i;

            for (i=0; i<elementos; i++)
            {
                if (arreglo[i] == valor)
                {
                    break;
                }
            }
        }
    }

    public void eliminarElemento(double valor)
    {
        {
            int i;

            for (i=0; i<elementos; i++)
            {
                if (arreglo[i] == valor)
                {
                    break;
                }
            }
            if (elementos == 1)
            {
                elementos = elementos-1;
            }
        }
    }
}
