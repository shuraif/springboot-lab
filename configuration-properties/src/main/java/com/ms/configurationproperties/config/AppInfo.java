package com.ms.configurationproperties.config;


import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import java.util.List;

@ConfigurationProperties(prefix = "app.info")
public class AppInfo {

    private String name;
    private String description;
    private String version;

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }


    public void setName(String name) {
        this.name = name;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

}
