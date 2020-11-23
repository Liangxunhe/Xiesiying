package pac;

import java.util.Scanner;

public class Eewei {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		while (true) {
			System.out.println("麻烦你输入个1");
		Scanner scanner=new Scanner(System.in);
		 int user_num=scanner.nextInt();
		 if(user_num==1){
			 int x=(int)(Math.random()*(100));
			 int y=(int)(Math.random()*(100));
             System.out.println(x+","+y);
         }else {
        	 System.out.println("是输入1呀同学");
         }
			
		}
	}
}
