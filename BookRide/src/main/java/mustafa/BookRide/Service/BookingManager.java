package mustafa.BookRide.Service;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component

@Scope("singleton")
public class BookingManager {
	@Qualifier("trainService")
	private TransportService transportService;
	
	public void bookTicket(String src, String dest) {
		transportService.book(src, dest);
		
	}


	
	
	


}
