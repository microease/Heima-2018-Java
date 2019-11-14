package com.wzxdm.test;

import com.wzxdm.dao.UserDao;
import com.wzxdm.domain.User;
import org.junit.Test;

public class UserDaoTest {
    @Test
    public void testLogin() {
        User loginuser = new User();
        loginuser.setUsername("superbaby");
        loginuser.setPassword("123");
        UserDao dao = new UserDao();
        User user = dao.login(loginuser);
        System.out.println(user);
    }
}
