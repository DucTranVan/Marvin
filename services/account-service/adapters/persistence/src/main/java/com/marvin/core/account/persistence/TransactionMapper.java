package com.marvin.core.account.persistence;

import com.marvin.core.account.application.domain.transaction.Transaction;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;
import org.springframework.stereotype.Component;

@Mapper(componentModel = "spring")
@Component
public interface TransactionMapper {

    @Mappings({
            @Mapping(target = "serviceAddress", ignore = true)
    })
    Transaction entityToApi(TransactionMongoEntity entity);

    @Mappings({
            @Mapping(target = "id", ignore = true),
            @Mapping(target = "version", ignore = true)
    })
    TransactionMongoEntity apiToEntity(Transaction api);
}
