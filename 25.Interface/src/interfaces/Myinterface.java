package interfaces;

public interface Myinterface {
   int no=10;//Public+Static+Final
   void show1();//Public+abstract
   static void display()//Public
   {
	   System.out.println("Static Method");
   }
   default void dispaly2()//Public
   {
	   System.out.println("Default Method");
   }
	interface Secondinterface
	{
		
	}
}

