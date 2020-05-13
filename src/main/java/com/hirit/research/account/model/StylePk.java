package com.hirit.research.account.model;

import lombok.Data;
import org.springframework.data.relational.core.mapping.Embedded;

import javax.persistence.Embeddable;
import java.io.Serializable;

@Data
@Embeddable
public class StylePk implements Serializable {
    private String projectId;

    private String component;

    private String styleId;
}
