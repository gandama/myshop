package hello.dao;

import hello.entity.User;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by yang on 2017/11/29.
 */
@Repository
public interface HelloDao {
    @Select("select * from user where username=#{name}")
    public List<User> findUserByName(String name);
}
