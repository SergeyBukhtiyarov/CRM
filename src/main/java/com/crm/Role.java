package com.crm;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.util.UUID;
//Роль
@Entity
@Data
public class Role {
    @Id
    @GeneratedValue
    private UUID roleId;
    private String name;//Наименование
}
