package de.nordakademie.evyoli.user.model;

import java.util.Date;

public class Rating {
	private long id;
	private User author;
	private Date creationDate;
	private int ratingPoint;
	private String ratingText;
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public User getAuthor() {
		return author;
	}
	public void setAuthor(User author) {
		this.author = author;
	}
	public Date getCreationDate() {
		return creationDate;
	}
	public void setCreationDate(Date creationDate) {
		this.creationDate = creationDate;
	}
	public int getRatingPoint() {
		return ratingPoint;
	}
	public void setRatingPoint(int ratingPoint) {
		this.ratingPoint = ratingPoint;
	}
	public String getRatingText() {
		return ratingText;
	}
	public void setRatingText(String ratingText) {
		this.ratingText = ratingText;
	}

}
