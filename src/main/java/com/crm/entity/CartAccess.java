package com.crm.entity;

import lombok.Data;

import javax.persistence.*;
import javax.persistence.Entity;
import java.util.List;
import java.util.UUID;

//Карта доступа
@Entity
@Data
public class CartAccess {
    @Id
    @GeneratedValue
    private UUID cartAccessId;
    private String name; //наименование
    private boolean s_created;//создание
    private boolean readable;//чтение
    private boolean editable;//редактирование
    private boolean removed;//удаление
    @ManyToMany(cascade = CascadeType.ALL)
    @Transient
    private List<GroupAccess> groupAccesses;
    @OneToOne(cascade = CascadeType.ALL)
    private com.crm.entity.Entity entity;
}
