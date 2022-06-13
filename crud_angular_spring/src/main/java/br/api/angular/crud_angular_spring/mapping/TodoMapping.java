package br.api.angular.crud_angular_spring.mapping;

import br.api.angular.crud_angular_spring.entity.Todo;
import br.api.angular.crud_angular_spring.entity.dto.TodoDTO;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.NullValueCheckStrategy;
import org.mapstruct.NullValuePropertyMappingStrategy;
import org.mapstruct.factory.Mappers;


@Mapper(nullValuePropertyMappingStrategy = NullValuePropertyMappingStrategy.IGNORE, nullValueCheckStrategy = NullValueCheckStrategy.ALWAYS)
public abstract class TodoMapping {

    public static final TodoMapping INSTANCE = Mappers.getMapper(TodoMapping.class);

    @Mapping(target = "titulo", source = "entity.titulo")
    @Mapping(target = "descricao", source = "entity.descricao")
    @Mapping(target = "dataParaFinalizar", source = "entity.dataParaFinalizar")
    @Mapping(target = "finalizado", source = "entity.finalizado")
    public abstract TodoDTO modelTODto(Todo entity);


}
