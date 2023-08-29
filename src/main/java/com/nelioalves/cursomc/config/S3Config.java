package com.nelioalves.cursomc.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;

public class S3Config {

    @Value("${aws.access_key_id")
    private String awsId;

    @Value("${secret_access_key")
    private String awsKeywsKey;

    @Value("${s3.region")
    private String region;

    @Bean
    public AmazonS3 s3Client() {

        BasicAWSCredentials awsCred = new BasicAWSCredentials(awsIs, awsKey);
        AmazonS3 s3Client = AmazonS3ClienteBuilder.standard().withRegion(Regions.fromName(region))
                .withCredentials(new AWSStaticCredentialsProvider(awsCred)).build();

        return s3Client;
    }
}
