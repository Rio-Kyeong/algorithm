import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) {
        try (BufferedReader inputReader = new BufferedReader(new InputStreamReader(System.in))) {
            StringTokenizer tokenizer = new StringTokenizer(inputReader.readLine(), " ");
            int numberOfApplicants = Integer.parseInt(tokenizer.nextToken());
            int numberOfAwardWinners = Integer.parseInt(tokenizer.nextToken());

            tokenizer = new StringTokenizer(inputReader.readLine(), " ");
            List<Integer> grades = new ArrayList<>();
            for (int i = 0; i < numberOfApplicants; i++) {
                grades.add(Integer.parseInt(tokenizer.nextToken()));
            }

            grades.sort(Collections.reverseOrder());

            int cutOffGrade = grades.get(numberOfAwardWinners - 1);
            System.out.println(cutOffGrade);
        } catch (IOException | NumberFormatException e) {
            System.out.println("입력이 잘못되었습니다: " + e.getMessage());
        }
    }
}
