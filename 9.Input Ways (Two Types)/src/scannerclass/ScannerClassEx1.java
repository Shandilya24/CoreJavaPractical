package scannerclass;
import java.util.Scanner;
public class ScannerClassEx1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner=new Scanner(System.in);
		String name;
		int age;
		float marks;
		char gender;
		
		System.out.println("Enter Name :");
		//name=scanner.next();
		name=scanner.nextLine();
		
		System.out.println("Enter Age :");
		age=scanner.nextInt();
		
		System.out.println("Enter Marks :");
		marks=scanner.nextFloat();
		
		System.out.println("Enter Gender :");
		gender=scanner.next().charAt(0);
		
		System.out.println("Name="+name);
		System.out.println("Age="+age);
		System.out.println("Marks="+marks);
		System.out.println("Gender="+gender);
		
		
		

	}

}
