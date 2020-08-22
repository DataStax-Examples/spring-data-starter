package com.datastax.examples;

import java.io.File;
import lombok.Getter;
import lombok.Setter;
import org.springframework.boot.context.properties.ConfigurationProperties;

@ConfigurationProperties(prefix = "datastax.astra")
@Getter
@Setter
public class DataStaxAstraProperties {

    private File secureConnectBundle;
}
