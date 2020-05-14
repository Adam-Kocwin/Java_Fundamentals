package activities;

public class Book
{
	private String title;
	private String author;
    private String publisher;
    private int copiesSold;
    
	public Book(String t, String a, String p, int copSold)
	{
		title = t;
		author =a;
	    publisher = p;
	    copiesSold = copSold;
	}
	
	public void setTitle(String t )
	{
		title =t;
	}
	
	public String getTitle()
	{
		return title;
	}
	
	public void setAuthor(String a)
	{
		author =a;
	}
	
	public String getAuthor()
	{
		return author;
	}
	
	public void setPublisher(String p)
	{
		publisher = p;
	}
	
	public String getPublisher()
	{
		return publisher;
	}
	
	public void setCopiesSold(int copSold)
	{
		copiesSold = copSold;
	}
	
	public int getCopiesSold()
	{
		return copiesSold;
	}

}
