package com.crm;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.util.UUID;
//Связь Групп доступа с Картами доступа
@Entity
@Data
public class CartGroupAccess {
    @Id
    @GeneratedValue
    private UUID cartGroupAccessId;
    private String name;// наименование
    private CartAccess cartAccess;//ссылка на карту доступа
    private GroupAccess groupAccess;// ссылка на группу доступа

}
