package taxiService.model;

import org.javalite.activejdbc.Model;
import org.javalite.activejdbc.annotations.BelongsTo;
import org.javalite.activejdbc.annotations.Table;
import taxiService.transfer.OrderDto;

import java.sql.Timestamp;

/**
 * Created by Vitaliy on 14.10.2015.
 */
@Table("order")
@BelongsTo(parent = Customer.class, foreignKeyName = "customer_id")
public class Order extends Model {

    public Long getId() {
        return getLong("id");
    }

    public void setId(Long id) {
        setLong("id",id);
    }

    public Long getCalculationOrderId() {
        return getLong("calculationOrder_id");
    }

    public void setCalculationOrderId(Long calculationOrderId) {
        setLong("calculationOrder_id",calculationOrderId);
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

    public Long getCustomerId() {
        return getLong("customer_id");
    }

    public void setCustomerId(Long customerId) {
        setLong("customr_id", customerId);
    }

    public OrderDto toDto(){
        return new OrderDto(this);
    }
}
