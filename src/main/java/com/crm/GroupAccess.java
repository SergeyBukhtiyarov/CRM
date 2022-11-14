package com.crm;

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
    private List<CartGroupAccess> cartGroupAccessList;
    @OneToMany
    private List<RoleGroupAccess> roleGroupAccessList;
    @OneToMany
    private List<UsersGroupAccess> userGroupAccessList;

}
