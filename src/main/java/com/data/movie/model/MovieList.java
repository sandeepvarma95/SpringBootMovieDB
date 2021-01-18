package com.data.movie.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "moviedatabase")
public class MovieList {
	
	@Id
	@Column
	private String id;
	
	@Column
	private String title;
	
	@Column
	private String overview;
	
	@Column
	private String popularity;
	
	@Column
	private String release_date;
	
	@Column
	private String vote_average;
	
	@Column
	private String vote_count;
	
	@Column
	private String original_language;
	
	@Column
	private String poster;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getOverview() {
		return overview;
	}

	public void setOverview(String overview) {
		this.overview = overview;
	}

	public String getPopularity() {
		return popularity;
	}

	public void setPopularity(String popularity) {
		this.popularity = popularity;
	}

	public String getRelease_date() {
		return release_date;
	}

	public void setRelease_date(String release_date) {
		this.release_date = release_date;
	}

	public String getVote_average() {
		return vote_average;
	}

	public void setVote_average(String vote_average) {
		this.vote_average = vote_average;
	}

	public String getVote_count() {
		return vote_count;
	}

	public void setVote_count(String vote_count) {
		this.vote_count = vote_count;
	}

	public String getOriginal_language() {
		return original_language;
	}

	public void setOriginal_language(String original_language) {
		this.original_language = original_language;
	}

	public String getPoster() {
		return poster;
	}

	public void setPoster(String poster) {
		this.poster = poster;
	}

	@Override
	public String toString() {
		return "MovieList [id=" + id + ", title=" + title + ", overview=" + overview + ", popularity=" + popularity
				+ ", release_date=" + release_date + ", vote_average=" + vote_average + ", vote_count=" + vote_count
				+ ", original_language=" + original_language + ", poster=" + poster + "]";
	}
	
	

}
