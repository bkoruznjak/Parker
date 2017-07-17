package bkoruznjak.from.hr.parker.model;

import android.support.annotation.NonNull;

import java.util.ArrayList;

import bkoruznjak.from.hr.parker.R;

/**
 * Created by bkoruznjak on 16/07/2017.
 */

public class CarMock {

    @NonNull
    public static ArrayList<CarModel> mockCars(int numberOfCarsToMock) {
        ArrayList<CarModel> carList = new ArrayList<>(numberOfCarsToMock);

        if (numberOfCarsToMock == 0) {
            throw new IllegalArgumentException("Cant mock 0 cars");
        }

        for (int i = 0; i < numberOfCarsToMock; i++) {

            int drawable;
            if (i % 5 == 0) {
                drawable = R.drawable.img_transport_sport;
            } else if (i % 4 == 0) {
                drawable = R.drawable.img_transport_suv;
            } else if (i % 3 == 0) {
                drawable = R.drawable.img_transport_lorry;
            } else if (i % 2 == 0) {
                drawable = R.drawable.img_transport_minivan;
            } else {
                drawable = R.drawable.img_transport_car;
            }

            carList.add(new CarModel(i, drawable, "Random Car Name".concat(Integer.toString(i)), "ZG4569".concat(Integer.toString(i))));
        }
        return carList;
    }
}
