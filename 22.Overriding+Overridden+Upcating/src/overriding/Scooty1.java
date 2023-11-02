package overriding;

public class Scooty1 extends Scooter1 {
	int no=40;
	public void show()
	{
		System.out.println(super.no);
		System.out.println(no);
	}
}
