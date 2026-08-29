public class T12_Arrays_Enhanced {

    public static void main(String[] args) {

        // -------- NORMAL 2D ARRAY --------
        int[][] normal = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };

        // -------- JAGGED ARRAY --------
        int[][] jagged = {
            {1, 2},
            {3, 4, 5},
            {6}
        };

        System.out.println("=== Enhanced For Loop (Normal Array) ===");
        for (int[] row : normal) {
            for (int value : row) {
                System.out.print(value + " ");
            }
            System.out.println();
        }

        System.out.println("\n=== Enhanced For Loop (Jagged Array) ===");
        for (int[] row : jagged) {
            for (int value : row) {
                System.out.print(value + " ");
            }
            System.out.println();
        }

        // ---------------- Traditional Loop ----------------

        System.out.println("\n=== Traditional For Loop (Normal Array) ===");
        for (int i = 0; i < normal.length; i++) {
            for (int j = 0; j < normal[i].length; j++) { // MUST fetch row length
                System.out.print(normal[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println("\n=== Traditional For Loop (Jagged Array) ===");
        for (int i = 0; i < jagged.length; i++) {
            for (int j = 0; j < jagged[i].length; j++) { // MUST fetch different row lengths
                System.out.print(jagged[i][j] + " ");
            }
            System.out.println();
        }
    }
}