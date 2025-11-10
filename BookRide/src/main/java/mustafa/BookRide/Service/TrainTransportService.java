package mustafa.BookRide.Service;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component("trainService")
@Scope("singleton")

public class TrainTransportService implements TransportService{

	@Override
	public void book(String source, String destination) {
		System.out.println("Booking Train from <source> to <destination>"
);
		
	}

}
