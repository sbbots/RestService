package com.sbbots.rest;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

@Path("hello")
public class RestService {

	@GET
	@Path("/{param}")
	public Response getMsg(@PathParam("param") String msg) {
       System.out.println("Test");
		String output = "Jersey say :" + msg;
		return Response.status(200).entity(output).build();
	}

}
