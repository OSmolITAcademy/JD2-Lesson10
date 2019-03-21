package by.htp.lesson.main;

import org.springframework.stereotype.Component;

@Component("thatSillyCoach")
public class TennisCoach implements Coach{

	public String getDailyWorkout() {
		return "Practice your backhand volley";
	}

}
