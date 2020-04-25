package com.wordpress.carledwinti.easytask.api.model;

import com.wordpress.carledwinti.easytask.api.enums.StatusTarefa;
import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.time.LocalDate;

@Document
@Data
public class Tarefa {

    @Id
    private String id;
    private String descricao;
    private LocalDate dataCriacao;
    private LocalDate dataConclusao;
    private StatusTarefa statusTarefa;
}
