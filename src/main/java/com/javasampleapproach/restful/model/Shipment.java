package com.javasampleapproach.restful.model;

public class Shipment {
	private int id;
	private String pickupDate;
	private String deliveryDate;
	private String origin;
	private String destination;
	private String carrier;
	private String commodity;
	private Double weight;


	
	public Shipment(int id, String pickupDate, String deliveryDate, String origin, String destination, String carrier,
			String commodity, Double weight) {
		super();
		this.id = id;
		this.pickupDate = pickupDate;
		this.deliveryDate = deliveryDate;
		this.origin = origin;
		this.destination = destination;
		this.carrier = carrier;
		this.commodity = commodity;
		this.weight = weight;
	}

	// id
	public void setId(int id){
		this.id = id;
	}
	
	public int getId(){
		return this.id;
	}

	public String getPickupDate() {
		return pickupDate;
	}

	public void setPickupDate(String pickupDate) {
		this.pickupDate = pickupDate;
	}

	public String getDeliveryDate() {
		return deliveryDate;
	}

	public void setDeliveryDate(String deliveryDate) {
		this.deliveryDate = deliveryDate;
	}

	public String getOrigin() {
		return origin;
	}

	public void setOrigin(String origin) {
		this.origin = origin;
	}

	public String getDestination() {
		return destination;
	}

	public void setDestination(String destination) {
		this.destination = destination;
	}

	public String getCarrier() {
		return carrier;
	}

	public void setCarrier(String carrier) {
		this.carrier = carrier;
	}

	public String getCommodity() {
		return commodity;
	}

	public void setCommodity(String commodity) {
		this.commodity = commodity;
	}

	public Double getWeight() {
		return weight;
	}

	public void setWeight(Double weight) {
		this.weight = weight;
	}
	
	
}
