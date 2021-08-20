package di;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Demo {

	public static void main(String[] args) {
		
		ApplicationContext ctn = new ClassPathXmlApplicationContext("application_context_debit.xml");
		
		DebitCard dcard = (DebitCard) ctn.getBean("dcard");
		dcard.details();
		
		System.out.println(dcard.add2.name);
		System.out.println(dcard.add2.city);

	}

}
