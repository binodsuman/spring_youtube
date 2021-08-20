package di;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Demo {

	public static void main(String[] args) {
		
		ApplicationContext ctn = new ClassPathXmlApplicationContext("application_context.xml");
		
		/*
		DebitCard debit = (DebitCard)ctn.getBean("dcard");
		debit.details();
		System.out.println(debit.address.name);
		System.out.println(debit.address.city);
		*/
		
		CreditCard credit = ctn.getBean("ccard", CreditCard.class);
		credit.details();
		
		credit.limit = 10000;
		
		CreditCard credit1 = ctn.getBean("ccard", CreditCard.class);
		credit1.details();
		
		credit1.limit = 70000;
		
		CreditCard credit2 = ctn.getBean("ccard", CreditCard.class);
		credit2.details();
		
		
		

	}

}
