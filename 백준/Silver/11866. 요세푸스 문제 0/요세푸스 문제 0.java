import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) {
        try (BufferedReader inputReader = new BufferedReader(new InputStreamReader(System.in))) {
            StringTokenizer tokenizer = new StringTokenizer(inputReader.readLine(), " ");
            int n = Integer.parseInt(tokenizer.nextToken());
            int k = Integer.parseInt(tokenizer.nextToken());

            List<Integer> josephusProblem = calculateJosephusPermutation(n, k);

            System.out.println(print(josephusProblem));
        } catch (IOException | NumberFormatException e) {
            System.out.println("입력이 잘못되었습니다: " + e.getMessage());
        }
    }

    public static List<Integer> calculateJosephusPermutation(int n, int k) {
        List<Integer> josephusProblem = new ArrayList<>();
        List<Integer> people = new ArrayList<>();
        for (int i = 1; i <= n; i++) {
            people.add(i);
        }

        int index = 0;
        while (!people.isEmpty()) {
            index = (index + k - 1) % people.size();
            int removedPerson = people.remove(index);
            josephusProblem.add(removedPerson);
        }

        return josephusProblem;
    }

    private static String print(List<Integer> josephusProblem) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("<");
        for (int i = 0; i < josephusProblem.size(); i++) {
            if (i == josephusProblem.size() - 1) {
                stringBuilder.append(josephusProblem.get(i));
                break;
            }
            stringBuilder.append(josephusProblem.get(i)).append(", ");
        }
        stringBuilder.append(">");

        return stringBuilder.toString();
    }
}
