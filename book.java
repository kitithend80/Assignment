class book {
//declaring attributes
	String Title;
	String Author;
	int year_of_publication;
//constructers to initialise values
	book(String Title, String Author, int year_of_publication) {
	this.Title = Title;
	this.Author = Author;
	this.year_of_publication = year_of_publication;
	System.out.println(" Your book: "+Title);
     }
//creating a method
public void disbook() {
	System.out.println("Title of the book: "+Title);
	System.out.println("Author of the book: "+Author);
	System.out.println("Published Year: "+year_of_publication);
     }
public static void main(String[] args) {
//creating a object for class book
	book book1 = new book("The Hunger games", "Suzanne Collins", 2008);
	book1.disbook();
	book book2 = new book("Shatter Me", "Tahereh Mafi", 2011);
	book2.disbook();
  }
}