package com.example.fastdfs_demo.constant;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/**
 * Created by chenkaiyang on 2017/11/30.
 */
@Component
public class AppConfig {

    @Value("${resHost}")
    private String resHost;
    @Value("${fdfsStoragePort}")
    private String fdfsStoragePort;

    public String getResHost() {
        return resHost;
    }

    public void setResHost(String resHost) {
        this.resHost = resHost;
    }

    public String getFdfsStoragePort() {
        return fdfsStoragePort;
    }

    public void setFdfsStoragePort(String fdfsStoragePort) {
        this.fdfsStoragePort = fdfsStoragePort;
    }
}