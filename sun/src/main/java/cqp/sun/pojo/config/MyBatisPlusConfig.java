package cqp.sun.pojo.config;

import com.baomidou.mybatisplus.annotation.DbType;
import com.baomidou.mybatisplus.extension.plugins.MybatisPlusInterceptor;
import com.baomidou.mybatisplus.extension.plugins.inner.OptimisticLockerInnerInterceptor;
import com.baomidou.mybatisplus.extension.plugins.inner.PaginationInnerInterceptor;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.transaction.annotation.EnableTransactionManagement;

/**
 * @author 2537122583@qq.com
 * @Date 2022/6/9  18:49
 * @Description MyBatisPlus 配置类 乐观锁注解实现
 */
@Configuration  //配置类
@MapperScan("cqp.star.pojo.dao.mapper")  //扫描mapper
@EnableTransactionManagement //自动管理事务，默认是开启的
public class MyBatisPlusConfig {
    //注册乐观锁插件
    @Bean
    public MybatisPlusInterceptor mybatisPlusInterceptor() {
        MybatisPlusInterceptor interceptor = new MybatisPlusInterceptor();
        interceptor.addInnerInterceptor(new OptimisticLockerInnerInterceptor());
        return interceptor;
    }
    /**
     * 注册分页插件 MyBatisPlus内置分页插件 = limit start(1)，size
     */
    @Bean
    public MybatisPlusInterceptor paginationInterceptor() {
        MybatisPlusInterceptor interceptor = new MybatisPlusInterceptor();
        // 添加分页插件
        PaginationInnerInterceptor pageInterceptor = new PaginationInnerInterceptor();
        // 设置请求的页面大于最大页后操作，true调回到首页，false继续请求。默认false
        pageInterceptor.setOverflow(false);
        // 单页分页条数限制，默认无限制
        pageInterceptor.setMaxLimit(500L);
        // 设置数据库类型
        pageInterceptor.setDbType(DbType.MYSQL);
        interceptor.addInnerInterceptor(pageInterceptor);
        return interceptor;
    }
}
