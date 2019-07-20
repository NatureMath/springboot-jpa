package com.atguigu.springboot.repository;

import com.atguigu.springboot.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @Author huct
 * @Date 2019/7/20 - 18:45
 */

public interface UserRepository extends JpaRepository<User,Integer> {

}
