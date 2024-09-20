class Artwork{

	private String title;
	private int year;
	private Artist artist;
	
	//constructor of class

	Artwork(String title,int year,Artist artist){
		this.title=title;
		this.year=year;
		this.artist=artist;
	}
	Artwork(String title,int year){
		this.title=title;
		this.year=year;
		this.artist=new Artist("Unknown artist");
	}
	
	/*//shallow copyconstructor

	Artwork(Artwork aw,boolean shallow){
		this.title=aw.title;
		this.year=aw.year;
		this.artist=aw.getArtist();
	}

	//deep copy constructor

	Artwork(Artwork aw){
		this.title=aw.title;
		this.year=aw.year;
		this.artist=new Artist(aw.getArtist().getName());
	}*/

	//Method of shallow copy

	public Artwork shallowCopy() {
        	return new Artwork(this.title, this.year, this.artist);
  	  }
	//Method of deep copy

	public Artwork deepCopy() {
        	return new Artwork(this.title, this.year, new Artist(this.artist));
   	 }
	
	//getter and setter of object

	public void setTitle(String title){
		this.title=title;
	}
	public String getTitle(){
		return title;
	}

	public void setYear(int year){
		this.year=year;
	}
	public int getYear(){
		return year;
	}


	public void setArtist(Artist artist){
		this.artist=artist;
	}
	public Artist getArtist(){
		return artist;
	}

	//display function

	public void display(){
		System.out.printf("Title of art : %s\n",title);
		System.out.printf("The year of creation : %d\n",year);
		artist.display();
	}
	
	//tostring function

	@Override
	public String toString(){
		return String.format("Name : %s  Title: %s  Year of creation : %d",artist.getName(),title,year);
	}
	
	//comparision

	public boolean equals(Object o){
		return true;
	}

}

