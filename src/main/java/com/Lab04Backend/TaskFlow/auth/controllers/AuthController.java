package com.Lab04Backend.TaskFlow.auth.controllers;

import com.Lab04Backend.TaskFlow.auth.dtos.LoginRequestDTO;
import com.Lab04Backend.TaskFlow.auth.dtos.LoginResponseDTO;
import com.Lab04Backend.TaskFlow.auth.services.AuthService;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/auth")
@RequiredArgsConstructor
public class AuthController {

    private final AuthService service;

    @PostMapping("/login")
    public ResponseEntity<LoginResponseDTO> login(
            @Valid @RequestBody LoginRequestDTO dto
    ) {

        return ResponseEntity.ok(
                service.login(dto)
        );

    }

}