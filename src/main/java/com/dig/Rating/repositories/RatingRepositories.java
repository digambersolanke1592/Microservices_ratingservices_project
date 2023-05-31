package com.dig.Rating.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.dig.Rating.entities.Rating;

@Repository
public interface RatingRepositories extends JpaRepository<Rating, String> {

	List<Rating> findByuserId(String userId);
	List<Rating> findByHotelId(String hotelId);

}
