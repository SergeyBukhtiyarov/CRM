package com.crm;

import lombok.Data;

import javax.persistence.*;
import javax.persistence.Entity;
import java.util.List;
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
    @ManyToOne
    private com.crm.Entity entity;//сылка на сущность
    @OneToMany
    private List<CartAccessAttr> cartAccessAttrList;

}
