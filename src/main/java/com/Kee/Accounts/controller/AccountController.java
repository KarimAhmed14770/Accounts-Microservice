package com.Kee.Accounts.controller;



import com.Kee.Accounts.dto.Account.AccountCreateDto;
import com.Kee.Accounts.dto.Account.AccountReturnDto;
import com.Kee.Accounts.dto.ErrorResponseDto;
import com.Kee.Accounts.service.AccountService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.ExampleObject;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.tags.Tag;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping(path = "/api/accounts",produces = {MediaType.APPLICATION_JSON_VALUE})
@Tag(name="Account Api",
description = "api endpoints for crud functionality on bank accounts")
public class AccountController {

    private final AccountService accountService;


    @PostMapping
    @Operation(
            summary = "create a new account for a customer",
            description = "receives customer id and account type to create an account "
    )
    @ApiResponse(responseCode = "201",description = "account created successfully")
    @ApiResponse(responseCode = "400", description = "Invalid input for customer data",
            content = @Content(
                    schema = @Schema(implementation = ErrorResponseDto.class),
            examples = @ExampleObject(
            name = "Validation Error",
            value = "{\"status\": 400, \"message\": \"Invalid input\", \"timeStamp\": \"2026-07-01T11:20:26Z\"}")))
    @ApiResponse(
            responseCode = "500",
            description = "Internal Server Error - An unexpected error occurred on the server.",
            content = @Content(
            schema = @Schema(implementation = ErrorResponseDto.class),
                    examples = @ExampleObject(
                            name = "Validation Error",
                            value = "{\"status\": 500, \"message\": \"unexpected error\", \"timeStamp\": \"2026-07-01T11:20:26Z\"}"))
    )

    public ResponseEntity<AccountReturnDto> createCustomer(@Valid @RequestBody AccountCreateDto accountDto){
        return  ResponseEntity.status(HttpStatus.CREATED).body(accountService.createAccount(accountDto));
    }

}
