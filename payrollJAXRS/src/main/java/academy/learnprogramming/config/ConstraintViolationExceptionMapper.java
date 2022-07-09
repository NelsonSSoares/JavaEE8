/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package academy.learnprogramming.config;

import java.util.HashMap;
import java.util.Map;
import javax.validation.ConstraintViolation;
import javax.validation.ConstraintViolationException;
import javax.ws.rs.core.Response;
import javax.ws.rs.ext.ExceptionMapper;
import javax.ws.rs.ext.Provider;

/**
 *
 * @author 015081631
 */

@Provider
public class ConstraintViolationExceptionMapper implements ExceptionMapper<ConstraintViolationException>{
    
    @Override
    public Response toResponse(ConstraintViolationException exception){
        
       final Map<String, String> constraintViolations = new HashMap<>();
       
       for(ConstraintViolation cv : exception.getConstraintViolations()){
           String path= cv.getPropertyPath().toString().split("\\.")[2];
           constraintViolations.put(path, cv.getMessage());
       }
       
       return Response.status(Response.Status.PRECONDITION_FAILED).entity(constraintViolations).build();
    }
    
}
