package com.hcl.dgs.data.fetcher;

import com.hcl.dgs.data.model.Skill;
import com.hcl.dgs.service.SkillService;
import com.netflix.graphql.dgs.DgsComponent;
import com.netflix.graphql.dgs.DgsQuery;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

@DgsComponent
public class SkillListDataFetcher {
    @Autowired
    private SkillService skillService;

    @DgsQuery(field = "skills")
    public List<Skill> showSkills() {
        return skillService.findSkills();
    }
}
