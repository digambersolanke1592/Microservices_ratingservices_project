package com.dig.Rating.services;

import java.util.List;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dig.Rating.entities.Rating;
import com.dig.Rating.repositories.RatingRepositories;

@Service
public class RatingServiceImpl implements RatingService {

	@Autowired
	private RatingRepositories ratingrepository;
	
	@Override
	public Rating createRatings(Rating rating) {
		// TODO Auto-generated method stub
		
	String randomId =	UUID.randomUUID().toString();
	rating.setRatingId(randomId);
		return ratingrepository.save(rating);
	}

	@Override
	public List<Rating> getAllRatings() {
		// TODO Auto-generated method stub
		return ratingrepository.findAll();
	}

	@Override
	public List<Rating> getAllByUserId(String userId) {
		// TODO Auto-generated method stub
		return ratingrepository.findByuserId(userId);
	}

	@Override
	public List<Rating> getAllByHotelId(String hotelId) {
		// TODO Auto-generated method stub
		return ratingrepository.findByHotelId(hotelId);
	}

}
