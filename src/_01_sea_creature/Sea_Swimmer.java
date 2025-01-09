package _01_sea_creature;

public class Sea_Swimmer {
	public static void main(String[] args) {
	SeaCreature SpongeBob= new SeaCreature("spongebob");
	SeaCreature PatrickStar= new SeaCreature("patrick");
	SeaCreature Squidward= new SeaCreature("squidward");
	System.out.println(SpongeBob.getName());
	System.out.println(PatrickStar.getName());
	System.out.println(Squidward.getName());
	SpongeBob.eat();
	PatrickStar.eat();
	Squidward.eat();
	SpongeBob.laugh();
	PatrickStar.laugh();
	Squidward.laugh();
	}
}
