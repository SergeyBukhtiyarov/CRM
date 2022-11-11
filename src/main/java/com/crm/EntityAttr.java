package com.crm;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.util.UUID;
//Атрибут сущности
@Entity
@Data
public class EntityAttr {
    @Id
    @GeneratedValue
    private UUID entityAttrId;
    private String name;//наименование
    private String systemName;//системное имя
    private com.crm.Entity entity;//сылка на сущность

}
