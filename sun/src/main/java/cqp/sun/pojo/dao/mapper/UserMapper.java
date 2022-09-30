package cqp.sun.pojo.dao.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import cqp.sun.pojo.dao.po.User;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Component;

/**
 * @author 2537122583@qq.com
 * @Date 2022/6/7  16:09
 * @Description
 */
//再对应的mapper上面实现基本的接口 BaseMapper
@Mapper
@Component
public interface UserMapper extends BaseMapper<User> {
    //所有的CRUD都已经完成
    //不需要像以前一样配置一大堆文件：pojo-dao（连接mybatis，配置mapper.xml文件）==>service-controller
}
