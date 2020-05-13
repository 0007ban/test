package com.hirit.research.account.controller;

import com.hirit.research.account.model.Style;
import com.hirit.research.account.service.StyleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("test")
public class MainController {

    @Autowired
    private StyleService styleService;

    @GetMapping("index")
    public String getIndex() {
        return "hello";
    }

    @GetMapping("json")
    public Map<String, Object> getJson() {
        Map<String, Object> map = new HashMap<>();
        map.put("json", "helloJson");
        return map;
    }

    //Entity 방식으로 데이터 조회
    @GetMapping("entity")
    public ResponseEntity getEntity() {
        Map<String, Object> map = new HashMap<>();
        map.put("entity", "helloEntity");
        return ResponseEntity.ok(map);
    }

    //Style 테이블에 존재하는 전체 데이터 조회 ('SELECT * FROM STYLE' 과 같은 로직)
    @GetMapping("styleAll")
    public ResponseEntity getStyleAll() {
        return ResponseEntity.ok(styleService.getStyleAll());
    }

    //styleId를 파라미터로 넘겨줘서 해당하는 데이터만 조회
    @GetMapping("style")
    public ResponseEntity getStyle(@RequestParam(value = "id") String id) {
        return ResponseEntity.ok(styleService.getStyle(id));
    }

    @GetMapping("styleId")
    public ResponseEntity getStyleId(@RequestParam(value = "id") String id) {
        return ResponseEntity.ok(styleService.getStyleId(id));
    }

    @PostMapping
    public ResponseEntity createStyle(@RequestBody Style style) {
        return ResponseEntity.ok(styleService.createStyle(style));
    }

    @DeleteMapping
    public void deleteStyle(@RequestParam(value = "id") String id, @RequestParam(value = "pId") String pId) {
        styleService.deleteStyle(id, pId);
    }

    @PutMapping
    public ResponseEntity updateStyle(@RequestBody Style style) {
        return ResponseEntity.ok(styleService.updateStyle(style));
    }
}
