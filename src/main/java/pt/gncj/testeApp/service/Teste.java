package pt.gncj.testeApp.service;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

@Path("/TesteService/")
public interface Teste {

	@GET
	@Path("/testeApp")
	@Produces({ MediaType.APPLICATION_JSON + ";charset=UTF-8" })
	public Response createPosInfo(@QueryParam("input") String input);

}
