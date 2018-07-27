package th.or.set.controller;

import java.util.Collection;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import th.or.set.model.Header;
import th.or.set.repository.HeaderRepository;
@SuppressWarnings("unused")
@RestController
public class HeaderController {
	
	@Autowired
	private HeaderRepository headerRepository;
	
	@GetMapping("/all-header")
    public Collection<Header> coolCars() {
        return headerRepository.findAll().stream().map((h)->{return h;}).collect(Collectors.toList());
    }

}
