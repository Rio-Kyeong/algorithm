import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    private static final int TOTAL_STUDENTS = 30;
    private static final int SUBMITTED_STUDENTS = 28;

    public static void main(String[] args) {
        try (BufferedReader inputReader = new BufferedReader(new InputStreamReader(System.in))) {
            int[] students = new int[TOTAL_STUDENTS + 1];

            for (int i = 0; i < SUBMITTED_STUDENTS; i++) {
                int submittedStudent = Integer.parseInt(inputReader.readLine());
                students[submittedStudent] = submittedStudent;
            }

            for (int i = 1; i < students.length; i++) {
                if (students[i] == 0) {
                    System.out.println(i);
                }
            }

        } catch (IOException | NumberFormatException e) {
            System.out.println(e.getMessage());
        }
    }
}
