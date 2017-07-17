package bkoruznjak.from.hr.parker.view.custom;

/**
 * Created by bkoruznjak on 16/07/2017.
 */

public class CardItem {
    private int mTextResource;
    private int mTitleResource;

    public CardItem(int title, int text) {
        mTitleResource = title;
        mTextResource = text;
    }

    public int getText() {
        return mTextResource;
    }

    public int getTitle() {
        return mTitleResource;
    }
}