package com.ms.configurationproperties.config;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;
import org.springframework.validation.annotation.Validated;

import java.util.List;

@ConfigurationProperties(prefix = "app.operations")
public class Operations {


    private List<String> get;
    private List<String> post;

    public List<String> getGet() {
        return get;
    }
    public void setGet(List<String> get) {
        this.get = get;
    }

    public List<String> getPost() {
        return post;
    }

    public void setPost(List<String> post) {
        this.post = post;
    }
}
