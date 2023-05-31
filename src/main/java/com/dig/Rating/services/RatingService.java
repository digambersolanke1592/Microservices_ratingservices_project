package com.dig.Rating.services;

import java.util.List;

import com.dig.Rating.entities.Rating;

public interface RatingService {

	public Rating createRatings(Rating rating);
	
	public List<Rating> getAllRatings();
	
	public List<Rating> getAllByUserId(String userId);
	
	public List<Rating> getAllByHotelId(String hotelId);
}
