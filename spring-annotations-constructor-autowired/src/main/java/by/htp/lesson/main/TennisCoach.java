package by.htp.lesson.main;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class TennisCoach implements Coach {

	private FortuneService fortuneService;
	
	@Autowired
	public TennisCoach(FortuneService theFortuneService) {
		fortuneService = theFortuneService;
	}
	

	public TennisCoach(FortuneService theFortuneService, FortuneService theFortuneService2) {
		fortuneService = theFortuneService;
	}

	public String getDailyWorkout() {
		return "Practice your backhand volley";
	}

	public String getDailyFortune() {
		return fortuneService.getFortune();
	}
}
