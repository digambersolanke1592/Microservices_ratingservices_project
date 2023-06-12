package com.dig.Rating.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.dig.Rating.entities.Rating;
import com.dig.Rating.services.RatingService;

@RestController
@RequestMapping("/ratings")
public class RatingController {

	@Autowired
	private RatingService ratingService;

	@PostMapping
	public ResponseEntity<Rating> createRatings(@RequestBody Rating rating) {

		Rating rating1 = ratingService.createRatings(rating);
		return ResponseEntity.status(HttpStatus.CREATED).body(rating1);

	}
    
	@GetMapping
	public ResponseEntity<List<Rating>> getAllRatings() {

		List<Rating> rating = ratingService.getAllRatings();
		return ResponseEntity.status(HttpStatus.OK).body(rating);
	}

	@GetMapping("/user/{userId}")
	public ResponseEntity<List<Rating>> getAllRatingsByUserId(@PathVariable String userId) {

		List<Rating> rating = ratingService.getAllByUserId(userId);
		return ResponseEntity.status(HttpStatus.OK).body(rating);
	}

	@GetMapping("/hotel/{hotelId}")
	public ResponseEntity<List<Rating>> getAllRatingsByHotelId(@PathVariable String hotelId) {

		List<Rating> rating = ratingService.getAllByUserId(hotelId);
		return ResponseEntity.status(HttpStatus.OK).body(rating);
	}
}
