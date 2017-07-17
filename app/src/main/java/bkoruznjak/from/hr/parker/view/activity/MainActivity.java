package bkoruznjak.from.hr.parker.view.activity;

import android.content.Context;
import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import java.util.ArrayList;

import bkoruznjak.from.hr.parker.R;
import bkoruznjak.from.hr.parker.databinding.ActivityMainBinding;
import bkoruznjak.from.hr.parker.model.CarMock;
import bkoruznjak.from.hr.parker.model.CarModel;
import bkoruznjak.from.hr.parker.view.adapter.CarCardPagerAdapter;
import bkoruznjak.from.hr.parker.view.custom.ZoomOutPageTransformer;

public class MainActivity extends AppCompatActivity {

    private ActivityMainBinding mainBinding;
    private ArrayList<CarModel> mCarList;
    private CarCardPagerAdapter mCardAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        mainBinding = DataBindingUtil.setContentView(this, R.layout.activity_main);
        mCarList = CarMock.mockCars(5);

        mCardAdapter = new CarCardPagerAdapter();
        for (CarModel model : mCarList){
            mCardAdapter.addCardItem(model);
        }

        mainBinding.viewPager.setAdapter(mCardAdapter);
        mainBinding.viewPager.setPageTransformer(false, new ZoomOutPageTransformer());
    }

    @Override
    protected void onStart() {
        super.onStart();
    }

    public static float dpToPixels(int dp, Context context) {
        return dp * (context.getResources().getDisplayMetrics().density);
    }
}
