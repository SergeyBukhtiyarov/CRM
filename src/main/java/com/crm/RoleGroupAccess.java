package com.crm;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.util.UUID;
//Группа доступа роли
@Entity
@Data
public class RoleGroupAccess {
    @Id
    @GeneratedValue
    private UUID roleGroupAccessId;
    private Role role; //Ссылка на Роль
    private GroupAccess groupAccess; //ссылка на Группу доступа

}
