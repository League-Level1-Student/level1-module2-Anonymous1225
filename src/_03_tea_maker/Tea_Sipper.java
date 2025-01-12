package _03_tea_maker;

import _03_tea_maker.Kettle.Water;

public class Tea_Sipper {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TeaBag passion=new TeaBag("Passion fruit");
		Kettle boiler=new Kettle();
		boiler.boil();
		Cup cup=new Cup();
		cup.makeTea(passion, boiler.getWater());
	}

}
