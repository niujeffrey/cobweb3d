package cobweb3d.plugins.vision;


import cobweb3d.plugins.states.AgentState;
import cobwebutil.io.ConfList;
import cobwebutil.io.ConfXMLTag;
import cobwebutil.io.ParameterSerializable;

import java.util.LinkedList;
import java.util.List;

public class VisionState implements AgentState {

    @ConfXMLTag("objectsSeen")
    @ConfList(indexName = "objectSeen", startAtOne = true)
    protected List<SeeInfo> objectsSeen = new LinkedList<>();

    @Deprecated // for reflection use only!
    public VisionState() {
    }

    @Override
    public boolean isTransient() {
        return false;
    }

}
