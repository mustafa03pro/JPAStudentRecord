package mustafa.BookRide.Service;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component("flightService")
@Scope("singleton")

public class FlightTransportService implements TransportService{

	@Override
	public void book(String source, String destination) {
		System.out.println("Booking Flight from <source> to <destination>"
);
		
	}

}
