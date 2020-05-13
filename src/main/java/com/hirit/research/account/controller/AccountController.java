package com.hirit.research.account.controller;

import com.hirit.research.account.Account;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import java.util.HashMap;
import java.util.Map;

@Controller
@RequestMapping("api/accounts")
public class AccountController {

    @GetMapping
    public String getView() {
        // sample 이름으로 된 view를 약속된 위치 (resources/templates) 에서 찾는다.
        return "sample";
    }

    @GetMapping("/withData")
    public ModelAndView getViewWithData() {
        // sample 이름의  view를 찾는다
        // ModelAndView는 데이터를 넘겨서 View에서 보여준다.
        // Data Mapping을 시켜주기 위해 thymeleaf view 엔진 라이브러리 추가
        ModelAndView modelAndView = new ModelAndView("sample");
        modelAndView.addObject("name", "Dal");
        return modelAndView;
    }

    @GetMapping("/OnlyData")
    public @ResponseBody String getOnlyData() {
        // String형 Data를 View로 보여줌
        return "DalDal";
    }

    @GetMapping("/json")
    public @ResponseBody Account getAccount() {
        return Account.builder()
                .userName("Dal")
                .email("dal.ban@miracom.co.kr")
                .build();
    }

    @PostMapping(path = "/test")
    public @ResponseBody Map<String, String> addAccount() {
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
