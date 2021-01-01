package _01_sea_creature;

public class SeaCreatureRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SeaCreature bob = new SeaCreature("Spongebob");
		bob.eat();
		bob.laugh();
		SeaCreature patrick = new SeaCreature("Patrick");
		SeaCreature Squidward = new SeaCreature("Squidward");
		
		patrick.getName();
		patrick.laugh();
		patrick.eat();
		
		Squidward.getName();
		Squidward.eat();
		Squidward.laugh();
		
	}

}
