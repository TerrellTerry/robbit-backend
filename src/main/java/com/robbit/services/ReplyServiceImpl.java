package com.robbit.services;

import com.robbit.repos.ReplyRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ReplyServiceImpl implements ReplyService{
    @Autowired
    ReplyRepo replyRepo;
}
