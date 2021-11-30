package wanho.core;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@MapperScan(basePackages = "wanho.core.admin.mapper")
@ComponentScan(basePackages = {"wanho.base","wanho.core","wanho.commons"})
public class SrbCoreApplication {
    public static void main(String[] args) {
        SpringApplication.run(SrbCoreApplication.class,args);
    }
}
