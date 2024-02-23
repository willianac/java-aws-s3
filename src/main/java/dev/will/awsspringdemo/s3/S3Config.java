package dev.will.awsspringdemo.s3;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import software.amazon.awssdk.regions.Region;
import software.amazon.awssdk.services.s3.S3Client;

import java.net.URI;

@Configuration
public class S3Config {
    @Value("${aws.region}")
    private String awsRegion;
    @Bean
    public S3Client s3CLient() {
        return S3Client.builder()
                .region(Region.of(awsRegion))
                .endpointOverride(URI.create("https://s3.sa-east-1.amazonaws.com"))
                .forcePathStyle(true)
                .build();
    }
}
