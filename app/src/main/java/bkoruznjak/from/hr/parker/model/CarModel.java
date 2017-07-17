package bkoruznjak.from.hr.parker.model;

/**
 * Created by bkoruznjak on 16/07/2017.
 */

public class CarModel {
    private int mId;
    private int mCarDrawable;
    private String mCarName;
    private String mCarLicensePlate;

    public CarModel(int id, int carDrawable, String carName, String carLicensePlate) {
        this.mId = id;
        this.mCarDrawable = carDrawable;
        this.mCarName = carName;
        this.mCarLicensePlate = carLicensePlate;
    }

    public int getId() {
        return mId;
    }

    public void setId(int mId) {
        this.mId = mId;
    }

    public int getCarDrawable() {
        return mCarDrawable;
    }

    public void setCarDrawable(int mCarDrawable) {
        this.mCarDrawable = mCarDrawable;
    }

    public String getCarName() {
        return mCarName;
    }

    public void setCarName(String mCarName) {
        this.mCarName = mCarName;
    }

    public String getCarLicensePlate() {
        return mCarLicensePlate;
    }

    public void setCarLicensePlate(String mCarLicensePlate) {
        this.mCarLicensePlate = mCarLicensePlate;
    }

}
