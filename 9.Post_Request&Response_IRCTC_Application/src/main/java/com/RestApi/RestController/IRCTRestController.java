package com.RestApi.RestController;

import org.springframework.beans.BeanUtils;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.RestApi.Response.TicketResponse;
import com.RestApi.request.PassangerRequest;

@RestController
public class IRCTRestController {
	
	@PostMapping(value="/bookTicket",
			consumes= {"application/json", "application/xml"},
			produces= {"application/json", "application/xml"})
	public TicketResponse bookTicket(@RequestBody PassangerRequest prequest) {
		//logic to book Ticket
		
		TicketResponse tresponse = new TicketResponse();
		tresponse.setStatus("Confirmed");
		tresponse.setPrice(1500.00);
		BeanUtils.copyProperties(prequest, tresponse);
		return tresponse;
		
	}

}
