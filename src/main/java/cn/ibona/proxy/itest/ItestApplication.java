package cn.ibona.proxy.itest;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@SpringBootApplication
@MapperScan("cn.ibona.proxy.itest.mapper")
public class ItestApplication {

    public static void main(String[] args) {
        SpringApplication.run(ItestApplication.class, args);
    }
}
