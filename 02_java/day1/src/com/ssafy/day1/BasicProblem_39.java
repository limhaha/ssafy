package com.ssafy.day1;

/**
 * @since 2021. 7. 5.
 */
public class BasicProblem_39 {

    
    public static void main(String[] args) {
    	int blank=0;
        // TODO: 지정한 별찍기를 처리하시오.
    	for(int i=9; i>0; i-=2) {
    		for(int k=0; k<blank; k++) {
				System.out.print(" ");
			}
    		for(int j=i; j>0; j--) {
    			System.out.print("*");
    		}
    		blank++;
    		System.out.println();
    	}
        // END:
    }

}
