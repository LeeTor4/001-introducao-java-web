package br.uece.eesdevop.introducaojavaweb;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Book {
 
	@Id
	@GeneratedValue
	private Long id;
    private String title;
    private String author;
    private String resume;
    private String launchYear;

    public Book() {
		
	}
    public Book(String title, String author,String launchYear) {
        
    	this.title      = title;
        this.author     = author;
        this.launchYear = launchYear;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

	public String getResume() {
		return resume;
	}

	public void setResume(String resume) {
		this.resume = resume;
	}

	public String getLaunchYear() {
		return launchYear;
	}

	public void setLaunchYear(String launchYear) {
		this.launchYear = launchYear;
	}

    
}
