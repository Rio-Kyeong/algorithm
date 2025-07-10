import java.util.*;
import java.lang.*;
import java.io.*;

class Main {

    private static final List<List<Integer>> levels = new ArrayList<>();

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int K = Integer.parseInt(br.readLine());
        int totalNodes = (1 << K) - 1; // 2^K - 1

        int[] inorder = new int[totalNodes];
        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < totalNodes; i++) {
            inorder[i] = Integer.parseInt(st.nextToken());
        }
        
        for (int i = 0; i < K; i++) {
            levels.add(new ArrayList<>());
        }
        
        buildTree(inorder, 0, totalNodes - 1, 0);
        
        for (List<Integer> level : levels) {
            for (int val : level) {
                System.out.print(val + " ");
            }
            System.out.println();
        }
    }

    private static void buildTree(int[] inorder, int start, int end, int depth) {
        if (start > end) {
            return;
        }

        int mid = (start + end) / 2;
        levels.get(depth).add(inorder[mid]);
        
        buildTree(inorder, start, mid - 1, depth + 1);
        
        buildTree(inorder, mid + 1, end, depth + 1);
    }
}
