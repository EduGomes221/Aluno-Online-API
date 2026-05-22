package br.com.alunoonline.api.exceptions;

import java.time.LocalDateTime;

public record ErrorResponse(
        Integer status,
        String mensagem,
        LocalDateTime timestamp
) {
}