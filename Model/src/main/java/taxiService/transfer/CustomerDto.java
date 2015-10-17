package taxiService.transfer;

import taxiService.model.Customer;

/**
 * Created by Vitaliy on 14.10.2015.
 */
public class CustomerDto {
    private Long id;
    private String fullName;
    private Long phoneNumber;
    private Long bonusesId;
//    private Long discount;

    public CustomerDto() {
    }

    public CustomerDto(Customer customer) {
        this.id = customer.getId();
        this.fullName = customer.getFullName();
        this.phoneNumber = customer.getPhoneNumber();
        this.bonusesId = customer.getBonusesId();
//        this.discount = customer.getDiscount();
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public Long getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(Long phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public Long getBonusesId() {
        return bonusesId;
    }

    public void setBonusesId(Long bonusesId) {
        this.bonusesId = bonusesId;
    }
//
//    public Long getDiscount() {
//        return discount;
//    }
//
//    public void setDiscount(Long discount) {
//        this.discount = discount;
//    }
}
