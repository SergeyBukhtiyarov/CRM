package com.crm.entity;

import lombok.Data;

import javax.persistence.*;
import javax.persistence.Entity;
import java.util.UUID;

//Карта доступа атрибута сущности
@Entity
@Data
public class CartAccessAttr {
    @Id
    @GeneratedValue
    private UUID cartAccessAttrId;
    private String name;//наименование
    private boolean readable;//чтение
    private boolean editable;//редактирование
    @OneToOne(cascade = CascadeType.ALL)
    private EntityAttr entityAttr;//ссылка на Атрибут сущности
    @OneToOne(cascade = CascadeType.ALL)
    private RightsUseRule rightsUseRule;// ссылка на правило применения прав
}
