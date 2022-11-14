package com.crm.repository;

import com.crm.entity.GroupAccess;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;
@Repository
public interface GroupAccessRepository extends JpaRepository<GroupAccess, UUID> {
}
