package mustafa.BookRide;


import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import mustafa.BookRide.Service.BookingManager;

/**
 * Hello world!
 */

@Configuration
@ComponentScan("mustafa.BookRide")
public class App {
    public static void main(String[] args) {
    	// Create AnnotationConfigApplicationContext
    	AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(App.class);
        
    	// Retrieve two instances of BookingManager bean
    	BookingManager manager1 = ctx.getBean(BookingManager.class);
    	BookingManager manager2 = ctx.getBean(BookingManager.class);
    	
    	// Call bookTicket() method for both instances
    	manager1.bookTicket("Hyderabad", "Mumbai");
    	System.out.println();
    	manager2.bookTicket("Delhi", "Chennai");
    	
    	// Print hashcodes of both BookingManager instances to verify Singleton scope
    	
    	System.out.println("manager1 hashcode: " + manager1.hashCode());
    	System.out.println("manager2 hashcode: " + manager2.hashCode());
    	
    	ctx.close();
    }
}
