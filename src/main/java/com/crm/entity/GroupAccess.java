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
    @ManyToMany(cascade = CascadeType.ALL)
    private List<User> users;
    @ManyToMany(cascade = CascadeType.ALL)
    private List<Role> roles;
    @ManyToMany(cascade = CascadeType.ALL)
    private List<CartAccess> cartAccesses;
//    @ManyToMany
//    private List<CartGroupAccess> cartGroupAccessList;// ссылка на связьГрупп доступа с Картами доступа


}
