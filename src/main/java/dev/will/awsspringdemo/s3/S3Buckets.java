package dev.will.awsspringdemo.s3;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

@Configuration
@ConfigurationProperties(prefix = "aws.s3.buckets")
public class S3Buckets {
    private String demoBucket;

    public String getDemoBucket() {
        return demoBucket;
    }

    public void setDemoBucket(String demoBucket) {
        this.demoBucket = demoBucket;
    }
}
