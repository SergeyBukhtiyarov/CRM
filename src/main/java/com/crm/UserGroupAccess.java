package com.crm;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.util.UUID;
//Группы доступа пользователя
@Entity
@Data
public class UserGroupAccess {
    @Id
    @GeneratedValue
    private UUID userGroupAccessId;
    private String name;
    private UUID userId;
    private UUID groupAccessId;
}
