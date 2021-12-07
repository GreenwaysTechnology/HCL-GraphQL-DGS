package com.hcl.dgs.data.fetcher.async;

import com.netflix.graphql.dgs.DgsComponent;
import com.netflix.graphql.dgs.DgsQuery;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.TimeUnit;

@DgsComponent
public class AsyncDataFetcher {

    @DgsQuery
    public CompletableFuture<Integer> loadAsync() {
        //async logic
        System.out.println("Entry concurrent1");
        CompletableFuture<Integer> stringCompletableFuture = CompletableFuture.supplyAsync(() -> {
            try {
                TimeUnit.MILLISECONDS.sleep(5000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("Done concurrent thing 1");
            return 100;
        });
        System.out.println("Exit concurrent1");

        return stringCompletableFuture;
    }
}
