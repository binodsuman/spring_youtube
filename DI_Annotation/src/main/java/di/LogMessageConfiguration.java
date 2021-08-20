package di;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "di")
public class LogMessageConfiguration {

	@Bean(name="abcd")
	public LogMessage log() { // "log" would be the bean name
		return new LogMessage();
	}
}
