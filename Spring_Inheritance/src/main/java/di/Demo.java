package di;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Demo {

	public static void main(String[] args) {
		
		ApplicationContext context = new ClassPathXmlApplicationContext("application_context.xml");
		
		
		University objA = (University) context.getBean("uni");
	      System.out.println(objA.getSubject1());
	      System.out.println(objA.getSubject2());
	      
	      
	      System.out.println("-----------------------");

	      College objB = (College) context.getBean("col");
	      System.out.println(objB.getSubject1());
	      System.out.println(objB.getSubject2());
	      System.out.println(objB.getSubject3());
	      System.out.println(objB.getSubject4());
	}

}
