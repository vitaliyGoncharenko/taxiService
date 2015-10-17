package taxiService.transfer;

import taxiService.model.Order;

import java.sql.Timestamp;

/**
 * Created by Vitaliy on 14.10.2015.
 */
public class OrderDto {

    private Long id;
    private Long customer_id;
    private Long calculationOrder_id;
    private String departureAddress;
    private String arrivalAddress;
    private Timestamp currentDate;

    public OrderDto() {
    }

    public OrderDto(Order order) {
        this.id = order.getId();
        this.customer_id = order.getCustomer_id();
        this.calculationOrder_id = order.getCalculationOrder_id();
        this.departureAddress = order.getDepartureAddress();
        this.arrivalAddress = order.getArrivalAddress();
        this.currentDate = order.getCurrentDate();
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getCustomer_id() {
        return customer_id;
    }

    public void setCustomer_id(Long customer_id) {
        this.customer_id = customer_id;
    }

    public Long getCalculationOrder_id() {
        return calculationOrder_id;
    }

    public void setCalculationOrder_id(Long calculationOrder_id) {
        this.calculationOrder_id = calculationOrder_id;
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
