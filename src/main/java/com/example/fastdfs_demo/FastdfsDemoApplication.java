package com.example.fastdfs_demo;

import com.github.tobato.fastdfs.FdfsClientConfig;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.EnableMBeanExport;
import org.springframework.context.annotation.Import;
import org.springframework.jmx.support.RegistrationPolicy;


@Import(FdfsClientConfig.class)//注解，就可以拥有带有连接池的FastDFS Java客户端了
@EnableMBeanExport(registration = RegistrationPolicy.IGNORE_EXISTING)// 解决jmx重复注册bean的问题
@SpringBootApplication
public class FastdfsDemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(FastdfsDemoApplication.class, args);
	}
}
