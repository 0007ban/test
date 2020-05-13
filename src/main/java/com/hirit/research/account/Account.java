package com.hirit.research.account;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;

@Data
@Entity
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Account {
    /**
     *  @Data : lombok  @ToString, @EqualsAndHashCode, @Getter, @Setter, @RequiredArgsConstructor을 한번에 사용하는 강력한 어노테이션
     *  @Entity : JPA 설정
     *  @NoArgsConstructor
     *  @AllArgsConstructor
     *  @Builder
     *  : 생성자 / 빌드 패턴
      */
    @Id
    @GeneratedValue
    private long id;
    @NotNull
    @Column(nullable = false, unique = true)
    private String userName;
    @JsonInclude(JsonInclude.Include.NON_NULL)
    // Json 보낼 때 히든 처리
    private String password;
    @NotNull
    @Column(nullable = false, unique = true)
    private String email;


}
