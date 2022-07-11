/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package academy.learnprogramming.resource;

import academy.learnprogramming.entities.ApplicationUser;
import java.util.concurrent.ExecutorService;
import javax.ws.rs.BeanParam;
import javax.ws.rs.Consumes;
import javax.ws.rs.CookieParam;
import javax.ws.rs.FormParam;
import javax.ws.rs.GET;
import javax.ws.rs.HeaderParam;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.container.AsyncResponse;
import javax.ws.rs.container.Suspended;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.HttpHeaders;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.MultivaluedMap;
import javax.ws.rs.core.Response;

/**
 *
 * @author 015081631
 */
@Path("users")
@Consumes("application/json")
@Produces("application/json")
public class UsersResource {
    
    
    @POST
    @Path("bean")
    @Consumes(MediaType.APPLICATION_FORM_URLENCODED)
    public Response createNewUser(@BeanParam ApplicationUser applicationUser, @CookieParam("user") String user){
        
        return null;
    }
    private ExecutorService executorService = java.util.concurrent.Executors.newCachedThreadPool();

    @POST
    @Path(value = "map")
    @Consumes(value = MediaType.APPLICATION_FORM_URLENCODED)
    public void createNewUser1(@Suspended final AsyncResponse asyncResponse, final MultivaluedMap<String, String> forMap, @Context final HttpHeaders httpHeaders) {
        executorService.submit(new Runnable()
        {
            public void run() {
                asyncResponse.resume(doCreateNewUser(forMap, httpHeaders));
            }
        });
    }

    private Response doCreateNewUser(MultivaluedMap<String, String> forMap, @Context HttpHeaders httpHeaders) {
        httpHeaders.getRequestHeader("Referer").get(0);
        
        for(String h : httpHeaders.getRequestHeaders().keySet(){
            System.err.println("Header key set "+ h);
        }
        
        String email = forMap.getFirst("email");
        String password = forMap.getFirst("password");
        return null;
    }

    @POST
    @Consumes(value = MediaType.APPLICATION_FORM_URLENCODED)
    public void createNewUser11(@Suspended final AsyncResponse asyncResponse, @FormParam(value = "email") final String email, @FormParam(value = "password") final String password, @HeaderParam(value = "Referer") final String referer) {
        executorService.submit(new Runnable()
        {
            public void run() {
                asyncResponse.resume(doCreateNewUser1(email, password, referer));
            }
        });
    }

    private Response doCreateNewUser1(@FormParam("email") String email, @FormParam("password") String password, @HeaderParam("Referer") String referer) {
        return null;
    }
    
    @GET
    @Path("{id}")
    @Produces({MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML})
    public Response getUserById(@PathParam("id") Long id){
        
        return null;
    }
    
    

}
