package taxiService.model;

import org.javalite.activejdbc.Model;
import org.javalite.activejdbc.annotations.BelongsTo;
import org.javalite.activejdbc.annotations.Table;
import taxiService.transfer.CustomerDto;

/**
 * Created by Vitaliy on 14.10.2015.
 */
@Table("customer")
//@BelongsTo(parent = Bonuses.class, foreignKeyName = "bonuses_id"),
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

    public Long getBonusesId() {
        return getLong("bonuses_id");
    }

    public void setBonusesId(Long bonuses_id) {
        setLong("bonuses_id", bonuses_id);
    }

    public Long getDiscount() {
        return getLong("discount");
    }

    public void setDiscount(Long discount) {
        setLong("discount", discount);
    }

    public CustomerDto toDto(){
        return new CustomerDto(this);
    }
}
