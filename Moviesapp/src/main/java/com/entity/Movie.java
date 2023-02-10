package com.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "moviedb")
public class Movie {

	 	
	    @Column(name = "Movie_Name")
		private String name;
	 	
	 	@Column(name = "Release_Date")
		private String reldate ;

	 	@Column(name = "rating")
		private String rating ;

		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public String getReldate() {
			return reldate;
		}

		public void setReldate(String reldate) {
			this.reldate = reldate;
		}

		public String getRating() {
			return rating;
		}

		public void setRating(String rating) {
			this.rating = rating;
		}

		@Override
		public String toString() {
			return "Movie [name=" + name + ", reldate=" + reldate + ", rating=" + rating + "]";
		}
	 	
	 	
	
}
