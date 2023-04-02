package com.robbit.repos.joins;

import com.robbit.entities.joins.JoinedSubrobbit;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface JoinedSubrobbitRepo extends JpaRepository<JoinedSubrobbit, Integer> {
}
