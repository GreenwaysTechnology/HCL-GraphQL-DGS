package com.hcl.dgs.data.fetcher;

import com.hcl.dgs.data.model.Actor;
import com.hcl.dgs.data.model.Address;
import com.netflix.graphql.dgs.DgsComponent;
import com.netflix.graphql.dgs.DgsData;
import com.netflix.graphql.dgs.DgsQuery;

//@DgsComponent
public class ActorDataFetcher {

    @DgsQuery(field = "actor")
    public Actor findActor() {
        Actor actor1 = new Actor("3","t",33);
          return new Actor("1", "Dodge", 34);
        //return new Actor("1", "Dodge", 34, new Address("Coimbatore", "TN", "IN"));
    }
    @DgsData(parentType = "Actor", field = "address")
    public Address findAddress() {
        return new Address("Coimbatore", "TN", "IN");
    }
}
