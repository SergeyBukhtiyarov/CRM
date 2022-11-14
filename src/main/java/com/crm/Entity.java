package com.crm;

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
    private RuleSelectCart ruleSelectCart;//ссылка на правило выбора карты доступа
    @OneToMany
    private List<CartAccess> cartAccessList;
    @OneToMany
    private List<EntityAttr> entityAttrList;
}

