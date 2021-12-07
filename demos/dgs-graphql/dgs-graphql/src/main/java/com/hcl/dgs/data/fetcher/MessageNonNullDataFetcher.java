package com.hcl.dgs.data.fetcher;

import com.netflix.graphql.dgs.DgsComponent;
import com.netflix.graphql.dgs.DgsQuery;

@DgsComponent
public class MessageNonNullDataFetcher {

    //    @DgsQuery(field = "message")
//    public String sayHello() {
//        return null;
//    }
    @DgsQuery(field = "message")
    public String sayHello() {
        return "Message";
    }
}
