package taxiService.transfer;

import taxiService.model.CalculationOrder;

import java.sql.Timestamp;
import java.util.List;

/**
 * Created by Vitaliy on 14.10.2015.
 */
public class CalculationOrderDto extends BaseDto{
    private Long id;
    private Long distance;
    private Timestamp travelTime;
    private Timestamp timeOfDeparture;
    private Timestamp arrivalTime;
    private Double rate;
    private Double price;
    private Long driverId;
    private Long orderId;

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
        this.driverId = calculationOrder.getDriverId();
        this.orderId = calculationOrder.getOrderId();
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

    public Long getDriverId() {
        return driverId;
    }

    public void setDriverId(Long driverId) {
        this.driverId = driverId;
    }

    public Long getOrderId() {
        return orderId;
    }

    public void setOrderId(Long orderId) {
        this.orderId = orderId;
    }
}
