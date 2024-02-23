package dev.will.awsspringdemo;

import dev.will.awsspringdemo.s3.S3Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import software.amazon.awssdk.services.s3.S3Client;

@SpringBootApplication
public class AwsSpringDemoApplication {
	private static S3Service s3;
	public AwsSpringDemoApplication(S3Service s3) {
		AwsSpringDemoApplication.s3 = s3;
	}

	public static void main(String[] args) {
		SpringApplication.run(AwsSpringDemoApplication.class, args);
		byte[] obj = s3.getObject("java-app-demo-bucket", "Hey");
		System.out.println(new String(obj));
	}

}
//		<dependency>
//			<groupId>org.springframework.boot</groupId>
//			<artifactId>spring-boot-starter-data-jpa</artifactId>
//		</dependency>