package com.cjf.demo.dao;


import com.cjf.demo.domain.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

/**
 * user Mapper
 */
@Mapper
@Repository
public interface UserMapper {
    @Select("select * from user where id=#{id}")
    User findById(Integer id);
}
