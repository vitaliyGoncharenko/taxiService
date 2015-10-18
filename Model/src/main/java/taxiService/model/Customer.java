package taxiService.model;

import org.javalite.activejdbc.Model;
import org.javalite.activejdbc.annotations.BelongsTo;
import org.javalite.activejdbc.annotations.Table;
import taxiService.transfer.CustomerDto;

/**
 * Created by Vitaliy on 14.10.2015.
 */
@Table("customer")
public class Customer extends Model {

    public Long getId() {
        return getLong("id");
    }

    public void setId(Long id) {
        setLong("id", id);
    }

    public String getFullName() {
        return getString("fullName");
    }

    public void setFullName(String fullName) {
        setString("fullName", fullName);
    }

    public Long getPhoneNumber() {
        return getLong("phoneNumber");
    }

    public void setPhoneNumber(Long phoneNumber) {
        setLong("phoneNumber", phoneNumber);
    }

    public CustomerDto toDto(){
        return new CustomerDto(this);
    }
}
