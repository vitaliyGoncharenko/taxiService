package taxiService.model;

import org.javalite.activejdbc.Model;
import org.javalite.activejdbc.annotations.BelongsTo;
import org.javalite.activejdbc.annotations.Table;
import taxiService.transfer.BonusesDto;

/**
 * Created by Vitaliy on 14.10.2015.
 */
@Table("bonuses")
@BelongsTo(parent = Customer.class, foreignKeyName = "customer_id")
public class Bonuses extends Model {

    public Long getId() {
        return getLong("id");
    }

    public void setId(Long id) {
        setLong("id", id);
    }

    public Long getCountBonuses() {
        return getLong("countBonuses");
    }

    public void setCountBonuses(Long countBonuses) {
        setLong("countBonuses", countBonuses);
    }

    public Long getDiscount() {
        return getLong("discount");
    }

    public void setDiscount(Long discount) {
        setLong("discount", discount);
    }

    public Long getCustomerId() {
        return getLong("customer_id");
    }

    public void setCustomerId(Long customerId) {
        setLong("customer_id", customerId);
    }

    public BonusesDto toDto(){
        return new BonusesDto(this);
    }
}
