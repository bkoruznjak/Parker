package bkoruznjak.from.hr.parker.view.fragment;

import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.CardView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import bkoruznjak.from.hr.parker.R;
import bkoruznjak.from.hr.parker.databinding.FragmentCardBinding;
import bkoruznjak.from.hr.parker.view.adapter.ICardAdapter;

/**
 * Created by bkoruznjak on 16/07/2017.
 */

public class CardFragment extends Fragment {

    private FragmentCardBinding cardBinding;
    private CardView mCardView;

    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {

        cardBinding = DataBindingUtil.inflate(inflater, R.layout.fragment_card, container, false);
        mCardView = cardBinding.cardView;
        mCardView.setMaxCardElevation(cardBinding.cardView.getCardElevation() * ICardAdapter.MAX_ELEVATION_FACTOR);
        return cardBinding.getRoot();
    }

    public CardView getCardView() {
        return mCardView;
    }
}
