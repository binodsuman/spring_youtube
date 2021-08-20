package di;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Demo {

	public static void main(String[] args) {
		
		
        ApplicationContext ctn = new AnnotationConfigApplicationContext(LogMessageConfiguration.class);
		
		
		LogMessage log = (LogMessage) ctn.getBean("abcd");
		log.getMessage();
	}

}
