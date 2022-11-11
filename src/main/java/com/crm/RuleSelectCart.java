package com.crm;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.util.UUID;
//Правило выбора карты доступа к сущности
@Entity
@Data
public class RuleSelectCart {
    @Id
    @GeneratedValue
    private UUID ruleSelectCartId;
    private String name; //наименование
    private String sqlString;//запрос

}