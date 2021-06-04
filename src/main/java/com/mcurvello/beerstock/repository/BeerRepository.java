package com.mcurvello.beerstock.repository;

import java.util.Optional;

import com.mcurvello.beerstock.entity.Beer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BeerRepository extends JpaRepository<Beer, Long> {

    Optional<Beer> findByName(String name);
}