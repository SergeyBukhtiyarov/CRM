package com.crm;

import lombok.Data;

import javax.persistence.*;
import javax.persistence.Entity;
import java.util.List;
import java.util.UUID;
//Связь Групп доступа с Картами доступа
@Entity
@Data
public class CartGroupAccess {
    @Id
    @GeneratedValue
    private UUID cartGroupAccessId;
    private String name;// наименование
    @ManyToOne
    private CartAccess cartAccess;//ссылка на карту доступа
   @ManyToMany
    private List<GroupAccess> groupAccessList;// ссылка на группу доступа

}
