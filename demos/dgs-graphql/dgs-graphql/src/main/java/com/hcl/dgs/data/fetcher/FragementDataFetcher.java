package com.hcl.dgs.data.fetcher;


import com.hcl.dgs.data.model.Actor;
import com.hcl.dgs.data.model.Address;
import com.netflix.graphql.dgs.DgsComponent;
import com.netflix.graphql.dgs.DgsQuery;
import com.netflix.graphql.dgs.InputArgument;

//@DgsComponent
public class FragementDataFetcher {

    @DgsQuery(field = "showHero")
    public Actor findActor(@InputArgument String id, @InputArgument String name, @InputArgument Integer age) {
        System.out.println(id + " " + name);
        return new Actor(id, name, age, new Address("New york", "New York", "USA"));
    }

    //fragments
    @DgsQuery(field = "showVillain")
    public Actor findVillain(@InputArgument String id, @InputArgument String name, @InputArgument Integer age) {
        System.out.println(id + " " + name);
        return new Actor(id, name, age, new Address("New york", "New York", "USA"));
    }

}