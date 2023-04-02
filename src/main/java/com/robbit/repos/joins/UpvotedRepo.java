package com.robbit.repos.joins;

import com.robbit.entities.joins.Upvoted;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UpvotedRepo extends JpaRepository<Upvoted, Integer> {

}
