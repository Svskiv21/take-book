package pow.controller.customer;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import pow.model.customer.Customer;
import pow.service.customer.CustomerService;

import java.util.List;

@RestController
@AllArgsConstructor
public class CustomerController {

    private final CustomerService service;

    @GetMapping("/customers")
    public List<Customer> getCustomers(){
        return service.getCustomers();
    }
}
