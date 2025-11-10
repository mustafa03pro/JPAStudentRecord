package mustafa.BookRide.Service;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component("busService")
@Scope("singleton")

public class BusTransportService implements TransportService{

	@Override
	public void book(String source, String destination) {
		System.out.println("Booking Bus from "+source+" to "+destination);
		
	}

}
