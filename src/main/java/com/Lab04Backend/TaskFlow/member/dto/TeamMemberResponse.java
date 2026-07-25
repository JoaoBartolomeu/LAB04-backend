package com.Lab04Backend.TaskFlow.member.dto;

import com.Lab04Backend.TaskFlow.member.entity.Members;
import com.Lab04Backend.TaskFlow.member.enums.MemberRole;
import com.Lab04Backend.TaskFlow.teammember.entity.TeamMember;

import java.util.UUID;

public record TeamMemberResponse(UUID id, String teamName, MemberRole role) {

    public static TeamMemberResponse fromEntity(Members members, TeamMember teamMember) {
        return new TeamMemberResponse(members.getId(), teamMember.getTeam().getName(), teamMember.getRole());
    }
}
