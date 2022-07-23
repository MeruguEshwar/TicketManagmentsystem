package com.ojas.dao;

import java.util.List;

import com.ojas.model.Theater;

public interface TheaterDAO {
	// Theater Methods
	public void addTHEATER();

	public List<Theater> viewTheater(int theaterID);

	public List<Theater> viewAllTheaters();

	public void updateTheater(int theaterID);

	public void deleteTheater(int theaterID);
}
