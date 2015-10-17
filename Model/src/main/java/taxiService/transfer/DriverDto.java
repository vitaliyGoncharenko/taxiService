package taxiService.transfer;

import taxiService.model.Driver;

/**
 * Created by Vitaliy on 14.10.2015.
 */
public class DriverDto {
    private Long id;
    private String employee;
    private String carModel;
    private String carNumber;

    public DriverDto() {
    }

    public DriverDto(Driver driver) {
        this.id = driver.getId();
        this.employee = driver.getEmployee();
        this.carModel = driver.getCarModel();
        this.carNumber = driver.getCarNumber();
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getEmployee() {
        return employee;
    }

    public void setEmployee(String employee) {
        this.employee = employee;
    }

    public String getCarModel() {
        return carModel;
    }

    public void setCarModel(String carModel) {
        this.carModel = carModel;
    }

    public String getCarNumber() {
        return carNumber;
    }

    public void setCarNumber(String carNumber) {
        this.carNumber = carNumber;
    }
}
