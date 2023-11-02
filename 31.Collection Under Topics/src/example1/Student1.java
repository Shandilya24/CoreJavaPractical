package example1;

import java.util.LinkedList;

public class Student1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student s1=new Student(101,"Abhi",78f);
		Student s2=new Student(102,"Abhis",80f);
		Student s3=new Student(103,"Abhish",82f);
		Student s4=new Student(104,"Abhishe",84f);
		Student s5=new Student(105,"Abhishek",86f);
		
		LinkedList<Student>list=new LinkedList<Student>();
		
		list.add(s1);
		list.add(s2);
		list.add(s3);
		list.add(s4);
		list.add(s5);
		
		System.out.println(list);
		for(Student Student:list)
		{
			System.out.println(Student.getRollNo()+""+Student.getName()+""+Student.getMarks());
		}
	}

}
