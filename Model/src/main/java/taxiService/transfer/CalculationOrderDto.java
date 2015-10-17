package taxiService.transfer;

import taxiService.model.CalculationOrder;

import java.sql.Timestamp;

/**
 * Created by Vitaliy on 14.10.2015.
 */
public class CalculationOrderDto {
    private Long id;
    private Long distance;
    private Timestamp travelTime;
    private Timestamp timeOfDeparture;
    private Timestamp arrivalTime;
    private Double rate;
    private Double price;
    private Long driver_id;

    public CalculationOrderDto() {
    }

    public CalculationOrderDto(CalculationOrder calculationOrder) {
        this.id = calculationOrder.getId();
        this.distance = calculationOrder.getDistance();
        this.travelTime = calculationOrder.getTravelTime();
        this.timeOfDeparture = calculationOrder.getTimeOfDeparture();
        this.arrivalTime = calculationOrder.getArrivalTime();
        this.rate = calculationOrder.getRate();
        this.price = calculationOrder.getPrice();
        this.driver_id = calculationOrder.getDriver_id();
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getDistance() {
        return distance;
    }

    public void setDistance(Long distance) {
        this.distance = distance;
    }

    public Timestamp getTravelTime() {
        return travelTime;
    }

    public void setTravelTime(Timestamp travelTime) {
        this.travelTime = travelTime;
    }

    public Timestamp getTimeOfDeparture() {
        return timeOfDeparture;
    }

    public void setTimeOfDeparture(Timestamp timeOfDeparture) {
        this.timeOfDeparture = timeOfDeparture;
    }

    public Timestamp getArrivalTime() {
        return arrivalTime;
    }

    public void setArrivalTime(Timestamp arrivalTime) {
        this.arrivalTime = arrivalTime;
    }

    public Double getRate() {
        return rate;
    }

    public void setRate(Double rate) {
        this.rate = rate;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public Long getDriver_id() {
        return driver_id;
    }

    public void setDriver_id(Long driver_id) {
        this.driver_id = driver_id;
    }
}
