package com.crm;

import lombok.Data;

import javax.persistence.GeneratedValue;
import javax.persistence.Id;
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
    private RuleSelectCart ruleSelectCart;//ссылка на правило выбора карты доступа
}
