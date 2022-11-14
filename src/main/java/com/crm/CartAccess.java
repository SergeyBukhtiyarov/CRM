package com.crm;

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
    @ManyToOne
    private com.crm.Entity entity;//Сущность

    @OneToMany
    private List<CartGroupAccess> cartGroupAccessList;

}
