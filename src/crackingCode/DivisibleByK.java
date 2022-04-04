package crackingCode;

public class DivisibleByK {
    public static int solution(int A, int B, int K) {
            int upper = B/K;
            int down = (A > 0 ? (A - 1)/K: 0);
            if(A == 0){
                upper++;
            }
            return upper - down;
        }

//[2000,200000,1000]
    public static void main(String[] args) {
        System.out.println(solution(2000,200000,1000));
    }
}
