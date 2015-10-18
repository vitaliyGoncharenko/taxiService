package taxiService.model;

import org.javalite.activejdbc.Model;
import org.javalite.activejdbc.annotations.BelongsTo;
import org.javalite.activejdbc.annotations.BelongsToParents;
import org.javalite.activejdbc.annotations.Table;

import java.sql.Timestamp;

/**
 * Created by Vitaliy on 14.10.2015.
 */
@Table("calculationOrder")
@BelongsToParents({
        @BelongsTo(parent = Driver.class, foreignKeyName = "driver_id"),
        @BelongsTo(parent = Order.class, foreignKeyName = "order_id")
})
public class CalculationOrder extends Model {

    public Long getId() {
        return getLong("id");
    }

    public void setId(Long id) {
        setLong("id", id);
    }

    public Long getDistance() {
        return getLong("distance");
    }

    public void setDistance(Long distance) {
        setLong("distance", distance);
    }

    public Timestamp getTravelTime() {
        return getTimestamp("travelTime");
    }

    public void setTravelTime(Timestamp travelTime) {
        setTimestamp("travelTime", travelTime);
    }

    public Timestamp getTimeOfDeparture() {
        return getTimestamp("timeOfDeparture");
    }

    public void setTimeOfDeparture(Timestamp timeOfDeparture) {
        setTimestamp("timeOfDeparture", timeOfDeparture);
    }

    public Timestamp getArrivalTime() {
        return getTimestamp("arrivalTime");
    }

    public void setArrivalTime(Timestamp arrivalTime) {
        setTimestamp("arrivalTime", arrivalTime);
    }

    public Double getRate() {
        return getDouble("rate");
    }

    public void setRate(Double rate) {
        setDouble("rate", rate);
    }

    public Double getPrice() {
        return getDouble("price");
    }

    public void setPrice(Double price) {
        setDouble("price", price);
    }

    public Long getDriverId() {
        return getLong("driver_id");
    }

    public void setDriverId(Long driverId) {
        setLong("driver_id", driverId);
    }

    public Long getOrderId() {
        return getLong("order_id");
    }

    public void setOrderId(Long orderId) {
        setLong("order_id", orderId);
    }
}
