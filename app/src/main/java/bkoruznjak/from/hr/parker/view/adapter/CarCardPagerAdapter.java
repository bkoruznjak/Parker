package bkoruznjak.from.hr.parker.view.adapter;

import android.support.v4.view.PagerAdapter;
import android.support.v7.widget.CardView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

import bkoruznjak.from.hr.parker.R;
import bkoruznjak.from.hr.parker.model.CarModel;

/**
 * Created by bkoruznjak on 16/07/2017.
 */

public class CarCardPagerAdapter extends PagerAdapter implements ICardAdapter {

    private List<CardView> mViews;
    private List<CarModel> mCarData;
    private float mBaseElevation;

    public CarCardPagerAdapter() {
        mCarData = new ArrayList<>();
        mViews = new ArrayList<>();
    }

    public void addCardItem(CarModel item) {
        mViews.add(null);
        mCarData.add(item);
    }

    public float getBaseElevation() {
        return mBaseElevation;
    }

    @Override
    public CardView getCardViewAt(int position) {
        return mViews.get(position);
    }

    @Override
    public int getCount() {
        return mCarData.size();
    }

    @Override
    public boolean isViewFromObject(View view, Object object) {
        return view == object;
    }

    @Override
    public Object instantiateItem(ViewGroup container, int position) {
        View view = LayoutInflater.from(container.getContext())
                .inflate(R.layout.fragment_card, container, false);
        container.addView(view);
        bind(mCarData.get(position), view);
        CardView cardView = (CardView) view.findViewById(R.id.cardView);

        if (mBaseElevation == 0) {
            mBaseElevation = cardView.getCardElevation();
        }

        cardView.setMaxCardElevation(mBaseElevation * MAX_ELEVATION_FACTOR);
        mViews.set(position, cardView);
        return view;
    }

    @Override
    public void destroyItem(ViewGroup container, int position, Object object) {
        container.removeView((View) object);
        mViews.set(position, null);
    }

    private void bind(CarModel item, View view) {
        TextView titleTextView = (TextView) view.findViewById(R.id.textCarName);
        TextView contentTextView = (TextView) view.findViewById(R.id.textCarRegistration);
        titleTextView.setText(item.getCarName());
        contentTextView.setText(item.getCarLicensePlate());
    }

}