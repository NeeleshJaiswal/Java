package helloWorld;

public class Harsh {
	
		//human, male, height, age, occupation //instance variable
		public String gender = "male";
		private int age = 22;
		public String country = "Canada";
		public String surname = "Jaiswal";
		public float firstValue = 22.139999f;
		public double secondValue = 22.13999999999d;
		
		public char firstChar = 'A';
		public boolean boolValue = true;
		
		public String getName() {
			System.out.println(gender);
			String name = "Harsh"; // Anshul, Harsh
			return name;
		}
		
		public String eatingStyle(String countryName) {
			System.out.println("Harsh class>> "+countryName);
			if(country == countryName) {
				// country - Harsh
				return "byHand"; // Harsh, Anshul, Neelesh
			} else {
				return "byCutleries"; // Harsh, Anshul
			}
		}
		//Local Variables - inside methods
		//Class Variables (Static Variables)
		//Instance Variables (Non-static Variables)
	

}
