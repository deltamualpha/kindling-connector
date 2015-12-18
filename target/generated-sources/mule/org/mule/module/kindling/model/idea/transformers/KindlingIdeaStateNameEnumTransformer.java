
package org.mule.module.kindling.model.idea.transformers;

import javax.annotation.Generated;
import org.mule.api.transformer.DiscoverableTransformer;
import org.mule.api.transformer.TransformerException;
import org.mule.module.kindling.model.idea.KindlingIdeaStateName;
import org.mule.transformer.AbstractTransformer;
import org.mule.transformer.types.DataTypeFactory;

@SuppressWarnings("all")
@Generated(value = "Mule DevKit Version 3.6.1", date = "2015-12-18T02:51:31-03:00", comments = "Build UNNAMED.2405.44720b7")
public class KindlingIdeaStateNameEnumTransformer
    extends AbstractTransformer
    implements DiscoverableTransformer
{

    private int weighting = DiscoverableTransformer.DEFAULT_PRIORITY_WEIGHTING;

    public KindlingIdeaStateNameEnumTransformer() {
        registerSourceType(DataTypeFactory.create(String.class));
        setReturnClass(KindlingIdeaStateName.class);
        setName("KindlingIdeaStateNameEnumTransformer");
    }

    protected Object doTransform(Object src, String encoding)
        throws TransformerException
    {
        KindlingIdeaStateName result = null;
        result = Enum.valueOf(KindlingIdeaStateName.class, ((String) src));
        return result;
    }

    public int getPriorityWeighting() {
        return weighting;
    }

    public void setPriorityWeighting(int weighting) {
        this.weighting = weighting;
    }

}
