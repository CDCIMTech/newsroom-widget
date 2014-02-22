package gov.cdc.android.news.fragment.feed.details;

import gov.cdc.android.news.model.Feed;

public interface IFeedDetailsCaller
{
    void feedDetailsClosed(Feed feed, Feed originalfeed);
    
    void feedDetailsCanceled();
}
