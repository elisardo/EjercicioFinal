package es.uax.jaxrsserver;


import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.core.Response;

@Path("/hola")
public class HolaMundo {
	@GET
	@Path("/{param}")
	public Response getMsg(@PathParam("param") String msg){
		String output = "Hola estudiante: "+msg;
		return Response.status(200).entity(output).build();
	}
}
