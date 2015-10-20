package taxiService.service.db.impl;

import taxiService.model.Driver;
import taxiService.service.db.ITemplateDao;
import taxiService.transfer.DriverDto;

import java.util.List;

/**
 * Created by Vitaliy on 17.10.2015.
 */
public class DriverDao implements ITemplateDao<DriverDto>{
    public Driver get(String employee) {
        return Driver.findFirst("employee", employee);
    }

    @Override
    public Driver get(Long id) {
        return Driver.findById(id);
    }

    @Override
    public Driver create(DriverDto driverDto) {
        Driver driver = new Driver();
        driver.setEmployee(driverDto.getEmployee());
        driver.setCarModel(driverDto.getCarModel());
        driver.setCarNumber(driverDto.getCarNumber());

        driver.saveIt();
        return driver;
    }

    @Override
    public void deleteAll() {
        List<Driver> driverList = Driver.findAll();
        for (Driver driver : driverList) {
            driver.deleteCascadeShallow();
        }
    }

    @Override
    public void update(DriverDto driverDto) {
        Driver driver = Driver.findById(driverDto.getId());
        if (driver != null) {
            driver.setEmployee(driverDto.getEmployee());
            driver.setCarModel(driverDto.getCarModel());
            driver.setCarNumber(driverDto.getCarNumber());

            driver.saveIt();
        }
    }

    @Override
    public void delete(Long id) {
        Driver driver = Driver.findById(id);
        if (driver != null) {
            driver.deleteCascadeShallow();
        }
    }

    @Override
    public List<Driver> getAll() {
        return Driver.findAll();
    }
}
