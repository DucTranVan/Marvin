package com.marvin.core.account.persistence.Account;

import com.marvin.shares.api.account.AccountDto;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;
import org.springframework.stereotype.Component;

@Mapper(componentModel = "spring")
@Component
public interface AccountMapper {
    @Mappings({
            @Mapping(target = "serviceAddress", ignore = true)
    })
    AccountDto entityToApi(AccountMongoEntity entity);

    @Mappings({
            @Mapping(target = "id", ignore = true),
            @Mapping(target = "version", ignore = true)
    })
    AccountMongoEntity apiToEntity(AccountDto api);
}