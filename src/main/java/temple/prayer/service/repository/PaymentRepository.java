package temple.prayer.service.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import temple.prayer.service.model.Payment;


@Repository
public interface PaymentRepository extends JpaRepository<Payment, String>{
	
	Payment findByorderId(String orderId);
	
	List<Payment> findBypaymentStatus(String paymentstatus);

}
