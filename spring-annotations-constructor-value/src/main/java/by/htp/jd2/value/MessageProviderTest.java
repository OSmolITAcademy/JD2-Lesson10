package by.htp.jd2.value;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MessageProviderTest {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = 
				new ClassPathXmlApplicationContext("applicationContext.xml");
		
		MessageProvider provider = context.getBean("messageProvider", MessageProvider.class);
		
		System.out.println(provider.getMessage());
				
		context.close();

	}

}
