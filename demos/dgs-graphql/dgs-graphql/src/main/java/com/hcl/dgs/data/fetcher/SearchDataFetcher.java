package com.hcl.dgs.data.fetcher;

import com.hcl.dgs.data.model.Person;
import com.hcl.dgs.data.model.Photo;
import com.hcl.dgs.data.model.SearchResult;
import com.netflix.graphql.dgs.DgsComponent;
import com.netflix.graphql.dgs.DgsQuery;
import com.netflix.graphql.dgs.DgsTypeResolver;

import java.time.LocalDateTime;
import java.time.OffsetDateTime;
import java.util.Date;

//@DgsComponent
public class SearchDataFetcher {
    @DgsQuery(field = "firstSearchResult")
    public SearchResult search() {
        return new Person ("The Alien", 10, OffsetDateTime.now());
        //return new Photo(100, 900, 900L);
    }

    @DgsTypeResolver(name = "SearchResult")
    public String resolveUnionType(SearchResult video) { //SearchResult is Java Type
        if (video instanceof Person) {
            return "Person"; //schema Type Name
        } else if (video instanceof Photo) {
            return "Photo"; // schema Type Name
        } else {
            throw new RuntimeException("UnKnown Type" + video.getClass().getName());
        }

    }
}