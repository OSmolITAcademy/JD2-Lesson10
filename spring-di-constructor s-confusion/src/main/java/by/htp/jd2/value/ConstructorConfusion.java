package by.htp.jd2.value;

import org.springframework.context.support.GenericXmlApplicationContext;

public class ConstructorConfusion {
	private String someValue;

	public ConstructorConfusion(String someValue) {
		System.out.println("ConstructorConfusion(String) called");
		this.someValue = someValue;
	}

	public ConstructorConfusion(int someValue) {
		System.out.println("ConstructorConfusion(int) called");
		this.someValue = "Number: " + Integer.toString(someValue);
	}

	public static void main(String[] args) {
		GenericXmlApplicationContext ctx = new GenericXmlApplicationContext();

		ctx.refresh();
		ctx.load("applicationContext.xml"); 
		
		//ctx.refresh();
		ConstructorConfusion cc = (ConstructorConfusion) ctx.getBean("constructorConfusion");
		System.out.println(cc);
	}

	public String toString() {
		return someValue;
	}
}
