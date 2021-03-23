package com.marvin.shares.api.account;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Mono;

@Api(description = "REST API for accounts information.")
public interface AccountService {

    /**
     * Sample usage: curl $HOST:$PORT/account/1
     *
     * @param accountId
     * @return the product, if found, else null
     */
    @ApiOperation(
            value = "${api.account.get-account.description}",
            notes = "${api.account.get-account.notes}")
    @ApiResponses(value = {
            @ApiResponse(code = 400, message = "Bad Request, invalid format of the request. See response message for more information."),
            @ApiResponse(code = 404, message = "Not found, the specified id does not exist."),
            @ApiResponse(code = 422, message = "Unprocessable entity, input parameters caused the processing to fails. See response message for more information.")
    })
    @GetMapping(
            value    = "/account/{accountId}",
            produces = "application/json")
    Mono<AccountDto> getAccount(@PathVariable int accountId);

    /**
     * Sample usage:
     *
     * curl -X POST $HOST:$PORT/account \
     *   -H "Content-Type: application/json" --data \
     *   '{"accountId":123,"name":"investing","userId":42}'
     *
     * @param body
     */
    @ApiOperation(
            value = "${api.account.create-account.description}",
            notes = "${api.account.create-account.notes}")
    @ApiResponses(value = {
            @ApiResponse(code = 400, message = "Bad Request, invalid format of the request. See response message for more information."),
            @ApiResponse(code = 422, message = "Unprocessable entity, input parameters caused the processing to fail. See response message for more information.")
    })
    @PostMapping(
            value    = "/account",
            consumes = "application/json")
    Mono<AccountDto> createAccount(@RequestBody AccountDto body);

    /**
     * Sample usage:
     *
     * curl -X DELETE $HOST:$PORT/account/1
     *
     * @param accountId
     */
    @ApiOperation(
            value = "${api.account.delete-account.description}",
            notes = "${api.account.delete-account.notes}")
    @ApiResponses(value = {
            @ApiResponse(code = 400, message = "Bad Request, invalid format of the request. See response message for more information."),
            @ApiResponse(code = 422, message = "Unprocessable entity, input parameters caused the processing to fail. See response message for more information.")
    })
    @DeleteMapping(value = "/account/{accountId}")
    Mono<Void> deleteAccount(@PathVariable int accountId);
}

