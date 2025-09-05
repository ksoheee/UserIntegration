package com.example.userIntegration.repository;

import com.example.userIntegration.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
    boolean existsByUsername(String username); //username으로 존재 여부 확인
    //중복 username체크 (다른 id에)
    // id는 같고 이름이 다르면 통과, id는 다른데 이름이 같으면 에러
    boolean existsByUsernameAndIdNot(String username,Long id);
}
