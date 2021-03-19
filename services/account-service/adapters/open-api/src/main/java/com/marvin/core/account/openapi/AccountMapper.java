package com.marvin.core.account.openapi;

import com.marvin.core.account.application.domain.account.Account;
import com.marvin.shares.api.account.AccountDto;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;


@Mapper(componentModel = "spring")
public interface AccountMapper {

    @Mappings({
        @Mapping(target = "serviceAddress", ignore = true)
    })
    AccountDto entityToApi(Account entity);

    @Mappings({
        @Mapping(target = "id", ignore = true),
            @Mapping(target = "type", ignore = true),
    })
    Account apiToEntity(AccountDto api);
}
