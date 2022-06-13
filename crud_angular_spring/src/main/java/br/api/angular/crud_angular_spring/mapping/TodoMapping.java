package br.api.angular.crud_angular_spring.mapping;

import br.api.angular.crud_angular_spring.domain.Todo;
import br.api.angular.crud_angular_spring.dto.TodoDTO;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

@Mapper
public interface TodoMapping {

    TodoMapping INSTANCE = Mappers.getMapper(TodoMapping.class);

    @Mapping(target = "tit", source = "entity.titulo")
    @Mapping(target = "desc", source = "entity.descricao")
    @Mapping(target = "dataFinalizar", source = "entity.dataParaFinalizar")
    @Mapping(target = "finali", source = "entity.finalizado")
    TodoDTO modelTODto(Todo entity);

}
