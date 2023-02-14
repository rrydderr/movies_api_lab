package com.bnta.movies_api.repositiories;

import com.bnta.movies_api.models.Movie;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MovieRepository extends JpaRepository<Movie, Long> {
}
