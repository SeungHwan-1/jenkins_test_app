package com.ohgiraffers.jenkins_test_app.service;

import com.ohgiraffers.jenkins_test_app.entity.Menu;
import com.ohgiraffers.jenkins_test_app.repository.MenuRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class Menuservice {

    @Autowired
    private MenuRepository menuRepository;

    public List selectAllMenu() {
       List<Menu> menuList = menuRepository.findAll();
       if(menuList.isEmpty()){
           return null; /*123123*/
       }
       return menuList;
    }
}
