import java.util.Scanner;
class Student{
	String name;
	int  rno;
	int marks;
	Student(){
	Scanner s=new Scanner(System.in);
	name = s.nextLine();
	rno=s.nextInt();
	marks=s.nextInt();
	}
	/*Student(String s,int r,int m){
	name=s;
	rno=r;
	marks=m;
	}*/
	void displayDetails(){
	System.out.println("name:"+name);
	System.out.println("rno:"+rno);
	System.out.println("marks:"+marks);
	}
	Student(String s,int r,int m){
	name=s;
	rno=r;
	marks=m;
	}
	public static void main(String args[]){
	          Student s1=new Student("dharani",7,95);
	          s1.displayDetails();
	          }
	}
