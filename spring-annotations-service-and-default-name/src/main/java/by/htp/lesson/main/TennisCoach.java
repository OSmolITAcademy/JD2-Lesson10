package by.htp.lesson.main;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

//@Component
@Service
public class TennisCoach implements Coach {

	public String getDailyWorkout() {
		return "Practice your backhand volley";
	}
}
