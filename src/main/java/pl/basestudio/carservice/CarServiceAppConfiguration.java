package pl.basestudio.carservice;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import pl.basestudio.carservice.services.AppIssuesService;
import pl.basestudio.carservice.services.IssuesService;
@Configuration
public class CarServiceAppConfiguration {
	
	@Bean
	public IssuesService issueService() {
		return new AppIssuesService();
	}
}
