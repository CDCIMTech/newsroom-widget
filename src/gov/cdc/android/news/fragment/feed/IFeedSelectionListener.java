package gov.cdc.android.news.fragment.feed;

import java.util.List;

import gov.cdc.android.news.model.Feed;

public interface IFeedSelectionListener
{
    void feedSelected(List<Feed> selection);
}
