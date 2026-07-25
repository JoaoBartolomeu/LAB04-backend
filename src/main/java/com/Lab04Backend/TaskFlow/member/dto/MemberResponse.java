package com.Lab04Backend.TaskFlow.member.dto;

import com.Lab04Backend.TaskFlow.member.entity.Members;

import java.util.UUID;

public record MemberResponse(UUID id, String name, String email) {

    public static MemberResponse fromEntity(Members member) {
        return new MemberResponse(member.getId(), member.getUser().getName(), member.getUser().getEmail());
    }
}
