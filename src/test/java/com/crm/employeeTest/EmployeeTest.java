package com.crm.employeeTest;

import com.crm.entity.*;
import com.crm.repository.EmployeeRepository;
import com.crm.repository.EntityRepository;
import com.crm.repository.GroupAccessRepository;
import com.crm.repository.UserRepository;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.stereotype.Service;
import static org.junit.jupiter.api.Assertions.*;

import java.util.*;

@SpringBootTest
public class EmployeeTest {

    @Autowired
    EmployeeRepository employeeRepository;
    @Autowired
    GroupAccessRepository groupAccessRepository;
    @Autowired
    UserRepository userRepository;

    @Test
    public void trySaveAllModelsMappedToEachOther() {
        //create 2 Users
        User user1 = new User();
        user1.setName("test-user-name");
        user1.setLogin("test-user-login");
        user1.setPassword("test-user-password");
        user1.setStartDate(new Date());
        user1.setStopDate(new Date(System.currentTimeMillis() + 3600 * 1000));
        user1.setFinishDate(new Date(System.currentTimeMillis() + 7200 * 1000));
        user1.setActive(true);
        user1.setActive(true);
        User user2 = new User();
        user2.setName("test-user-name2");
        user2.setLogin("test-user-login2");
        user2.setPassword("test-user-password2");
        user2.setStartDate(new Date());
        user2.setStopDate(new Date(System.currentTimeMillis() + 3600 * 1000));
        user2.setFinishDate(new Date(System.currentTimeMillis() + 7200 * 1000));
        user2.setActive(true);
        user2.setActive(true);
        //create two Employees
        Employee employee1 = new Employee();
        employee1.setName("test-emp-name");
        employee1.setLastName("test-emp-lastname");
        employee1.setFirstName("test-emp-firstname");
        employee1.setMidlName("test-emp-midname");
        employee1.setTel("test-emp-tel");
        employee1.setEmail("test-emp-email");
        Employee employee2 = new Employee();
        employee2.setName("test-emp-name");
        employee2.setLastName("test-emp-lastname");
        employee2.setFirstName("test-emp-firstname");
        employee2.setMidlName("test-emp-midname");
        employee2.setTel("test-emp-tel");
        employee2.setEmail("test-emp-email");
        //map Employee with User
        employee1.setUser(user1);
        employee2.setUser(user2);
        user1.setEmployee(employee1);
        user2.setEmployee(employee2);
        //create Role
        Role role1 = new Role();
        role1.setName("test-role-name1");
        Role role2 = new Role();
        role2.setName("test-role-name2");
        //map Role with User
        user1.setRole(role1);
        user2.setRole(role2);
        //create GroupAccess
        GroupAccess groupAccess = new GroupAccess();
        groupAccess.setName("test-groupAccess-name");
        //map users and roles to GroupAccess and vice versa
        groupAccess.setUsers(Arrays.asList(user1, user2));
        groupAccess.setRoles(Arrays.asList(role1, role2));
        role1.setGroupAccesses(Arrays.asList(groupAccess));
        role2.setGroupAccesses(Arrays.asList(groupAccess));
        //create two CartAccess
        CartAccess cartAccess1 = new CartAccess();
        cartAccess1.setName("test-carAccess-name1");
        cartAccess1.setS_created(true);
        cartAccess1.setReadable(true);
        cartAccess1.setEditable(true);
        cartAccess1.setRemoved(false);
        CartAccess cartAccess2 = new CartAccess();
        cartAccess2.setName("test-carAccess-name2");
        cartAccess2.setS_created(true);
        cartAccess2.setReadable(true);
        cartAccess2.setEditable(true);
        cartAccess2.setRemoved(false);
        //map cartAccess to groupAccess and vice versa
        cartAccess1.setGroupAccesses(Arrays.asList(groupAccess));
        cartAccess2.setGroupAccesses(Arrays.asList(groupAccess));
        groupAccess.setCartAccesses(Arrays.asList(cartAccess1, cartAccess2));
        //create Entity
        Entity entity = new Entity();
        entity.setName("test-entity-name");
        entity.setSystemName("test-entity-system-name");
        //map entity to two cartsAccess
        cartAccess1.setEntity(entity);
        cartAccess2.setEntity(entity);
        //create RuleSelectCart
        RuleSelectCart ruleSelectCart = new RuleSelectCart();
        ruleSelectCart.setName("test-ruleSelectCart-name");
        ruleSelectCart.setSqlString("test-ruleSelectCart-sql");
        //map ruleSelect to entity
        entity.setRuleSelectCart(ruleSelectCart);
        //create two EntityAttrs
        EntityAttr entityAttr1 = new EntityAttr();
        entityAttr1.setName("test-entAttr-name1");
        entityAttr1.setSystemName("test-entAttr-sysName1");
        EntityAttr entityAttr2 = new EntityAttr();
        entityAttr2.setName("test-entAttr-name2");
        entityAttr2.setSystemName("test-entAttr-sysName2");
        //map attrs to Entity and vice versa
        entity.setEntityAttrList(Arrays.asList(entityAttr1, entityAttr2));
        entityAttr1.setEntity(entity);
        entityAttr2.setEntity(entity);
        //create CartAccessAttr
        CartAccessAttr cartAccessAttr = new CartAccessAttr();
        cartAccessAttr.setName("test-cartAccAttr-name");
        cartAccessAttr.setReadable(true);
        cartAccessAttr.setEditable(true);
        //map cartAccessAttr to entityAttr
        cartAccessAttr.setEntityAttr(entityAttr1);
        //create RightsUseRule
        RightsUseRule rightsUseRule = new RightsUseRule();
        rightsUseRule.setName("test-rightsUse-name");
        rightsUseRule.setSqlString("test-rightsUse-sql");
        //map RightsUse to cartAccess
        cartAccessAttr.setRightsUseRuleId(rightsUseRule);

//        groupAccessRepository.save(groupAccess);
//
//        employeeRepository.save(employee1);
//        employeeRepository.save(employee2);
        User savedUser1 = userRepository.save(user1);
        User savedUser2 = userRepository.save(user2);

        User userFromDB = userRepository.findById(savedUser1.getId()).orElse(null);
        //test that user exist
        assertNotNull(userFromDB);
        //test that user have employee and employee have name and etc
        assertEquals(
                userFromDB.getEmployee().getName(),
                user1.getEmployee().getName());
        //check that user have role
        assertNotNull(userFromDB.getRole());
        Role roleFromDB = userFromDB.getRole();
        //check that role is mapped to group access
        assertNotNull(roleFromDB.getGroupAccesses());
        assertEquals(roleFromDB.getGroupAccesses().size(),1);
        GroupAccess groupAccessFromDB = role1.getGroupAccesses().get(0);
        //check that GroupAccess is mapped to two CartAccess
        assertNotNull(groupAccessFromDB.getCartAccesses());
        assertEquals(groupAccessFromDB.getCartAccesses().size(),2);
        //check that CartAccess mapped to Entity
        CartAccess cartAccess = groupAccessFromDB.getCartAccesses().get(0);
        assertNotNull(cartAccess.getEntity());



    }


}
