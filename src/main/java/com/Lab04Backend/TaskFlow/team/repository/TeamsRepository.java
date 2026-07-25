package com.Lab04Backend.TaskFlow.team.repository;

import com.Lab04Backend.TaskFlow.team.entity.Teams;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface TeamsRepository extends JpaRepository<Teams, UUID> {}
