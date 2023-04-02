package com.robbit.repos.joins;

import com.robbit.entities.joins.UserRole;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRoleRepo extends JpaRepository<UserRole, Integer> {

}
