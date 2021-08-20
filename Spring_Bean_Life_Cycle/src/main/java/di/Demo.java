package di;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Demo {

	public static void main(String[] args) {
		
		ApplicationContext ctn = new ClassPathXmlApplicationContext("application_context.xml");
		
		LogMessage log = (LogMessage) ctn.getBean("log");
		log.getMessage();
		
		((AbstractApplicationContext) ctn).registerShutdownHook();

	}

}
