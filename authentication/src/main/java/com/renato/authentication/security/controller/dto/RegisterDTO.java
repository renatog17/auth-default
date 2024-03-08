package com.renato.authentication.security.controller.dto;

import com.renato.authentication.security.domain.UserRole;

public record RegisterDTO(String login, String password, UserRole role) {

}
