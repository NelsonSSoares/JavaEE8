/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package academy.learnprogramming.resource;

import academy.learnprogramming.entities.ApplicationUser;
import javax.ws.rs.BeanParam;
import javax.ws.rs.Consumes;
import javax.ws.rs.CookieParam;
import javax.ws.rs.FormParam;
import javax.ws.rs.HeaderParam;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
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
    @Consumes(MediaType.APPLICATION_FORM_URLENCODED)
    public Response createNewUser(@FormParam("email") String email, @FormParam("password") String password, @HeaderParam("Referer") String referer)){
        return null;
    }
    
    @POST
    @Path("map")
    @Consumes(MediaType.APPLICATION_FORM_URLENCODED)
    public Response createNewUser(MultivaluedMap<String, String> forMap, @Context HttpHeaders httpHeaders{
        
       // httpHeaders.getHeaderString("referer");
        httpHeaders.getRequestHeader("Referer").get(0);
        
        for(String h : httpHeaders.getRequestHeaders().keySet(){
            System.err.println("Header key set "+ h);
        }
        
        String email = forMap.getFirst("email");
        String password = forMap.getFirst("password");
        return null;
    }
    
    @POST
    @Path("bean")
    @Consumes(MediaType.APPLICATION_FORM_URLENCODED)
    public Response createNewUser(@BeanParam ApplicationUser applicationUser, @CookieParam("user") String user){
        
        return null;
    }

}
