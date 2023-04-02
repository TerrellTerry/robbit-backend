package com.robbit.app;

import com.robbit.entities.AppUser;
import com.robbit.repos.AppUserRepo;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@SpringBootTest
@Transactional
public class AppUserTests {
    @Autowired
    private AppUserRepo appUserRepo;

    @Test
    void get_all_users(){
        List<AppUser> appUsers = appUserRepo.findAll();
        System.out.println(appUsers);
        Assertions.assertNotEquals(0, appUsers.size());
    }

}
