package th.or.set;

import org.springframework.beans.factory.ObjectFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.convert.ConversionService;
import org.springframework.data.rest.webmvc.config.RepositoryRestMvcConfiguration;

@SpringBootApplication
public class SetRestApiArchetypeApplication {

	public static void main(String[] args) {
		SpringApplication.run(SetRestApiArchetypeApplication.class, args);
	}

	@Configuration
	static class RestConfig extends RepositoryRestMvcConfiguration {

		public RestConfig(ApplicationContext context, ObjectFactory<ConversionService> conversionService) {
			super(context, conversionService);
			// TODO Auto-generated constructor stub
		}
	}
}
