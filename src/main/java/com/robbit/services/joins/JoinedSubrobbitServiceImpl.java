package com.robbit.services.joins;

import com.robbit.repos.joins.JoinedSubrobbitRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class JoinedSubrobbitServiceImpl implements JoinedSubrobbitService{
    @Autowired
    JoinedSubrobbitRepo joinedSubrobbitRepo;

}
