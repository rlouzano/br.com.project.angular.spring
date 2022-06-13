package br.api.angular.crud_angular_spring.entity.dto;


import java.util.Date;

/*@Getter
@AllArgsConstructor*/
public class TodoDTO {

    private String titulo;
    private String descricao;
    private Date dataParaFinalizar;
    private Boolean finalizado;

    public TodoDTO(String titulo, String descricao, Date dataParaFinalizar, Boolean finalizado) {
        this.titulo = titulo;
        this.descricao = descricao;
        this.dataParaFinalizar = dataParaFinalizar;
        this.finalizado = finalizado;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getDescricao() {
        return descricao;
    }

    public Date getDataParaFinalizar() {
        return dataParaFinalizar;
    }

    public Boolean getFinalizado() {
        return finalizado;
    }
}
