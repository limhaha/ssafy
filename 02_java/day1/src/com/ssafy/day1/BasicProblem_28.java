// ##DELETE_FIEL:
package com.ssafy.day1;

/**
 * @since 2021. 7. 5.
 */
public class BasicProblem_28 {
    public static void main(String[] args) {
        int num = 3;
        
        //3부터 시작해서 break 만나기 전까지 실행
        switch( num ) {
            case 1 : System.out.println(num);
            case 2 : System.out.println(num);
            case 3 : System.out.println(num);
            case 4 : System.out.println(num);
            case 5 : break;
            case 6 : break;
            default : System.out.println(num);
        }
    }
}
