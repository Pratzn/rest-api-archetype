package th.or.set.controller;

import java.util.Collection;

import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import th.or.set.AbstractController;
import th.or.set.Root;
import th.or.set.model.Header;
import th.or.set.repository.HeaderRepository;


@RestController
@RequestMapping("/header")
public class HeaderController extends AbstractController<HeaderController>{
	
	@Autowired
	private HeaderRepository headerRepository;
	
	@GetMapping("/getAll")
    public Collection<Header> coolCars() {
        return headerRepository.findAll().stream().map((h)->{return h;}).collect(Collectors.toList());
    }
	
	@RequestMapping("/saveOrUpdate")
	public Header saveOrUpdate(Header header) {
		return headerRepository.saveAndFlush(header);
		
	}

}
