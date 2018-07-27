package th.or.set.model;

import java.math.BigDecimal;

import org.apache.commons.lang3.builder.ToStringBuilder;

public class Entity {
	private String name;
	private BigDecimal price;
	
	public Entity() {
		super();
		System.out.println("Contructor: "+ToStringBuilder.reflectionToString(this));
	}
	
	public static void main(String[] args) {
		Entity entity = new Entity();
		System.out.println("main: "+entity.toString());
	}

	public BigDecimal getPrice() {
		return price;
	}

	public void setPrice(BigDecimal price) {
		this.price = price;
	}
	
	public String toString() {
		      return new ToStringBuilder(this).
		        append("name", name).
		        append("price", price).
		        toString();
		    }

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	

}
