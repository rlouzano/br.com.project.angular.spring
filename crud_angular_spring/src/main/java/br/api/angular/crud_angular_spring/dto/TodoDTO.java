package br.api.angular.crud_angular_spring.dto;

import com.fasterxml.jackson.annotation.JsonFormat;

import java.util.Date;

public class TodoDTO {

    private String tit;
    private String desc;
    private Date dataFinalizar;
    private Boolean finali;

    public TodoDTO(String tit, String desc, Date dataFinalizar, Boolean finali) {
        this.tit = tit;
        this.desc = desc;
        this.dataFinalizar = dataFinalizar;
        this.finali = finali;
    }

    public String getTit() {
        return tit;
    }

    public String getDesc() {
        return desc;
    }

    public Date getDataFinalizar() {
        return dataFinalizar;
    }

    public Boolean getFinali() {
        return finali;
    }
}
