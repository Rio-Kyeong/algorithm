import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    private static final int MAX_SIZE = 100;

    public static void main(String[] args) {
        try (BufferedReader inputReader = new BufferedReader(new InputStreamReader(System.in))) {
            StringTokenizer tokenizer = new StringTokenizer(inputReader.readLine());
            int rows = Integer.parseInt(tokenizer.nextToken());
            int cols = Integer.parseInt(tokenizer.nextToken());

            if (rows > MAX_SIZE && cols > MAX_SIZE) {
                throw new IllegalArgumentException("N과 M은 100보다 작거나 같습니다.");
            }

            int[][] matrix1 = readMatrix(inputReader, rows, cols);
            int[][] matrix2 = readMatrix(inputReader, rows, cols);
            int[][] result = sumMatrices(matrix1, matrix2);
            
            for (int[] row : result) {
                for (int value : row) {
                    System.out.print(value + " ");
                }
                System.out.println();
            }

        } catch (IOException | NumberFormatException e) {
            System.out.println(e.getMessage());
        }
    }

    private static int[][] sumMatrices(int[][] matrix1, int[][] matrix2) {
        int rows = matrix1.length;
        int cols = matrix1[0].length;
        int[][] result = new int[rows][cols];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                result[i][j] = matrix1[i][j] + matrix2[i][j];
            }
        }

        return result;
    }

    private static int[][] readMatrix(BufferedReader reader, int rows, int cols) throws IOException {
        int[][] matrix = new int[rows][cols];
        for (int i = 0; i < rows; i++) {
            StringTokenizer tokenizer = new StringTokenizer(reader.readLine());
            for (int j = 0; j < cols; j++) {
                matrix[i][j] = Integer.parseInt(tokenizer.nextToken());
            }
        }
        
        return matrix;
    }
}
