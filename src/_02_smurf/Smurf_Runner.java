package _02_smurf;

public class Smurf_Runner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Smurf handy=new Smurf("Handy","boy","white");
		Smurf papa=new Smurf("Papa","Boy","red");
		Smurf lady = new Smurf("Smurffete","girl","red");
		handy.eat();
		System.out.println(handy.getName());
		System.out.println(handy.isGirlOrBoy());
		System.out.println(handy.getHatColor());
		System.out.println(papa.getName());
		System.out.println(papa.isGirlOrBoy());
		System.out.println(papa.getHatColor());
		System.out.println(lady.getName());
		System.out.println(lady.isGirlOrBoy());
		System.out.println(lady.getHatColor());
	}

}
