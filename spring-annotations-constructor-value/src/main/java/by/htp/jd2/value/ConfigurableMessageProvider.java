package by.htp.jd2.value;

import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.beans.factory.annotation.Autowired;

@Service("messageProvider")
public class ConfigurableMessageProvider implements MessageProvider {
	private String message;

	@Autowired
	public ConfigurableMessageProvider(@Value("Configurable message") String message) {
		this.message = message;
	}

	@Override
	public String getMessage() {
		return this.message;
	}
}
