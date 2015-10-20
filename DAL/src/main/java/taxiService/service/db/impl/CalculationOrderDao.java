package taxiService.service.db.impl;

import taxiService.model.CalculationOrder;
import taxiService.model.Driver;
import taxiService.model.Order;
import taxiService.service.db.ITemplateDao;
import taxiService.transfer.CalculationOrderDto;

import java.util.List;

/**
 * Created by Vitaliy on 17.10.2015.
 */
public class CalculationOrderDao implements ITemplateDao<CalculationOrderDto> {

    @Override
    public CalculationOrder get(Long id) {
        return CalculationOrder.findById(id);
    }

    @Override
    public CalculationOrder create(CalculationOrderDto calculationOrderDto) {
        CalculationOrder calculationOrder = new CalculationOrder();
        calculationOrder.setDistance(calculationOrderDto.getDistance());
        calculationOrder.setTravelTime(calculationOrderDto.getTravelTime());
        calculationOrder.setTimeOfDeparture(calculationOrderDto.getTimeOfDeparture());
        calculationOrder.setArrivalTime(calculationOrderDto.getArrivalTime());
        calculationOrder.setRate(calculationOrderDto.getRate());
        calculationOrder.setPrice(calculationOrderDto.getPrice());

        if (calculationOrderDto.getDriverId() != null) {
            calculationOrder.setParent(Driver.findById(calculationOrderDto.getDriverId()));
        }

        if (calculationOrderDto.getOrderId() != null) {
            calculationOrder.setParent(Order.findById(calculationOrderDto.getOrderId()));
        }
        calculationOrder.saveIt();
        return calculationOrder;
    }

    @Override
    public void deleteAll() {
        List<CalculationOrder> calculationOrderList = CalculationOrder.findAll();
        for (CalculationOrder calculationOrder : calculationOrderList) {
            calculationOrder.deleteCascadeShallow();
        }
    }

    @Override
    public void update(CalculationOrderDto calculationOrderDto) {
        CalculationOrder calculationOrder = CalculationOrder.findById(calculationOrderDto.getId());
        if (calculationOrder != null) {
            calculationOrder.setDistance(calculationOrderDto.getDistance());
            calculationOrder.setTravelTime(calculationOrderDto.getTravelTime());
            calculationOrder.setTimeOfDeparture(calculationOrderDto.getTimeOfDeparture());
            calculationOrder.setArrivalTime(calculationOrderDto.getArrivalTime());
            calculationOrder.setRate(calculationOrderDto.getRate());
            calculationOrder.setPrice(calculationOrderDto.getPrice());
            calculationOrder.setOrderId(calculationOrderDto.getOrderId());
            calculationOrder.setDriverId(calculationOrderDto.getDriverId());

            calculationOrder.saveIt();
        }
    }

    @Override
    public void delete(Long id) {
        CalculationOrder calculationOrder = CalculationOrder.findById(id);
        if (calculationOrder != null) {
            calculationOrder.deleteCascadeShallow();
        }
    }

    @Override
    public List<CalculationOrder> getAll() {
        return CalculationOrder.findAll();
    }
}
