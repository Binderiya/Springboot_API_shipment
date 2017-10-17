package com.javasampleapproach.restful.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.javasampleapproach.restful.model.Shipment;

@RestController
@RequestMapping(value = "/api")
public class WebController {

	private Map<Integer, Shipment> shipments = new HashMap<Integer, Shipment>() {

		private static final long serialVersionUID = 1L;

		{
			put(1, new Shipment(1, "2017-10-17 01:22:11", "2018-10-17 01:22:11", "california", "washington", "car", "commodity", 50.00));
			put(2, new Shipment(2, "2017-10-17 01:22:11", "2018-10-17 01:22:11", "california", "washington", "car", "commodity", 50.00));
			put(3, new Shipment(3, "2017-10-17 01:22:11", "2018-10-17 01:22:11", "california", "washington", "car", "commodity", 50.00));
		}
	};

	@GetMapping(value = "/shipment", produces = MediaType.APPLICATION_JSON_VALUE)
	public List<Shipment> getAll() {
		List<Shipment> results = shipments.entrySet().stream().map(entry -> entry.getValue())
				.collect(Collectors.toList());
		return results;
	}
}