public class Test{

	public static void main(String args[]){

		// assigning values to object of class artist and artwork

		Artist artist=new Artist("Lily Joe");
		Artwork a1=new Artwork("garden of time",2023,artist);
		
		artist.display();

		System.out.println("\n==================toString function==============================\n");
		System.out.println("\nAfter adding toString function:");
		System.out.println(a1);
		
		//changing values and making new object of artwork class

		Artwork a2=new Artwork("untitle",2023);
		a2.setTitle("beauty");
		a2.setYear(2020);

		System.out.println("\n\n=====================Before changes===========================\n");
		System.out.println("Artwork 1:");
		a1.display();
		System.out.println("\nArtwork 2:");
		a2.display();

		/*System.out.println("\nShallow Copy of Artwork 1:");		//making shallow copy
		Artwork shallow=a1;
		shallow.display();
		System.out.println("\nDeep Copy of Artwork 1:");		//making deep copy
		Artwork deep=new Artwork(a1);
		deep.display();*/

		 Artwork shallowCopy = a1.shallowCopy();
        	System.out.println("\nShallow Copy:");
        	shallowCopy.display();

        	// deep copy of the artwork
        	Artwork deepCopy = a1.deepCopy();
        	System.out.println("\nDeep Copy:");
        	deepCopy.display();
		System.out.println("================================================================\n");

		artist.setName("Rose"); //changing name

		System.out.println("\n\n====================After Changes============================\n");
		System.out.println("\nOrignal Artwork :");
		a1.display();
		System.out.println("\nShallow Copy of Artwork 1:");
		shallowCopy.display();
		System.out.println("\nDeep Copy of Artwork 1:");
		deepCopy.display();
		System.out.println("=================================================================\n");

		//Comparision of obj1 and obj2
		if(a1.equals(a2))
			System.out.println("a1 and a2 are equal\n");
		else
			System.out.println("a1 and a2 are not equal\n");

}
}