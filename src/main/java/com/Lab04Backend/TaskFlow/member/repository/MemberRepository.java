package com.Lab04Backend.TaskFlow.member.repository;

import com.Lab04Backend.TaskFlow.member.entity.Members;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface MemberRepository extends JpaRepository<Members, UUID> {}
