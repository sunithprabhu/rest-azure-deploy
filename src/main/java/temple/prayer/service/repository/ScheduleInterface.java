package temple.prayer.service.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import temple.prayer.service.model.Schedule;

@Repository
public interface ScheduleInterface extends JpaRepository<Schedule, String>{
	
	Schedule findBydayName(String dayName);

}
