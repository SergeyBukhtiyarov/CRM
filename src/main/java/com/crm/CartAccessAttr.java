package com.crm;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
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
    private EntityAttr entityAttr;//ссылка на Атрибут сущности
    private RightsUseRuleId rightsUseRuleId;// ссылка на правило применения прав
}
