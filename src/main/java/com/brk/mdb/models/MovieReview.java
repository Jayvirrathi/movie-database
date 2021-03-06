package com.brk.mdb.models;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import lombok.Data;

@Data
@Entity
@IdClass(MovieReviewID.class)
public class MovieReview {

	@Id
	@ManyToOne(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
	@JoinColumn(name = "movie_id")
	private Movie movie;

	@Id
	@ManyToOne(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
	@JoinColumn(name = "user_id")
	private User user;

	private int rating;
	private String comment;

	public MovieReview(Movie movie, User user, int rating, String comment) {
		this.movie = movie;
		this.user = user;
		this.rating = rating;
		this.comment = comment;
	}

	public MovieReview() {
		super();
		// TODO Auto-generated constructor stub
	}
}
