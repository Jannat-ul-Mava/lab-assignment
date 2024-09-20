class Artist{
		
	private String name;

	//getter and setter of object

	public void setName(String name){
		this.name=name;
	}
	public String getName(){
		return name;
	}
	
	//constructor of class

	Artist(String name){
		this.name=name;
	}

	//copy constructor

	Artist(Artist artist){
		this.name=artist.name;
	}

	//display method

	public void display(){
		System.out.printf("Name of Artist : %s \n",name);
	}


}

