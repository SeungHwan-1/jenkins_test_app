package com.ohgiraffers.jenkins_test_app.controller;

import com.ohgiraffers.jenkins_test_app.entity.Menu;
import com.ohgiraffers.jenkins_test_app.service.Menuservice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;


@RestController
@RequestMapping("/menu")
public class Menucontroller {
    @Autowired
    private Menuservice menuservice;

    @GetMapping("/select")
    public ResponseEntity selectAllMenu(){

        List<Menu> menuList = menuservice.selectAllMenu();
        if(menuList != null)
            return ResponseEntity.ok().body(menuList);
        else {
            return ResponseEntity
                    .status(HttpStatus.INTERNAL_SERVER_ERROR)
                    .body("서버 오류 발생11");

        }

    }
}
