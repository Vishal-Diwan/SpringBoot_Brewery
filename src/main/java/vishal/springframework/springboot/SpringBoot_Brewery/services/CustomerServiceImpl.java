package vishal.springframework.springboot.SpringBoot_Brewery.services;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import sun.rmi.runtime.Log;
import vishal.springframework.springboot.SpringBoot_Brewery.web.model.CustomerDto;

import java.util.UUID;

@Slf4j
@Service
public class CustomerServiceImpl implements CustomerService{

    @Override
    public CustomerDto getCustomerId(UUID customerId){

        return CustomerDto.builder().id(UUID.randomUUID())
                .customerName("Vishal")
                .build();
    }

    @Override
    public CustomerDto saveNewCustomer(CustomerDto customerDto) {
        return CustomerDto.builder()
                .id(UUID.randomUUID())
                .build();
    }

    @Override
    public void updateCustomer(UUID customerId, CustomerDto customerDto) {

    }

    @Override
    public void delete(UUID customerId) {
        log.debug("Deleting a Customer...");

    }
}
