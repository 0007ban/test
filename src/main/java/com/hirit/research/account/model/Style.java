package com.hirit.research.account.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;

@Entity
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@IdClass(StylePk.class)
public class Style {

    @Id
    @Column(name = "PROJECTID")
    private String projectId;

    @Id
    @Column(name = "COMPONENT")
    private String component;

    @Id
    @Column(name = "STYLEID")
    private String styleId;

    @Column(name = "COMMENTFIELD")
    private String commentField;

}
