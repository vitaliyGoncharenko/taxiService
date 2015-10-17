package taxiService.model;

import org.javalite.activejdbc.Model;
import org.javalite.activejdbc.annotations.Table;
import taxiService.transfer.OrderDto;

import java.sql.Timestamp;

/**
 * Created by Vitaliy on 14.10.2015.
 */
@Table("order")
public class Order extends Model {

    public Long getId() {
        return getLong("id");
    }

    public void setId(Long id) {
        setLong("id",id);
    }

    public Long getCustomer_id() {
        return getLong("customer_id");
    }

    public void setCustomer_id(Long customer_id) {
        setLong("customr_id", customer_id);
    }

    public Long getCalculationOrder_id() {
        return getLong("calculationOrder_id");
    }

    public void setCalculationOrder_id(Long calculationOrder_id) {
        setLong("calculationOrder_id",calculationOrder_id);
    }

    public String getDepartureAddress() {
        return getString("departureAddress");
    }

    public void setDepartureAddress(String departureAddress) {
        setString("departureAddress", departureAddress);
    }

    public String getArrivalAddress() {
        return getString("arrivalAddress");
    }

    public void setArrivalAddress(String arrivalAddress) {
        setString("arrivalAddress",arrivalAddress);
    }

    public Timestamp getCurrentDate() {
        return getTimestamp("currentDate");
    }

    public void setCurrentDate(Timestamp currentDate) {
        setTimestamp("currentDate",currentDate);
    }

    public OrderDto toDto(){
        return new OrderDto(this);
    }
}
