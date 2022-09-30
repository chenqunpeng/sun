package cqp.sun.api;

import cqp.sun.pojo.dao.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author 2537122583@qq.com
 * @Date 2022/9/22  9:40
 * @Description Test Api
 */
@RestController
@RequestMapping("test")
public class TestApi {
    @Autowired
    UserMapper userMapper;
    @RequestMapping("/testS")
    public String test(){
        return "success";
    }

    @RequestMapping("/getUser")
    public Object getUser(){
        return userMapper.selectById(1);
    }
}

