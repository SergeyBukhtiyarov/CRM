package com.crm;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.util.UUID;
//Правило применения прав к атрибуту
@Entity
@Data
public class RightsUseRuleId {

    @Id
    @GeneratedValue
    private UUID rightsUseRuleId;
    private String name;//наименование
    private  String sqlString;//запрос
}
