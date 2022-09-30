package cqp.sun;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

/**
 * @author 2537122583@qq.com
 * @Date 2022/9/22  9:38
 * @Description Sun 中台启动类
 */
@SpringBootApplication
@MapperScan("cqp.sun.pojo.dao.mapper")  //扫描mapper
public class SunMain extends SpringBootServletInitializer {
    public static void main(String[] args) {
        SpringApplication.run(SunMain.class, args);
    }
    // 按照下面的方式重写
    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder builder) {
        return builder.sources(SunMain.class);
    }
}
