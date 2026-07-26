package com.Lab04Backend.TaskFlow.auth.services;

import com.Lab04Backend.TaskFlow.auth.dtos.LoginRequestDTO;
import com.Lab04Backend.TaskFlow.auth.dtos.LoginResponseDTO;
import com.Lab04Backend.TaskFlow.auth.exceptions.InvalidCredentialsException;
import com.Lab04Backend.TaskFlow.security.jwt.JwtService;
import com.Lab04Backend.TaskFlow.user.entity.User;
import com.Lab04Backend.TaskFlow.user.repositories.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class AuthService {

    private final UserRepository repository;
    private final PasswordEncoder passwordEncoder;
    private final JwtService jwtService;

    public LoginResponseDTO login(LoginRequestDTO dto) {

        User user = repository.findByEmail(dto.email())
                .orElseThrow(InvalidCredentialsException::new);

        if (!passwordEncoder.matches(dto.password(), user.getPassword())) {
            throw new InvalidCredentialsException();
        }

        String token = jwtService.generateToken(user.getEmail());

        return new LoginResponseDTO(
                token,
                user.getId(),
                user.getName(),
                user.getEmail(),
                user.getAvatar()
        );
    }

}