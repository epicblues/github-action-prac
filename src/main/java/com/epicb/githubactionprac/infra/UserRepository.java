package com.epicb.githubactionprac.infra;

import org.springframework.data.jpa.repository.JpaRepository;

import com.epicb.githubactionprac.domain.model.User;

// muyaho
public interface UserRepository extends JpaRepository<User, Long> {
}
