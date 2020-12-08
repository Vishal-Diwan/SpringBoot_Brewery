package vishal.springframework.springboot.SpringBoot_Brewery.services;

import vishal.springframework.springboot.SpringBoot_Brewery.web.model.BeerDto;

import java.util.UUID;

public interface BeerService {
    BeerDto getBeerById(UUID beerId);

    BeerDto saveNewBeer(BeerDto beerDto);

    void updateBeer(UUID beerId, BeerDto beerDto);

    void delete(UUID beerId);
}
