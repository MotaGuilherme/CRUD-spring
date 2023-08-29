package com.nelioalves.cursomc.services;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import java.io.File;

@Service
public class S3Service {

    private Logger LOG = LoggerFactory.getLogger(S3Service.class);

    @Autowired
    private AmazonS3 s3Client;

    @Value("${s3.bucket}")
    private String bucketName;

    public void uploadFile(String localFilePath) {
        try {
            File file = new File(localFilePath);
            LOG.info("Iniciando o Upload");
            s3Client.putObject(new PutObjectRequest(bucketName, "teste", file));
            LOG.info("Upload finalizado");

        } catch (AmazonServiceException e) {
            LOG.info("AmazonServiceException: " + e.getErrorMessage());
            LOG.info("Status Code: " + e.getErrorCode);

        } catch (AmazonClientException e) {
            LOG.info("AmazonClientException: " + e.getMessage());
        }
    }
}
