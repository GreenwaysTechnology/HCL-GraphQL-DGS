package com.example.dgsautocodegen.datafetcher;

import com.acme.demo.generated.DgsConstants;
import com.acme.demo.generated.types.Skill;
import com.netflix.graphql.dgs.DgsComponent;
import com.netflix.graphql.dgs.DgsQuery;

import java.util.Arrays;
import java.util.List;

@DgsComponent
public class SkillDataFetcher {
    @DgsQuery(field = DgsConstants.QUERY.Skills)
    public List<Skill> skills() {
        return Arrays.asList(Skill.newBuilder().name("Graphql").id("1").build());
    }
}
