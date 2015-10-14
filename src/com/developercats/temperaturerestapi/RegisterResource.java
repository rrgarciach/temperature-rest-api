package com.developercats.temperaturerestapi;

import javax.ws.rs.BeanParam;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

@Path("/registers")
@Produces(MediaType.APPLICATION_JSON)
public class RegisterResource {
	@GET
	public Response getRegisters() {
		return Response.status(200).entity("OK with GET").build();
	}
	
	@GET
	@Path("{id}")
	public Response getRegisterByDate() {
		return Response.status(200).entity("OK with GET by ID").build();
	}
	
	@POST
	public Response saveRegister(@BeanParam RegisterBean register) {
		return Response.status(201).entity("OK with the POST").build();
	}
}
