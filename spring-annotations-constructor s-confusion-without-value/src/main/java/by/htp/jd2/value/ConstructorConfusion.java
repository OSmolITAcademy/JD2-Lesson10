package by.htp.jd2.value;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.support.GenericXmlApplicationContext;
import org.springframework.stereotype.Service;

@Service("constructorConfusion")
public class ConstructorConfusion {
	private String someValue;

	public ConstructorConfusion(String someValue) {
		System.out.println("ConstructorConfusion(String) called");
		this.someValue = someValue;
	}

	@Autowired
	public ConstructorConfusion(int someValue) {
		System.out.println("ConstructorConfusion(int) called");
		this.someValue = "Number: " + Integer.toString(someValue);
	}

	public static void main(String[] args) {
		GenericXmlApplicationContext ctx = new GenericXmlApplicationContext();
		ctx.load("applicationContext.xml");
		ctx.refresh();
		ConstructorConfusion cc = (ConstructorConfusion) ctx.getBean("constructorConfusion");
		System.out.println(cc);
	}

	public String toString() {
		return someValue;
	}
}
