package com.crm.entity;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import java.util.UUID;
//Группы доступа пользователя
@Entity
@Data
public class UsersGroupAccess {
    @Id
    @GeneratedValue
    private UUID userGroupAccessId;
    private String name;//наименование
    private UUID userId; //ссылка на пользователя userId
    private UUID groupAccessId;//ссылка на Группу доступа groupAccessId
    @ManyToOne
    private  User user;//ссылка на Пользователя
    @ManyToOne
    private GroupAccess GroupAccess;// ссылка на Группа доступа
}
