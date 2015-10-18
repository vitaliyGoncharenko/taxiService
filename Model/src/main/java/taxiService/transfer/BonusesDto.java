package taxiService.transfer;

import taxiService.model.Bonuses;

/**
 * Created by Vitaliy on 14.10.2015.
 */
public class BonusesDto extends BaseDto{

    private Long id;
    private Long countBonuses;
    private Long discount;
    private Long customerId;

    public BonusesDto() {
    }

    public BonusesDto(Bonuses bonuses) {
        this.id = bonuses.getId();
        this.countBonuses = bonuses.getCountBonuses();
        this.discount = bonuses.getDiscount();
        this.customerId = bonuses.getCustomerId();
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getCountBonuses() {
        return countBonuses;
    }

    public void setCountBonuses(Long countBonuses) {
        this.countBonuses = countBonuses;
    }

    public Long getDiscount() {
        return discount;
    }

    public void setDiscount(Long discount) {
        this.discount = discount;
    }

    public Long getCustomerId() {
        return customerId;
    }

    public void setCustomerId(Long customerId) {
        this.customerId = customerId;
    }
}
