package com.crm;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
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
    private com.crm.Entity entity;//Сущность

}
