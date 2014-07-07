package edu.vkv.spring.common;

import java.util.List;

/**
 * Created by vladimirkr on 03.07.2014.
 */
public class Person {
    private String firstName;
    private String lastName;
    private List<Car> cars;

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public List<Car> getCars() {
        return cars;
    }

    public void setCars(List<Car> cars) {
        this.cars = cars;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Person{");
        sb.append("firstName='").append(firstName).append('\'');
        sb.append(", lastName='").append(lastName).append('\'');
        sb.append(", cars=").append(cars);
        sb.append('}');
        return sb.toString();
    }
}
