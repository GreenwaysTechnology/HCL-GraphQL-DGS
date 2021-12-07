package com.hcl.dgs.data.fetcher;

import com.netflix.graphql.dgs.DgsComponent;
import com.netflix.graphql.dgs.DgsData;

@DgsComponent
public class HelloDataFetcher {
    //schema methods
//    @DgsQuery
//    public String hello(){
//        return "Hello";
//    }
//    @DgsQuery(field = "hello")
//    public String sayHello(){
//        return "Hello";
//    }
//    @DgsData(parentType = "Query")
//    public String hello() {
//        return "Hello";
//    }
    @DgsData(parentType = "Query",field = "hello")
    public String sayHello() {
        return "Hello";
    }
}
