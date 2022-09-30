package cqp.sun.pojo.dao.po;

import com.baomidou.mybatisplus.annotation.*;
import lombok.Data;

import java.util.Date;

/**
 * @author 2537122583@qq.com
 * @Date 2022/6/7  16:07
 * @Description
 */
@Data
public class User {
    @TableId(type = IdType.ASSIGN_ID)
    private Long id;
    private String userNo;
    private String userName;
    private Integer userType;
    private String userPw;
    //1数据库配置 2@TableField(fill = FieldFill.INSERT) 3自定义注解
    //注解填充字段 @TableField(.. fill = FieldFill.INSERT) 生成器策略部分也可以配置！
    @TableField(fill = FieldFill.INSERT)
    private Date createTime;
    @TableField(fill = FieldFill.INSERT_UPDATE)
    private Date updateTime;
    @Version    //乐观锁version注解
    private Integer version;
}
