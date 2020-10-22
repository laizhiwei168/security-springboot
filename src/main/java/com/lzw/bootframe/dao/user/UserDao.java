package com.lzw.bootframe.dao.user;

import com.lzw.bootframe.model.user.SysUser;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class UserDao {
    @Autowired
    JdbcTemplate jdbcTemplate;

    public SysUser getUserByUsername(String username){
        System.out.println("-=-=-=-==-getUserByUsername-=-=-=-=-=-");
        String sql="select * from sys_user where username = ?";
        List<SysUser> userList = jdbcTemplate.query(sql,new Object[]{username},new BeanPropertyRowMapper<>(SysUser.class));
        if(userList !=null && userList.size() >= 1){
            return userList.get(0);
        }
        return null;
    }

    public List findPermissionsByUserId(String id){
        // 这里查询的是用户对应角色中所有资源的code字段
        List<String> permissions= new ArrayList<String>();
        permissions.add("p1");
        permissions.add("p3");
        return permissions;
    }

}
