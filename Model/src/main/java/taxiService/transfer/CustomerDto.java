package taxiService.transfer;

import taxiService.model.Bonuses;
import taxiService.model.Customer;
import taxiService.model.Order;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Vitaliy on 14.10.2015.
 */
public class CustomerDto extends BaseDto{
    private Long id;
    private String fullName;
    private Long phoneNumber;
    private BonusesDto bonusesDto;
    private List<OrderDto> orderDtoList;

    public CustomerDto() {
    }

    public CustomerDto(Customer customer) {
        this.id = customer.getId();
        this.fullName = customer.getFullName();
        this.phoneNumber = customer.getPhoneNumber();
        orderDtoList = new ArrayList<>();
        List<Order> orderList = customer.getAll(Order.class);

        for(Order order : orderList){
            orderDtoList.add(new OrderDto(order));
        }
        bonusesDto= new BonusesDto(customer.getAll(Bonuses.class).get(0));
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

}
