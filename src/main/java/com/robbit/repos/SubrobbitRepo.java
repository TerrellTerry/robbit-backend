package com.robbit.repos;

import com.robbit.entities.Subrobbit;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SubrobbitRepo extends JpaRepository<Subrobbit, Integer> {

}
