package com.ms.configurationproperties.controller;


import com.ms.configurationproperties.config.AppInfo;
import com.ms.configurationproperties.config.Operations;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController("/")
public class DemoController {

    @Autowired
    AppInfo appInfo;

    @Autowired
    Operations operations;

    @GetMapping("appname")
    public String getAppName() {
       return appInfo.getName();
    }

    @GetMapping("appinfo")
    public AppInfo getAppInfo() {
        return appInfo;
    }

    @GetMapping("operations")
    public Operations getAppOperations() {
        return operations;
    }
}
