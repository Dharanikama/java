import java.util.Scanner;
class Prime{
	public static void main(String args[]){
		Scanner s=new Scanner(System.in);
		int a=s.nextInt();
		int i,j=0;
		for(i=1;i<=a;i++){
		  if (a%i==0){
		    j++;
		    }
		   }
		 if(j==2){
		  System.out.println("Prime");
		  }
		 else{
		   System.out.println("not a Prime");
		   }
		}
    }
