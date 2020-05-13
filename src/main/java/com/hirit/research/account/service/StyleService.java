package com.hirit.research.account.service;

import com.hirit.research.account.model.Style;
import com.hirit.research.account.repository.StyleRepository;
import javassist.NotFoundException;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;

@Service
//@RequiredArgsConstructor //..repository final 로 선언
@AllArgsConstructor
public class StyleService {

    private StyleRepository styleRepository;


    public Map<String, Object> getStyleAll() {
        Map<String, Object> map = new HashMap<>();
        List<Style> all = styleRepository.findAll();
        map.put("styleAll", all);
        return map;
    }

    public Map<String, Object> getStyle(String id) {
        Map<String, Object> map = new HashMap<>();
        //List<Style> styleId = styleRepository.findByStyleId(id);
        Optional<Style> styleId = styleRepository.findByStyleId(id);
        map.put("styleId", styleId);
        return map;
    }

    public Style getStyleId(String id) {
        Optional<Style> styleId = styleRepository.findByStyleId(id);
        return styleId.get();
    }

    public Style createStyle(Style style) {
//        Optional<Style> styles = styleRepository.findByProjectIdAndStyleId(style.getProjectId(), style.getStyleId());
//        if (!styles.isEmpty()) {
//            //해당 데이터가 있으면 에러 처리
//        }
        return styleRepository.save(style);
    }

    @Transactional
    public void deleteStyle(String id, String pId) {
        Optional<Style> styles = styleRepository.findByProjectIdAndStyleId(pId, id);
        if (styles.isEmpty()) {
            return;
        }
        styleRepository.deleteByStyleId(id);
    }

    public Style updateStyle(Style style) {
        Optional<Style> styles = styleRepository.findByProjectIdAndStyleId(style.getProjectId(), style.getStyleId());
        if(styles.isEmpty()) {
            return null;
        }
        return styleRepository.save(style);
    }
}
