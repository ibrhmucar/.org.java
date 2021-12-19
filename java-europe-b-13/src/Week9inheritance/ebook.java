package Week9inheritance;

public class ebook extends Book{
	
	int size;
	int pages;
	String format;
	
	
	public void readBook() {
		System.out.println("Reading book: ");
		System.out.println("Title : " + title);
		System.out.println("Author : " + author);
		System.out.println("Size : " + size );
		System.out.println("Pages: " + pages);
		System.out.println("Format : " + format);
		
	}
	

}
