package taxiService.model;

import org.javalite.activejdbc.Model;
import org.javalite.activejdbc.annotations.Table;
import taxiService.transfer.DriverDto;

/**
 * Created by Vitaliy on 14.10.2015.
 */
@Table("driver")
public class Driver extends Model {

    public Long getId() {
        return getLong("id");
    }

    public void setId(Long id) {
        setLong("id", id);
    }

    public String getEmployee() {
        return getString("employee");
    }

    public void setEmployee(String employee) {
        setString("employee", employee);
    }

    public String getCarModel() {
        return getString("carModel");
    }

    public void setCarModel(String carModel) {
       setString("carModel", carModel);
    }

    public String getCarNumber() {
        return getString("carNumber");
    }

    public void setCarNumber(String carNumber) {
        setString("carNumber", carNumber);
    }

    public DriverDto toDto(){
        return new DriverDto(this);
    }
}
