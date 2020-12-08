package vishal.springframework.springboot.SpringBoot_Brewery.services;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import vishal.springframework.springboot.SpringBoot_Brewery.web.model.BeerDto;

import java.util.UUID;

@Slf4j
@Service
public class BeerServiceImpl implements BeerService {
    @Override
    public BeerDto getBeerById(UUID beerId) {
        return BeerDto.builder().id(UUID.randomUUID())
                .beerName("Tuborg")
                .beerStyle("Pale ale")
                .build();

    }

    @Override
    public BeerDto saveNewBeer(BeerDto beerDto) {
        return BeerDto.builder()
                .id(UUID.randomUUID())
                .build();
    }

    @Override
    public void updateBeer(UUID beerId, BeerDto beerDto) {

    }

    @Override
    public void delete(UUID beerId) {
        log.debug("Deleting a beer...");
    }
}
