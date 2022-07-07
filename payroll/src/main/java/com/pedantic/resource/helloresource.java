/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.pedantic.resource;

import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.core.Response;

/**
 *
 * @author 015081631
 */

@Path("hello")
public class helloresource {
    
    @Path("{name}")
    public Response sayHello(@PathParam("name") String name){
        String greeting = "Hello" + name;
        return Response.ok(greeting).build();
    } 
}
