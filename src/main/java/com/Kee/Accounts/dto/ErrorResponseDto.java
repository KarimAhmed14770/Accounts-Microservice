package com.Kee.Accounts.dto;


import io.swagger.v3.oas.annotations.media.Schema;
import org.springframework.cglib.core.Local;

import java.time.LocalDateTime;

@Schema(
        name = "ErrorResponse",
        description = "Schema to hold error response information"
)
public record ErrorResponseDto(
        @Schema(
                description = "Error code representing the error happened",
                example = "400 HTTP_BAD_REQUEST"
        )
        Integer status,


        @Schema(
                description = "Error message representing the error happened",
                example = "invalid input"
        )
        String message,

        @Schema(
                description = "Time representing when the error happened"
        )
        LocalDateTime timeStamp) {
}
