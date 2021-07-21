package com.ssafy.day2.array;

import java.util.Arrays;

/**
 * @since 2021. 7. 5.
 */
public class BasicProblem_07 {
    public static void main(String[] args) {
        // TODO: 홍길동, 임꺽정, 장길산, 이몽룡을 관리하는 배열을 만들고 내용을 출력하시오.
    	String[] names = {"홍길동", "임꺽정", "장길산", "이몽룡"};
    	
    	for(int i=0; i<names.length; i++) {
    		String name = names[i];
    		System.out.printf("%d 번째 요소는 %s%n" , i , name);
    	}
    	
    	for(String name: names) {
    		System.out.println(name);
    	}
 
    	System.out.println(Arrays.toString(names));
        // END:
    }
}
