package com.epicb.githubactionprac;

import static org.assertj.core.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.transaction.annotation.Transactional;

import com.epicb.githubactionprac.domain.model.User;
import com.epicb.githubactionprac.infra.UserRepository;

@SpringBootTest
class GithubActionPracApplicationTests {

	@Autowired
	UserRepository repository;

	@Test
	@Transactional
	void must_fail_test() {
		var user = new User();
		user.setName("hello");
		user = repository.save(user);

		assertThat(repository.findById(user.getId())).isNotNull().get().extracting("id").isEqualTo(3L);

	}

}
