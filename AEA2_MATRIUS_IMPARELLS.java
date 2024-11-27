public class AEA2_MATRIUS_IMPARELLS {
    public static void main(String[] args) {

        System.out.println("---------------------");
        System.out.println("MATRIU");
        System.out.println("---------------------");

        // Crear una matriz 10x10 de enteros
        int [][] matriuParells = new int[10][10];

        // Llenar la matriz con -1 en posiciones donde tanto el índice de fila como el de columna son pares
        for (int i = 0; i < matriuParells.length; i++) {
            for (int j = 0; j < matriuParells[i].length; j++) {
                matriuParells [i][j] = i;
                if (i % 2 == 0 && j % 2 == 0) {
                    matriuParells [i][j] = -1;
                }
            }
        }

        // Imprimir la matriz fila por fila
        for (int i = 0; i < matriuParells.length; i++) {
            for (int j = 0; j < matriuParells[i].length; j++) {
                System.out.print(matriuParells[i][j] + " "); // Imprime el valor de cada celda
            }
            System.out.println("   --> Fila " + i); // Muestra el número de fila después de cada fila de la matriz
        }
    }
}