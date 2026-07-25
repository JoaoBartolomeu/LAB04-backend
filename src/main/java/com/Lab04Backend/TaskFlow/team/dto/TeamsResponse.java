package com.Lab04Backend.TaskFlow.team.dto;

import com.Lab04Backend.TaskFlow.team.entity.Teams;
import com.Lab04Backend.TaskFlow.teammember.entity.TeamMember;

import java.util.Set;
import java.util.UUID;

public record TeamsResponse(UUID id, String name, Set<TeamMember> members) {

    public static TeamsResponse fromEntity(Teams team) {
        return new TeamsResponse(team.getId(), team.getName(), team.getMembers());
    }
}
