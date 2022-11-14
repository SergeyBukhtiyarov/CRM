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
    private List<GroupAccess> groupAccesses;
}
