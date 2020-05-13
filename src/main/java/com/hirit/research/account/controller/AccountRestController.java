package com.hirit.research.account.controller;

import com.hirit.research.account.Account;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("/api/rest")
public class AccountRestController {

    @GetMapping
    public Account getAccount() {
        // json 형식
        return Account.builder()
                .email("restApi")
                .userName("restController")
                .build();
    }

    @GetMapping("/theEnd")
    public String abcd(){
        // String 형식
        return "The End!";
    }

    @GetMapping("/{id}")
    public String getUser(@PathVariable String id) {
        return "HTTP GET was called";
    }

    @PostMapping(path = "/test")
    public Map<String, String> addAccount() {
        //create
        Map<String, String> map = new HashMap<String, String>();
        map.put("userName","반달");
        map.put("email", "dal.ban@miracom.co.kr");
        //account.setPassword("비밀!");
        //return ResponseEntity.ok(account);
        return map;
    }

    @PostMapping(path = "/test2")
    public ResponseEntity<Account> addAccount2(@RequestBody Account account) {
        //create
        return ResponseEntity.ok(account);
    }
}
