package taxiService.transfer;

import taxiService.model.Bonuses;
import taxiService.model.CalculationOrder;
import taxiService.model.Order;

import java.sql.Timestamp;

/**
 * Created by Vitaliy on 14.10.2015.
 */
public class OrderDto extends BaseDto{

    private Long id;
    private Long customerId;
    private Long calculationOrderId;
    private String departureAddress;
    private String arrivalAddress;
    private Timestamp currentDate;
    private CalculationOrderDto calculationOrderDto;

    public OrderDto() {
    }

    public OrderDto(Order order) {
        this.id = order.getId();
        this.customerId = order.getCustomerId();
        this.calculationOrderId = order.getCalculationOrderId();
        this.departureAddress = order.getDepartureAddress();
        this.arrivalAddress = order.getArrivalAddress();
        this.currentDate = order.getCurrentDate();
        calculationOrderDto= new CalculationOrderDto(order.getAll(CalculationOrder.class).get(0));
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getCustomerId() {
        return customerId;
    }

    public void setCustomerId(Long customerId) {
        this.customerId = customerId;
    }

    public Long getCalculationOrderId() {
        return calculationOrderId;
    }

    public void setCalculationOrderId(Long calculationOrderId) {
        this.calculationOrderId = calculationOrderId;
    }

    public String getDepartureAddress() {
        return departureAddress;
    }

    public void setDepartureAddress(String departureAddress) {
        this.departureAddress = departureAddress;
    }

    public String getArrivalAddress() {
        return arrivalAddress;
    }

    public void setArrivalAddress(String arrivalAddress) {
        this.arrivalAddress = arrivalAddress;
    }

    public Timestamp getCurrentDate() {
        return currentDate;
    }

    public void setCurrentDate(Timestamp currentDate) {
        this.currentDate = currentDate;
    }

}
