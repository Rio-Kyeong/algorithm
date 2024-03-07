import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {

    private static final int BLACK_PAPER_SIDE = 10;
    private static final int BLACK_CANVAS_SIDE = 100;

    public static void main(String[] args) {
        try (BufferedReader inputReader = new BufferedReader(new InputStreamReader(System.in))) {
            int paperCount = Integer.parseInt(inputReader.readLine());
            int[][] papers = new int[paperCount][2];
            int[][] canvas = new int[BLACK_CANVAS_SIDE][BLACK_CANVAS_SIDE];
            int blackPaperArea = 0;

            for (int i = 0; i < paperCount; i++) {
                String[] tokens = inputReader.readLine().split(" ");
                papers[i][0] = Integer.parseInt(tokens[0]);
                papers[i][1] = Integer.parseInt(tokens[1]);
            }

            for (int[] paper : papers) {
                int rowStart = paper[0];
                int colStart = paper[1];
                for (int i = rowStart; i < rowStart + BLACK_PAPER_SIDE; i++) {
                    for (int j = colStart; j < colStart + BLACK_PAPER_SIDE; j++) {
                        canvas[i][j] = 1;
                    }
                }
            }

            for (int[] row : canvas) {
                blackPaperArea += Arrays.stream(row).sum();
            }

            System.out.println(blackPaperArea);
        } catch (IOException | NumberFormatException e) {
            System.out.println(e.getMessage());
        }
    }
}
