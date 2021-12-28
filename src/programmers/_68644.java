package programmers;

import java.util.*;

public class _68644 {
    static Set<Integer> list;
    //test4
    public static void main(String[] args) {
        list = new HashSet<>();
        int[] ans = {};
        Integer[] tmpAns = {};

        int[] numbers = {5, 0, 2, 7};
        boolean[] isVisited = new boolean[numbers.length];
        dfs(numbers, isVisited, 0, 0, 0);

//        Iterator itr = list.iterator();
//        while (itr.hasNext()) {
//            System.out.println(itr.next());
//        }


        tmpAns = list.toArray(new Integer[0]);
        ans = Arrays.stream(tmpAns).mapToInt(Integer::intValue).toArray();
        Arrays.sort(ans);

        for (int i = 0; i < ans.length; i++) {
            System.out.println(ans[i]);
        }

    }
    static void dfs (int[] numbers, boolean[] isVisited, int depth, int idx, int sum) {
        if (depth == 2) {
            list.add(sum);
            return;
        }

        for (int i = 0; i < numbers.length; i++) {
            if (!isVisited[i]) {
                isVisited[i] = true;
                dfs(numbers, isVisited, depth + 1, i, sum + numbers[i]);
                isVisited[i] = false;
            }
        }
    }
}
