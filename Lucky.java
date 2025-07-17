import java.util.Scanner;
class Lucky{
	public static void main(String args[]){
		Scanner s=new Scanner(System.in);
		System.out.println("enter register number");
		int regno=s.nextInt();
		System.out.println("enter lucky number");
		int luck=s.nextInt();
		
		while(regno>10){
		        int sum=0;
		while(regno>0){
			int digit=regno%10;
			sum=sum+digit;
			regno=regno/10;
			}
		        regno=sum;
		  }
		if(regno==luck){
		   System.out.println("lucky number"+regno);
		   }
		  else{
		  System.out.println("not a lucky number");
		  }
		 }
	}
