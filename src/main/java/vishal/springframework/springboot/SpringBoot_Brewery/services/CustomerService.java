package vishal.springframework.springboot.SpringBoot_Brewery.services;

import vishal.springframework.springboot.SpringBoot_Brewery.web.model.CustomerDto;

import java.util.UUID;

public interface CustomerService {

    CustomerDto getCustomerId(UUID customerId);

    CustomerDto saveNewCustomer(CustomerDto customerDto);

    void updateCustomer(UUID customerId, CustomerDto customerDto);

    void delete(UUID customerId);
}
