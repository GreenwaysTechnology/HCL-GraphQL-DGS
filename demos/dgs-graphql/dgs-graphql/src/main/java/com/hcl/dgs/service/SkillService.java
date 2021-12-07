package com.hcl.dgs.service;

import com.hcl.dgs.data.model.Skill;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;

@Service
public class SkillService {

    //Todo: retervie this from jpa respository
    private List<Skill> skills = Arrays.asList(new Skill("1", "GraphQl"),
            new Skill("2", "Dgs"));

    public List<Skill> findSkills() {
        return skills;
    }

}
