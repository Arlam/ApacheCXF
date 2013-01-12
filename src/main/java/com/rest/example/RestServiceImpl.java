package com.rest.example;

import java.util.ArrayList;
import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.rest.pojo.Person;

@Path("/hello/")
public class RestServiceImpl {

    @GET
    @Consumes({MediaType.APPLICATION_JSON})
    @Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON})
	public Person getJson() {
		List<Person> persons = new  ArrayList<Person>();
		Person person = new Person();
		person.setName("Name");
		person.setDescription("description");
		persons.add(person);
		return person;
	}

}

