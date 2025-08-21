import java.util.Scanner;
class Demo{
 	public static void main(String[] hello){
 	Scanner h = new Scanner(System.in);
 	System.out.println("Enter a number: ");
 	int n = h.nextInt();
 
        boolean prime = true;
 
        if (n <= 1) 
        prime = false;
        for (int i = 2; i <= n/2; i++) {
            if (n % i == 0) {
                prime = false;
                break;
            }
        }

        System.out.println(prime ? " Prime" : " is Not Prime");
    }
}

