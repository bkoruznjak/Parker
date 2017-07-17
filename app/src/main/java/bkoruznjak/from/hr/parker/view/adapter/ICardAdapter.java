package bkoruznjak.from.hr.parker.view.adapter;

import android.support.v7.widget.CardView;

/**
 * Created by bkoruznjak on 16/07/2017.
 */

public interface ICardAdapter {
    int MAX_ELEVATION_FACTOR = 8;

    float getBaseElevation();

    CardView getCardViewAt(int position);

    int getCount();
}