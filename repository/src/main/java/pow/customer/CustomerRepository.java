package pow.customer;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pow.model.customer.Customer;

@Repository
public interface CustomerRepository extends JpaRepository<Customer, Integer> {
}
