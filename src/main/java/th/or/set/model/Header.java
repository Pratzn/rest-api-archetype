package th.or.set.model;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
@SuppressWarnings("unused")

@Entity
public class Header extends BaseEntity {
	
	@Id 
	@GeneratedValue
	private Long id;
	
	
	private String company;

}
