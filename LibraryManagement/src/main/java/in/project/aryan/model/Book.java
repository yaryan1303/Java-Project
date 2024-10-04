package in.project.aryan.model;

import java.io.Serializable;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="BOOK")
public class Book implements Serializable{
private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	
	@Column(name = "AUTHOR_NAME", length = 20)
	private String author;
	@Column(name = "BOOK_NAME", length = 20)
	private String name;
	
	
	
	
	
	public Integer getId() {
		return id;
	}





	public void setId(Integer id) {
		this.id = id;
	}





	public String getAuthor() {
		return author;
	}





	public void setAuthor(String author) {
		this.author = author;
	}





	public String getName() {
		return name;
	}





	public void setName(String name) {
		this.name = name;
	}





	@Override
	public String toString() {
		return "Book [id=" + id + ", author=" + author + ", name=" + name + "]";
	}


	
	

}
