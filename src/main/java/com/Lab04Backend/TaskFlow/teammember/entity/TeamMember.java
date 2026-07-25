package com.Lab04Backend.TaskFlow.teammember.entity;

import com.Lab04Backend.TaskFlow.member.entity.Members;
import com.Lab04Backend.TaskFlow.team.entity.Teams;
import com.Lab04Backend.TaskFlow.member.enums.MemberRole;
import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.*;

import java.util.UUID;

@NoArgsConstructor
@AllArgsConstructor
@RequiredArgsConstructor

@Data
@Builder
@Entity
public class TeamMember {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "member_id", nullable = false, updatable = false)
    @NonNull private Members member;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "team_id", nullable = false, updatable = false)
    @JsonIgnore
    @NonNull private Teams team;

    @Enumerated(EnumType.STRING)
    @NonNull private MemberRole role;

}
