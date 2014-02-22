package gov.cdc.android.news.fragment.item;

import gov.cdc.android.news.model.Item;

public interface IItemLoadListener
{
    void itemLoaded(Item item);
    void startLoading();
}
