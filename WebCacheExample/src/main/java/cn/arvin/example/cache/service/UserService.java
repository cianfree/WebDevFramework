package cn.arvin.example.cache.service;

import cn.arvin.example.cache.domain.User;
import cn.arvin.example.cache.query.UserQuery;

import java.util.List;

/**
 * Created by Arvin on 2016/7/10.
 */
public interface UserService {

    User save(User user);

    int delete(Integer userId);

    int update(User user);

    User findById(Integer userId);

    List<User> query(UserQuery query);
}
