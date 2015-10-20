package taxiService.service.db.impl;

import org.javalite.activejdbc.Model;
import taxiService.model.Customer;
import taxiService.service.db.ITemplateDao;
import taxiService.transfer.CustomerDto;

import java.util.List;

/**
 * Created by Vitaliy on 17.10.2015.
 */
public class CustomerDao implements ITemplateDao<CustomerDto> {

    public Model get(String fullName) {
        return Customer.findFirst("fullName", fullName);
    }

    @Override
    public Customer get(Long id) {
        return Customer.findById(id);
    }

    @Override
    public Customer create(CustomerDto customerDto) {
        Customer customer = new Customer();
        customer.setFullName(customerDto.getFullName());
        customer.setPhoneNumber(customerDto.getPhoneNumber());

        customer.saveIt();
        return customer;
    }

    @Override
    public void deleteAll() {
        List<Customer> customerList = Customer.findAll();
        for (Customer customer : customerList) {
            customer.deleteCascadeShallow();
        }
    }

    @Override
    public void update(CustomerDto customerDto) {
        Customer customer = Customer.findById(customerDto.getId());
        if (customer != null) {
            customer.setFullName(customerDto.getFullName());
            customer.setPhoneNumber(customerDto.getPhoneNumber());

            customer.saveIt();
        }
    }

    @Override
    public void delete(Long id) {
        Customer customer = Customer.findById(id);
        if (customer != null) {
            customer.deleteCascadeShallow();
        }
    }

    @Override
    public List<Customer> getAll() {
        return Customer.findAll();
    }
}
