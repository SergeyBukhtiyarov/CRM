package com.crm;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.util.Date;
import java.util.UUID;
//Пользователь
@Entity
@Data
public class User {
    @Id
    @GeneratedValue
    private UUID userId;
    private String name; //наименование
    private String login;//логин
    private String password;//пароль
    private Role role;//роль
    private Date startDate;//начало действия пароля
    private Date stopDate;//окончание действия пароля
    private Date finishDate;//срок действия учетной записи
    private boolean isActive;//активен
    private boolean isNew;//новый пользователь


}
