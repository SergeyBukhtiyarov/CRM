package com.crm.entity;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import java.util.UUID;
//Группа доступа роли
@Entity
@Data
public class RoleGroupAccess {
    @Id
    @GeneratedValue
    private UUID roleGroupAccessId;
    @ManyToOne
    private Role role; //Ссылка на Роль
    @ManyToOne
    private GroupAccess groupAccess; //ссылка на Группу доступа

}
