package di;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Demo2 {

	public static void main(String[] args) {
		
		//ApplicationContext ctn = new ClassPathXmlApplicationContext("application_context.xml");
		ConfigurableApplicationContext ctn = new ClassPathXmlApplicationContext("application_context.xml");
				
		LogMessage2 log2 = (LogMessage2) ctn.getBean("log2");
		log2.getMessage();
		
		ctn.close();
	}

}
