package com.robbit.services;

import com.robbit.repos.AppUserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AppUserServiceImpl implements AppUserService{
    @Autowired
    AppUserRepo appUserRepo;
}
