package com.crm.entity;

import lombok.Data;

import javax.persistence.*;
import java.util.List;
import java.util.UUID;

//Сущность
@javax.persistence.Entity
@Data
public class Entity {
    @Id
    @GeneratedValue
    private UUID entityId;
    private String name;//наименование
    private String systemName;//системное имя
    @OneToOne
    @Transient
    private CartAccess cartAccess;
    @OneToOne(cascade = CascadeType.ALL)
    private RuleSelectCart ruleSelectCart;//ссылка на правило выбора карты доступа
    @OneToMany(mappedBy = "entity", cascade = CascadeType.ALL)
    private List<EntityAttr> entityAttrList;// ссылка на атрибуты сущности
}

