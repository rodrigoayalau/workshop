package oop.basic;

public class EntryPoint {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			int ages [] = new int[3];
			ages[0] = 10;
			ages[1] = 20;
			ages[2] = 30;
			//ages[3] = 40;			
			for(int i=0; i<ages.length; i++) {
				System.out.println(i + ": " + ages[i]);
			}
		} catch(Exception e) {
			e.printStackTrace();
		}
		
		String[] vowels = {"a","e","i","o","u"};
		String word = "hola";
		
		word = word.replaceAll("[AaEeIiOoUu]", "");
		System.out.println(word);
		
	}

}
