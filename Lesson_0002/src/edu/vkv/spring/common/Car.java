package edu.vkv.spring.common;

/**
 * Created by vladimirkr on 03.07.2014.
 */
public class Car {
    private String trand;
    private String model;
    private Boolean hasRegistration;
    private int produced;

    public String getTrand() {
        return trand;
    }

    public void setTrand(String trand) {
        this.trand = trand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public Boolean getHasRegistration() {
        return hasRegistration;
    }

    public void setHasRegistration(Boolean hasRegistration) {
        this.hasRegistration = hasRegistration;
    }

    public int getProduced() {
        return produced;
    }

    public void setProduced(int produced) {
        this.produced = produced;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Car{");
        sb.append("trand='").append(trand).append('\'');
        sb.append(", model='").append(model).append('\'');
        sb.append(", hasRegistration=").append(hasRegistration);
        sb.append(", produced=").append(produced);
        sb.append('}');
        return sb.toString();
    }
}
