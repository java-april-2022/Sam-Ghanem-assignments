
public class Mammal {
	
	public int Energy;
	public  String name;
		
		
		
	public Mammal() {
//			super();
		}

//		constructor 
		public Mammal(String nameinput) {
			this.name = nameinput;
			this.Energy = 50;
			}
		
		public void getEnergylvl() {
			String dkSmash = String.format("energy level %s for %s \n", this.Energy , this.name );
			System.out.println(dkSmash);
		}

}

