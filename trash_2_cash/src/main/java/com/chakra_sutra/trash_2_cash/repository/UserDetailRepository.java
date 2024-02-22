package com.chakra_sutra.trash_2_cash.repository;

import com.chakra_sutra.trash_2_cash.entity.UserDetails;
import io.swagger.models.auth.In;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.stereotype.Repository;

@Repository
@EnableJpaRepositories
public interface UserDetailRepository extends JpaRepository<UserDetails, Integer> {
}
