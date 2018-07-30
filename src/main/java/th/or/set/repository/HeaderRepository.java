package th.or.set.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.web.bind.annotation.CrossOrigin;

import th.or.set.model.Header;

@RepositoryRestResource(collectionResourceRel = "header", path = "header")
@CrossOrigin(origins = "http://localhost:8080")
public interface  HeaderRepository extends JpaRepository<Header, Long>{

	

	
}
