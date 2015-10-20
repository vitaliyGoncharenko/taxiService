package taxiService.service.db.impl;

import taxiService.model.Customer;
import taxiService.model.Order;
import taxiService.service.db.ITemplateDao;
import taxiService.transfer.OrderDto;

import java.util.List;

/**
 * Created by Vitaliy on 17.10.2015.
 */
public class OrderDao implements ITemplateDao<OrderDto> {

    @Override
    public Order get(Long id) {
        return Order.findById(id);
    }

    @Override
    public Order create(OrderDto orderDto) {
        Order order = new Order();
        order.setDepartureAddress(orderDto.getDepartureAddress());
        order.setArrivalAddress(orderDto.getArrivalAddress());
        order.setCurrentDate(orderDto.getCurrentDate());

        if(orderDto.getCustomerId()!=null){
            order.setParent(Customer.findById(orderDto.getId()));
        }
        order.saveIt();
        return order;
    }

    @Override
    public void deleteAll() {
        List<Order> orderList = Order.findAll();
        for (Order order : orderList) {
            order.deleteCascadeShallow();
        }
    }

    @Override
    public void update(OrderDto orderDto) {
        Order order = Order.findById(orderDto.getId());
        if (order != null) {
            order.setDepartureAddress(orderDto.getDepartureAddress());
            order.setArrivalAddress(orderDto.getArrivalAddress());
            order.setCurrentDate(orderDto.getCurrentDate());
            order.setCustomerId(orderDto.getCustomerId());

            order.saveIt();
        }
    }

    @Override
    public void delete(Long id) {
        Order order = Order.findById(id);
        if (order != null) {
            order.deleteCascadeShallow();
        }
    }

    @Override
    public List<Order> getAll() {
        return Order.findAll();
    }
}
