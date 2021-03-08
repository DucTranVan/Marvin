package com.marvin.shares.api.account;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

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
    AccountDto getAccount(@PathVariable int accountId);
}

