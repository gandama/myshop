package hello.service;

import hello.entity.User;

import java.util.List;

/**
 * Created by yang on 2017/11/29.
 */
public interface HelloService {
    public List<User> findUserByName(String name);
}
