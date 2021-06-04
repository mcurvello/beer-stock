package com.mcurvello.beerstock.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import com.mcurvello.beerstock.dto.BeerDTO;
import com.mcurvello.beerstock.entity.Beer;

@Mapper
public interface BeerMapper {

    BeerMapper INSTANCE = Mappers.getMapper(BeerMapper.class);

    Beer toModel(BeerDTO beerDTO);

    BeerDTO toDTO(Beer beer);
}