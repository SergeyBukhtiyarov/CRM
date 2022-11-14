package com.crm.entity;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import java.util.UUID;
//Работник
@Entity
@Data
public class Employee {
    @Id
    @GeneratedValue
    private UUID employeeId;
    private String name;//Наименование
    private String lastName;//Фамилия
    private String firstName;//Имя
    private String midlName;//Отчество
    private String tel;//Телефон
    private String email;//E-mail
    @OneToOne
    private User user;//Ссылка на пользователя
}
