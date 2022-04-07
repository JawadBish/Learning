package stackAndQueue;

import java.util.Stack;

public class Fish {

    static int solution(int[] A, int[] B) {
        int survivors = 0;
        Stack<Integer> pool = new Stack<>();

        for (int i = 0; i < A.length; i++) {
            int fishSize = A[i];  //(fish size)
            int direction = B[i]; // 0 (up) , 1 (down)
            if (direction == 0) {
                boolean survives = true;
                while (!pool.isEmpty()) {
                    int oppositeFish = pool.pop();
                    if (fishSize < oppositeFish) {
                        pool.push(oppositeFish);
                        survives = false;
                        break;
                    }
                }
                if (survives) {
                    survivors++;
                }


            } else {
                pool.push(fishSize);
            }
        }
        survivors += pool.size();
        return survivors;


    }


    public static void main(String[] args) {
        System.out.println(solution(new int[]{5, 4, 8, 2, 3}, new int[]{0, 1, 0, 0, 1}));
    }
}


