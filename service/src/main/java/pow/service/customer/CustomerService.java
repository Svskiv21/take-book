package pow.service.customer;

import jakarta.annotation.PostConstruct;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pow.customer.CustomerRepository;
import pow.model.customer.Customer;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

@Service
@AllArgsConstructor
public class CustomerService {

    @Autowired(required = false)
    private CustomerRepository customerRepository;

    @PostConstruct
    public void initCustomer(){
        customerRepository.saveAll(Stream.of(new Customer(1, "Michał", "Czegus"), new Customer(2, "Natalia", "Krukar"))
                .collect(Collectors.toList()));
    }
    public List<Customer> getCustomers(){
        return customerRepository.findAll();
    }
}
