package groupone.demo.model;

import javax.persistence.*;

@Entity
@Table(name = "cars") // (name = "owners") er krævet.
public class Car {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column // (name = "first_name") er IKKE krævet
    private String firstRegistration;  // SKAL være i camel-case (firstName)

    @Column
    private String imageUrl;

    @Column
    private String fuelType;

    @Column
    private String modelYear;

    @Column
    private String carType;

    @Column
    private int amountOfDoors;

    @Column
    private int horsepower;

    @Column
    private float kilometersDriven;

    @Column
    private String colorOfCar;

    @Column
    private String carBrand;

    public Long getId() {
        return id;
    }

    public String getFirstRegistration() {
        return firstRegistration;
    }

    public void setFirstRegistration(String firstRegistration) {
        this.firstRegistration = firstRegistration;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    public String getFuelType() {
        return fuelType;
    }

    public void setFuelType(String fuelType) {
        this.fuelType = fuelType;
    }

    public String getModelYear() {
        return modelYear;
    }

    public void setModelYear(String modelYear) {
        this.modelYear = modelYear;
    }

    public String getCarType() {
        return carType;
    }

    public void setCarType(String carType) {
        this.carType = carType;
    }

    public int getAmountOfDoors() {
        return amountOfDoors;
    }

    public void setAmountOfDoors(int amountOfDoors) {
        this.amountOfDoors = amountOfDoors;
    }

    public int getHorsepower() {
        return horsepower;
    }

    public void setHorsepower(int horsepower) {
        this.horsepower = horsepower;
    }

    public float getKilometersDriven() {
        return kilometersDriven;
    }

    public void setKilometersDriven(float kilometersDriven) {
        this.kilometersDriven = kilometersDriven;
    }

    public String getColorOfCar() {
        return colorOfCar;
    }

    public void setColorOfCar(String colorOfCar) {
        this.colorOfCar = colorOfCar;
    }

    public String getCarBrand() {
        return carBrand;
    }

    public void setCarBrand(String carBrand) {
        this.carBrand = carBrand;
    }
}
