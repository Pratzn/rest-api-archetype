package th.or.set;

import java.util.UUID;

import org.springframework.beans.factory.ObjectFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.convert.ConversionService;
import org.springframework.data.rest.webmvc.config.RepositoryRestMvcConfiguration;

import th.or.set.model.Header;
import th.or.set.repository.HeaderRepository;

@SpringBootApplication
public class SetRestApiArchetypeApplication  implements CommandLineRunner{

	public static void main(String[] args) {
		SpringApplication.run(SetRestApiArchetypeApplication.class, args);
	}

//	@Configuration
//	static class RestConfig extends RepositoryRestMvcConfiguration {
//
//		public RestConfig(ApplicationContext context, ObjectFactory<ConversionService> conversionService) {
//			super(context, conversionService);
//			// TODO Auto-generated constructor stub
//		}
//	}
	@Autowired
	HeaderRepository repository;
	@Override
	public void run(String... args) throws Exception {
		System.out.println(repository.count());
//		repository.save(new Header(1l,"HMPRO"));
//		repository.save(new Header(2l,"PTT"));
		
	}
}
