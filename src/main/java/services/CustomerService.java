package services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import repositories.CustomerRepository;

@Component
public class CustomerService {
    @Autowired
    private CustomerRepository customerRepository;
}
