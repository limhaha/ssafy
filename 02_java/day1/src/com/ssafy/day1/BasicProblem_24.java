package com.ssafy.day1;



/**
 * @since 2021. 7. 4.
 */
public class BasicProblem_24 {
    public static void main(String[] args) {
        int N = 6;

        // TODO: 주사위를 던져서 나올 수 있는 경우의 수 ( 1~ 6 ) 를 시뮬레이션 하려고 한다.
        // @@ Random 수를 이용하여 코드를 작성하세요.
        
        int num = (int) (Math.random() * N) + 1;
        System.out.println(num);
        
//        Random rand = new Random();
//        
//        int num = rand.nextInt(N) + 1;
//        System.out.println(num);
        
        
        // 0<= Math.random() * N < N  --> int -> 0<= x <=N-1
//        int num = (int) (Math.random() * N) + 1;
//        System.out.println(num);
//        
//        // Ran + cmd + space
//        Random rand = new Random();
//        int num2 = rand.nextInt(N) + 1;
//        System.out.println(num2);
        // END:
    }

}
