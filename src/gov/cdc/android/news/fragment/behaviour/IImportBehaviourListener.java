package gov.cdc.android.news.fragment.behaviour;

import java.util.List;

import gov.cdc.android.news.model.Behaviour;

public interface IImportBehaviourListener
{

    enum Error 
    {
        NO_BEHAVIOUR_FOUND,
        FILE_PARSE_ERROR
    }
    
    void onBehaviourSelected(List<Behaviour> selected);

    void onBehaviourImportError(Error err);
    
    
}
