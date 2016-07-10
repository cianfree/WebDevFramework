package cn.arvin.example.cache.service.impl;

import cn.arvin.example.cache.domain.User;
import cn.arvin.example.cache.query.UserQuery;
import cn.arvin.example.cache.service.UserService;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;

import java.util.List;

import static org.junit.Assert.*;

/**
 * Created by Arvin on 2016/7/10.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration({"classpath:applicationContext-service.xml"})
public class UserServiceMemoryImplTest {

    @Autowired
    private UserService userService;

    @Before
    public void prepare() {
        for (int i = 0; i < 20; ++i) {
            User user = new User();
            user.setAge(10 + i);
            user.setName("Arvin_" + i);
            userService.save(user);
        }
    }

    @Test
    public void testSave() throws Exception {
    }

    @Test
    public void testDelete() throws Exception {

    }

    @Test
    public void testUpdate() throws Exception {

    }

    @Test
    public void testFindById() throws Exception {

    }

    @Test
    public void testQuery() throws Exception {
        UserQuery query = new UserQuery();
        query.setCurPage(10);
        query.setPageSize(5); // 0-4, 5-9

        List<User> users = userService.query(query);

        showUserList(users);
    }

    private void showUserList(List<User> users) {

        for (User user : users) {
            System.out.println(user);
        }

    }
}