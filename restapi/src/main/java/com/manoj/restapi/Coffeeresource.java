package com.manoj.restapi;


import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import java.util.Arrays;
import java.util.List;
@Path("coffee")
public class Coffeeresource {
	
	@GET 
	@Produces(MediaType.APPLICATION_XML)
	
	public List<Coffee> getCoffee()
	{
	System.out.println("this is called");
	Coffee a1=new Coffee();	
	a1.setName("cold coffee");
	a1.setPrice(180);
	Coffee a2=new Coffee();
	a2.setName("cappuccino");
	a2.setPrice(150);
	Coffee a3=new Coffee();
	a3.setName("americano");
	a3.setPrice(220);
	List<Coffee> coffee = Arrays.asList(a1,a2,a3);
	return coffee;
	}
	  

}
