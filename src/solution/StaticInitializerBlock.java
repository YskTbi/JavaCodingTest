package solution;

import java.util.Scanner;

public class StaticInitializerBlock {
	
static boolean flag;
static int B;
static int H;

static {
    Scanner stdin = new Scanner(System.in);
    B = stdin.nextInt();
    H = stdin.nextInt();
    flag = true;
    if( B < 1 | H < 1) {
        flag = false;
        System.out.println("java.lang.Exception: Breadth and height must be positive");
    }
    stdin.close();
}

public static void main(String[] args){
		if(flag){
			int area=B*H;
			System.out.print(area);
		}
		
	}//end of main

}//end of class

