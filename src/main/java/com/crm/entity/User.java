package com.crm.entity;

import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import javax.persistence.Entity;
import java.util.Date;
import java.util.List;
import java.util.UUID;
//Пользователь
@Data
@Entity(name = "user")
public class User {
    @Id
    @GeneratedValue
    private UUID id;
    private String name; //наименование
    private String login;//логин
    private String password;//пароль
    private Date startDate;//начало действия пароля
    private Date stopDate;//окончание действия пароля
    private Date finishDate;//срок действия учетной записи
    private boolean isActive;//активен
    private boolean isNew;//новый пользователь
    @OneToOne(cascade = CascadeType.ALL)
    private Role role;//ссылка на Роль
    @OneToOne(cascade = CascadeType.ALL,mappedBy = "user")
    private Employee employee;

//    @ManyToMany
//    private List<GroupAccess> groupAccesses;


}
