package com.hirit.research.account.repository;

import com.hirit.research.account.model.Style;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

    public interface StyleRepository extends JpaRepository<Style, String> {

    //List<Style> findByStyleId(String id);
    Optional<Style> findByStyleId(String id);
    Optional<Style> findByProjectIdAndStyleId(String projectId, String id);

    void deleteByStyleId(String id);
}
