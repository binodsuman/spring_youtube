package di;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Demo {

	public static void main(String[] args) {
		
		ApplicationContext ctn = new AnnotationConfigApplicationContext(LogMessageConfiguration.class);
		
		
		ILogMessage log =  ctn.getBean(ILogMessage.class);
		log.getMessage();
		
	}

}
