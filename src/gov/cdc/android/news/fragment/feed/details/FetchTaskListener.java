package gov.cdc.android.news.fragment.feed.details;

import gov.cdc.android.news.model.Feed;

public interface FetchTaskListener
{
    void onPreExecute();
    void onPostExecute(Feed feed);
}
