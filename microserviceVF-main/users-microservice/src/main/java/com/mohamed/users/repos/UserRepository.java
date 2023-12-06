package com.mohamed.users.repos;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.mohamed.users.entities.User;

import java.util.List;
import java.util.Optional;

public interface UserRepository extends JpaRepository<User, Long> {
	 User findByUsername(String username);
	    @Query("select u from User u where u.user_id = ?1")
	    User findUserById(Long id);



	    @Modifying
	    @Query("DELETE FROM User u WHERE u.user_id = :userId")
	    void deleteByUserId(@Param("userId") Long userId);


}
