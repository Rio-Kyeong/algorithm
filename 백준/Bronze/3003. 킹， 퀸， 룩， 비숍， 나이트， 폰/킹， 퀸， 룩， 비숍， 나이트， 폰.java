import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    private static final int[] DEFAULT_CHESS_PIECES = new int[]{1, 1, 2, 2, 2, 8};

    public static void main(String[] args) {
        try (BufferedReader inputReader = new BufferedReader(new InputStreamReader(System.in))) {
            StringTokenizer chessPieceTokenizer = new StringTokenizer(inputReader.readLine());
            int[] result = new int[DEFAULT_CHESS_PIECES.length];

            for (int i = 0; i < DEFAULT_CHESS_PIECES.length; i++) {
                int chessPieceCount = Integer.parseInt(chessPieceTokenizer.nextToken());
                result[i] = DEFAULT_CHESS_PIECES[i] - chessPieceCount;
            }

            for (int chessPiece : result) {
                System.out.print(chessPiece + " ");
            }
        } catch (IOException | NumberFormatException e) {
            System.out.println(e.getMessage());
        }
    }
}
