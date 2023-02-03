package temple.prayer.service.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import temple.prayer.service.model.Believers;

public interface BelieverRepository extends JpaRepository<Believers, Long>{
	
	Believers findByProfileNumber(char[] profileNumber);
}
