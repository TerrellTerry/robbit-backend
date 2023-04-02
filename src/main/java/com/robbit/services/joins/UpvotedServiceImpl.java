package com.robbit.services.joins;

import com.robbit.repos.joins.UpvotedRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class UpvotedServiceImpl implements UpvotedService{
    @Autowired
    UpvotedRepo upvotedRepo;
}
