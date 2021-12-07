package com.hcl.dgs.data.fetcher.async;

import com.netflix.graphql.dgs.DgsComponent;
import com.netflix.graphql.dgs.DgsData;
import graphql.schema.DataFetchingEnvironment;
import org.dataloader.DataLoader;

import java.util.concurrent.CompletableFuture;

@DgsComponent
public class MessageDataLoaderFetcher {

    @DgsData(parentType = "Query", field = "messageFromBatchLoader")
    public CompletableFuture<String> getMessage(DataFetchingEnvironment env) {
        DataLoader<String, String> dataLoader = env.getDataLoader("messages");
        return dataLoader.load("Subramanian");
    }
}