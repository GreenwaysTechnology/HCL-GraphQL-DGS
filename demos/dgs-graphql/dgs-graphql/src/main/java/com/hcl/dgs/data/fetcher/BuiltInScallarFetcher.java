package com.hcl.dgs.data.fetcher;

import com.hcl.dgs.data.model.Availability;
import com.netflix.graphql.dgs.DgsComponent;
import com.netflix.graphql.dgs.DgsQuery;

@DgsComponent
public class BuiltInScallarFetcher {
    //int
    @DgsQuery(field = "count")
    public Integer getCount() {
        return 1;
    }

    @DgsQuery(field = "qty")
    public Float getQty() {
        return 10.9f;
    }

    @DgsQuery(field = "isAvailable")
    public boolean isAvailable() {
        return true;
    }

    //id
    @DgsQuery(field = "id")
    public String getId() {
        return "1";
    }

    //enum
    @DgsQuery(field = "status")
    public Availability checkAvailable() {
        return Availability.OUTOFSTOCK;
    }

}
