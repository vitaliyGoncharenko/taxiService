package taxiService.model;

import org.javalite.activejdbc.Model;
import org.javalite.activejdbc.annotations.Table;

import java.sql.Timestamp;

/**
 * Created by Vitaliy on 14.10.2015.
 */
@Table("calculationOrder")
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

    public Long getDriver_id() {
        return getLong("driver_id");
    }

    public void setDriver_id(Long driver_id) {
        setLong("driver_id", driver_id);
    }
}
