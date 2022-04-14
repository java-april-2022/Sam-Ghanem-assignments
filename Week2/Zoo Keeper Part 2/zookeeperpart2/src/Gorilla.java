
public class Gorilla extends Mammal  {
	
	 
		public Gorilla(String nameinput) {
			super(nameinput);
			this.Energy = 200;
		}
		
		public Gorilla() {
			super();
		}
		
		public void  throwSomething() {
			System.out.println("The Dk has thrown something and it looks like poop!!!");
			Energy -= 5;
			
		}
		
		public void eatBannans() {
			System.out.println("Dk is Champin a bannan down for energy ");
			Energy += 10;
		}
		
		public void climb() {
			System.out.println("Dk Climbing to a high place. I have the high ground!!!!!");
			Energy -= 10;
		}
		

	}

