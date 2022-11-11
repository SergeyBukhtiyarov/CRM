package com.crm;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.util.UUID;
//Группа доступа
@Entity
@Data
public class GroupAccess {
    @Id
    @GeneratedValue
    private UUID groupAccessId;
    private String name;//наименование

}
