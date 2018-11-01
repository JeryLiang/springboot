package com.mj.didiDemo.mapper;

import com.mj.didiDemo.domain.User;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

/**
 * @author zhoujian123@hotmail.com 2018/5/19 15:33
 */
@Repository
@Mapper
public interface UserMapper {

    User getUserById(long id);
}
