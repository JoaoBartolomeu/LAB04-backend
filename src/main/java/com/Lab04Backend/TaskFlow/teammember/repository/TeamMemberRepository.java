package com.Lab04Backend.TaskFlow.teammember.repository;

import com.Lab04Backend.TaskFlow.member.entity.Members;
import com.Lab04Backend.TaskFlow.team.entity.Teams;
import com.Lab04Backend.TaskFlow.teammember.entity.TeamMember;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.UUID;

@Repository
public interface TeamMemberRepository extends JpaRepository<TeamMember, UUID> {

    List<TeamMember> findTeamMemberByTeam(Teams team);
    TeamMember findTeamMemberByMember(Members members);

}
