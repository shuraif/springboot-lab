package com.ms.configurationproperties;

import com.ms.configurationproperties.config.AppInfo;
import com.ms.configurationproperties.config.Operations;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;

@SpringBootApplication
@EnableConfigurationProperties({AppInfo.class, Operations.class})
public class ConfigurationPropertiesApplication {

	public static void main(String[] args) {
		SpringApplication.run(ConfigurationPropertiesApplication.class, args);
	}

}
