package com.crm.entity;

import lombok.Data;

import javax.persistence.*;
import javax.persistence.Entity;
import java.util.List;
import java.util.UUID;
//Роль
@Entity
@Data
public class Role {
    @Id
    @GeneratedValue
    private UUID roleId;
    private String name;//Наименование
    @ManyToMany(cascade = CascadeType.ALL, mappedBy = "roles", fetch = FetchType.EAGER)
//    @Transient
    private List<GroupAccess> groupAccesses;
//    @ManyToMany
//    private List<GroupAccess> groupAccesses;
//    @OneToOne
//    private User user;// ссылка на пользователя
}
