package com.ib.devops.kubesample.service;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.validation.annotation.Validated;

@Service
public class GetInstance {



    private static final String HOST_NAME = "HOSTNAME";

    private final static String DEFAULT_INSTANCE = "LOCAL";

    //@Value("#{systemProperties['HOSTNAME'] ?: 'LOCAL'}")
    @Value("${"+ HOST_NAME + ":" + DEFAULT_INSTANCE + "}")      // if running on local then it would return null and hence it would return LOCAL else it will return hostname
    private  String hostName;


    public String retruninstanceof(){
        //return hostName.substring(hostName.length()-5);
        return hostName.substring(hostName.length()-5) ;
    }



}
