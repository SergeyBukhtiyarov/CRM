package com.crm.entity;

import lombok.Data;

import javax.persistence.*;
import javax.persistence.Entity;
import java.util.List;
import java.util.UUID;
//Группа доступа
@Entity
@Data
public class GroupAccess {
    @Id
    @GeneratedValue
    private UUID groupAccessId;
    private String name;//наименование
    @ManyToMany
    private List<CartGroupAccess> cartGroupAccessList;// ссылка на связьГрупп доступа с Картами доступа
    @OneToMany
    private List<RoleGroupAccess> roleGroupAccessList;// ссылка на Группы доступа роли
    @OneToMany
    private List<UsersGroupAccess> userGroupAccessList;// ссылка на Группы доступа пользователя

}
