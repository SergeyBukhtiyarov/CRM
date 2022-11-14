package com.crm;

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
    @ManyToOne
    private EntityAttr entityAttr;//ссылка на Атрибут сущности
    @OneToOne
    private RightsUseRule rightsUseRuleId;// ссылка на правило применения прав
}
