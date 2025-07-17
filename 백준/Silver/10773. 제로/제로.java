import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/**
 * 제로
 */
public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int k = Integer.parseInt(br.readLine());
        int sum = 0;

        List<Integer> list = new ArrayList<>();

        for(int i = 0; i < k; i++){
            int money = Integer.parseInt(br.readLine());
            if(money == 0){
                list.remove(list.size() - 1);
            }else {
                list.add(money);
            }
        }

        for (Integer idx : list) {
            sum += idx;
        }
        System.out.print(sum);
    }
}