package com.crm.entity;

import lombok.Data;

import javax.persistence.*;
import javax.persistence.Entity;
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
    @OneToOne(cascade = CascadeType.ALL)
    private User user;//Ссылка на пользователя
}
