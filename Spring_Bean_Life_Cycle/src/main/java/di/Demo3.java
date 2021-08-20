package di;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Demo3 {

	public static void main(String[] args) {
		
		//ApplicationContext ctn = new ClassPathXmlApplicationContext("application_context.xml");
		ConfigurableApplicationContext ctn = new ClassPathXmlApplicationContext("application_context.xml");
				
		LogMessage3 log3 = (LogMessage3) ctn.getBean("log3");
		log3.getMessage();
		
		ctn.close();
	}

}
