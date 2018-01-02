package hello.service.impl;

import hello.dao.HelloDao;

import hello.service.HelloService;
import hello.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created by yang on 2017/11/29.
 */

@Service
public class HelloServiceImpl implements HelloService {

    @Resource
    private HelloDao helloDao;

    public List<User> findUserByName(String name) {
        System.out.println("name = " + name);
        List<User> users = helloDao.findUserByName(name);

        return users;

    }
}
