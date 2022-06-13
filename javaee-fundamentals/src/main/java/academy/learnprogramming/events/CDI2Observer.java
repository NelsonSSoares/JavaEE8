/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package academy.learnprogramming.events;


import java.util.logging.Level;
import java.util.logging.Logger;
import javax.annotation.Priority;
import javax.enterprise.context.ApplicationScoped;
import javax.enterprise.event.Observes;
import javax.inject.Inject;

/**
 *
 * @author 015081631
 */

@ApplicationScoped
public class CDI2Observer {
    
    @Inject
    Logger logger;
    
      void greetingReceiver1(@Observes  String greeting){
        logger.log(Level.INFO, "Greeting 2 with higher priority invoked with message{0}", greeting + "1");
    } 
    
    void greetingReceiver2(@Observes  String greeting){
        logger.log(Level.INFO, "Greeting 2 with higher priority invoked with message{0}", greeting + "2");
    }
}
