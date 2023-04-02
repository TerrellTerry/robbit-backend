package com.robbit.services;

import com.robbit.repos.SubrobbitRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SubrobbitServiceImpl implements SubrobbitService{
    @Autowired
    SubrobbitRepo subrobbitRepo;
}
