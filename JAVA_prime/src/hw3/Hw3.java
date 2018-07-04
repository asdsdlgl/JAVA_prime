package hw3;

import java.util.Scanner;

public class Hw3 {

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		String str = keyboard.next();
		char first = str.charAt(0);
		int inputnum = Integer.parseInt(str.substring(2));
		int num = 0,count = 0;
		if(inputnum==0){
			System.out.print("invalid input");
			return;
		}
		if(first=='x'||first=='X'){
			if(check(inputnum)==1){
				System.out.print("true");
			}else{
				System.out.print("false");
			}
		}
		if(first=='y'||first=='Y'){
			for(num=1;;num++){
				if(check(num)==1){
					count++;
				}
				if(count==inputnum){
					System.out.printf("%d",num);
					break;
				}
			}
		}
	}
	public static int check(int num){
		while(num%2==0){
			num /= 2;
		}
		while(num%3==0){
			num /= 3;
		}
		while(num%5==0){
			num /= 5;
		}
		if(num==1)
			return 1;
		else
			return 0;
	}

}
