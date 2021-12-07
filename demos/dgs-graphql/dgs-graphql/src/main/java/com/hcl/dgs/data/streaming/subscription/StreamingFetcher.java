package com.hcl.dgs.data.streaming.subscription;

import com.hcl.dgs.data.model.Stock;
import com.netflix.graphql.dgs.DgsComponent;
import com.netflix.graphql.dgs.DgsSubscription;
import reactor.core.publisher.Flux;

import java.time.Duration;

@DgsComponent
public class StreamingFetcher {

    @DgsSubscription(field = "stocks")
    //@DgsData(parentType = "Mutation")
    public Flux<Stock> flowStocks() {
        return Flux.interval(Duration.ofSeconds(1)).map(t -> new Stock("NFLX", 500 + t));
    }
}