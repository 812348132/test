package com.example.democlient.dao;


import com.example.democlient.pojo.User;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface UserMapper {

    User getUser(@Param("id") Long id);

}
