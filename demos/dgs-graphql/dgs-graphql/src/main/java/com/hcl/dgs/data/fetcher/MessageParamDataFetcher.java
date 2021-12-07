package com.hcl.dgs.data.fetcher;

import com.netflix.graphql.dgs.DgsComponent;
import com.netflix.graphql.dgs.DgsQuery;
import com.netflix.graphql.dgs.InputArgument;

@DgsComponent
public class MessageParamDataFetcher {

    @DgsQuery(field = "message")
    public String getMessage(@InputArgument String input) {
        return input;
    }
}
