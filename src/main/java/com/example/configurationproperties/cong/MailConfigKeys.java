package com.example.configurationproperties.cong;

import java.time.Duration;
import java.time.temporal.ChronoUnit;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.convert.DataSizeUnit;
import org.springframework.boot.convert.DurationUnit;
import org.springframework.context.annotation.Configuration;
import org.springframework.util.unit.DataSize;
import org.springframework.util.unit.DataUnit;

import lombok.Data;

@Configuration
@ConfigurationProperties(prefix = "spring.mail")
@Data
public class MailConfigKeys {

    private boolean serviceEnable;
    private String host;
    private int port;
    private String userName;
    @DurationUnit(ChronoUnit.DAYS)
    private Duration timeInDays;

    private DataSize sizeInDefaultUnit;

    private DataSize sizeInGB;
    
    @DataSizeUnit(DataUnit.TERABYTES)
    private DataSize sizeInTB;
}
