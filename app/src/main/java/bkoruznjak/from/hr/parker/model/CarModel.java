package bkoruznjak.from.hr.parker.model;

/**
 * Created by bkoruznjak on 16/07/2017.
 */

public class CarModel {
    private int mId;
    private String mCarName;
    private String mCarLicensePlate;

    public CarModel(int mId, String mCarName, String mCarLicensePlate) {
        this.mId = mId;
        this.mCarName = mCarName;
        this.mCarLicensePlate = mCarLicensePlate;
    }

    public int getmId() {
        return mId;
    }

    public void setmId(int mId) {
        this.mId = mId;
    }

    public String getmCarName() {
        return mCarName;
    }

    public void setmCarName(String mCarName) {
        this.mCarName = mCarName;
    }

    public String getmCarLicensePlate() {
        return mCarLicensePlate;
    }

    public void setmCarLicensePlate(String mCarLicensePlate) {
        this.mCarLicensePlate = mCarLicensePlate;
    }
}
