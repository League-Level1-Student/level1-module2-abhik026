package _03_tea_maker;

public class TeaMakerRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		TeaBag bag = new TeaBag(TeaBag.PASSION_FRUIT);
		bag.getFlavor();
		Kettle ket = new Kettle();
	
		ket.boil();

		Cup cup = new Cup();
		cup.makeTea(bag, ket.getWater());
	}

}
