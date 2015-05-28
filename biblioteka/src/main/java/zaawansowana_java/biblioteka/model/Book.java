package zaawansowana_java.biblioteka.model;

import java.sql.Date;

public class Book {
	private String title;
	private String publishedBy;
	private String city;
	//type Date sql
	private Date year;
	private Author author;
	
	public Book(String title, String publishedBy, String city, Date year,
			Author author) {
		super();
		this.title = title;
		this.publishedBy = publishedBy;
		this.city = city;
		this.year = year;
		this.author = author;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getPublishedBy() {
		return publishedBy;
	}

	public void setPublishedBy(String publishedBy) {
		this.publishedBy = publishedBy;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public Date getYear() {
		return year;
	}

	public void setYear(Date year) {
		this.year = year;
	}

	public Author getAuthor() {
		return author;
	}

	public void setAuthor(Author author) {
		this.author = author;
	}

	@Override
	public String toString() {
		return  getTitle() + ", published by "
				+ getPublishedBy() + ", " + getCity()
				+ ", " + getYear() + ", " + getAuthor().toString();
	}
	
	public boolean equals
}
