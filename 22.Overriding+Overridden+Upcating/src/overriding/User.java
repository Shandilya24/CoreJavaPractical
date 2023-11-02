package overriding;

public class User {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scooter vespa=new Scooter();
        Scooty activa=new Scooty();
        vespa.start();
        vespa.stop();
        activa.start();
        activa.stop();
	}

}
