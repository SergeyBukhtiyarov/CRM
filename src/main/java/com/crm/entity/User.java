package com.crm.entity;

import lombok.Data;

import javax.persistence.*;
import javax.persistence.Entity;
import java.util.Date;
import java.util.List;
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
    private Date startDate;//начало действия пароля
    private Date stopDate;//окончание действия пароля
    private Date finishDate;//срок действия учетной записи
    private boolean isActive;//активен
    private boolean isNew;//новый пользователь
    @OneToOne
    private Role role;//ссылка на Роль
    @OneToOne
    private Employee employee;//ссылка на Работника
    @OneToMany
    private List<UsersGroupAccess> usersGroupAccessList;// ссылка на Группы доступа пользователя


}
