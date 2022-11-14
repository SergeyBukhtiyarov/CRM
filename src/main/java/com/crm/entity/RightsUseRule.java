package com.crm.entity;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import java.util.UUID;
//Правило применения прав к атрибуту
@Entity
@Data
public class RightsUseRule {

    @Id
    @GeneratedValue
    private UUID rightsUseRuleId;
    private String name;//наименование
    private  String sqlString;//запрос
    @OneToOne
    private CartAccessAttr cartAccessAttr;// ссылка на Карта доступа атрибута сущности
}
