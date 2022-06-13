package br.api.angular.crud_angular_spring.service;

import br.api.angular.crud_angular_spring.exception.ObjectNotFoundException;
import br.api.angular.crud_angular_spring.domain.Todo;
import br.api.angular.crud_angular_spring.repository.TodoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class TodoService {

    @Autowired
    private TodoRepository todoRepository;

    public Todo findId(Integer id) {
        Optional<Todo> obj = todoRepository.findById(id);
        return obj.orElseThrow(() -> new ObjectNotFoundException("Objeto não encontrado! Id: " + id + ", Tipo: " +  Todo.class.getName()));
    }

    public List<Todo> findAllOpen() {
        return this.todoRepository.findAllOpen();
    }

    public List<Todo> findAllClose() {
        return this.todoRepository.findAllClose();
    }

    public List<Todo> findAll() {
        List<Todo> list = this.todoRepository.findAll();
        return list;
    }

    public Todo create(Todo obj) {
        obj.setId(null);
        return this.todoRepository.save(obj);
    }

    public void delete(Integer id) {
        this.todoRepository.deleteById(id);
    }

    public Todo update(Integer id, Todo obj) {
        Todo newObj =  findId(id);
        newObj.setTitulo(obj.getTitulo());
        newObj.setDescricao(obj.getDescricao());
        newObj.setFinalizado(obj.getFinalizado());
        newObj.setDataParaFinalizar(obj.getDataParaFinalizar());
        return todoRepository.save(newObj);
    }
}
