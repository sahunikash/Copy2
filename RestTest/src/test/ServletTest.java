package test;

import java.util.ArrayList;
import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import Entiry.Users;

@Path("/test")
public class ServletTest {

	@Path("/get")
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public List<Users> getMsg(@QueryParam("name") String name, @QueryParam("id")String id) {
		System.out.println(name+" "+id);
		List<Users> user = new ArrayList<>();
		Users u = new Users();
		u.setId(1);
		u.setName("T1");
		user.add(u);
		
		

		return user;
	}
	@Path("/get2")
	@POST
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.TEXT_PLAIN)
	public Response getMsg2(Users users) {
		System.out.println(users.getId()+" "+users.getName());

		return Response.status(200).entity("success").build();
	}

}
