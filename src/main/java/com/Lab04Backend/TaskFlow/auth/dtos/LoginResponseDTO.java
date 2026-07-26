package com.Lab04Backend.TaskFlow.auth.dtos;

public record LoginResponseDTO(

        String token,
        String id,
        String name,
        String email,
        String avatar

) {
}