package academy.learnprogramming.producers;

import academy.learnprogramming.interfaces.Salute;
import academy.learnprogramming.sessionbeans.Police;
import javax.enterprise.inject.Produces;
import javax.enterprise.inject.spi.InjectionPoint;
import java.util.logging.Logger;
import javax.enterprise.context.Dependent;
//import javax.persistence.EntityManager;
//import javax.persistence.PersistenceContext;

public class LoggerProducer {

    @Produces
    @Dependent
    public Logger produceLogger(InjectionPoint injectionPoint) {
        return Logger.getLogger(injectionPoint.getMember().getDeclaringClass().getName());
    }
    
    //@Produces
    //@PersistenceContext
    //EntityManager entityManager;
    
    //@Produces
    //@academy.learnprogramming.annotations.Police
    //public Salute getSalutation(){
    //    return new Police();
    //}
}
