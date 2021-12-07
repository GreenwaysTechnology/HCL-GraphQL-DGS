package com.hcl.dgs.service;

import org.springframework.stereotype.Service;

@Service
public class GreeterServiceImpl implements  GreeterService {

    public String sayGreet(){
        return "Greet Service DGS";
    }
}
