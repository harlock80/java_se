package day_15;

public class Matrix {
    public static void main(String[] args) {
        int[][] matrix = { 
            { 9, 8, 7, 2 },    // riga 0: lunghezza 4
            { 5, 3, 2 },      // riga 1: lunghezza 3
            { 6, 6, 7, 1, 4 } // riga 2: lunghezza 5
        };

        // Primo ciclo: stampa la matrice originale
        System.out.println("Matrice originale:");
        for (int j = 0; j < matrix.length; j++) {
            for (int i = 0; i < matrix[j].length; i++) {
                System.out.print(matrix[j][i] + " ");
            }
            System.out.println();
        }
        System.out.println("-----");

        // Determina il numero massimo di colonne
        int maxCols = 0;
        for (int[] row : matrix) {
            if (row.length > maxCols) {
                maxCols = row.length;
            }
        }

        // Secondo ciclo: stampa la matrice trasposta
        System.out.println("Matrice trasposta:");
        for (int colonna = 0; colonna < maxCols; colonna++) {
            for (int riga = 0; riga < matrix.length; riga++) {
                // Controlla se l'elemento esiste
                if (colonna < matrix[riga].length) {
                    System.out.print(matrix[riga][colonna] + " ");
                } else {
                    System.out.print("  "); // Spazio per elementi mancanti
                }
            }
            System.out.println();
        }
    }
}