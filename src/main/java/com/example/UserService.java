package com.example;

public class UserService {

    public User getUser(String userId) {
        return new User(userId, "test_user");
    }

    public boolean login(String username, String password) {
        // TODO: 实现登录逻辑
        return false;
    }
    
    public void logout(String userId) {
        System.out.println("用户" + userId + "已退出");
    }
}
