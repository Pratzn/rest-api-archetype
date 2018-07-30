package th.or.set.model;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;
@SuppressWarnings("unused")

@Entity
@Table(name = "HEADER")
public class Header extends BaseEntity {
	
	public Header() {
		super();
		// TODO Auto-generated constructor stub
	}


	public Header(Long id, String company) {
		super();
		this.setId(id);
		this.setCompany(company);
	}


	public Long getId() {
		return id;
	}


	public void setId(Long id) {
		this.id = id;
	}


	public String getCompany() {
		return company;
	}


	public void setCompany(String company) {
		this.company = company;
	}


	@Id 
	@GeneratedValue
	private Long id;
	
	
	private String company;

}
