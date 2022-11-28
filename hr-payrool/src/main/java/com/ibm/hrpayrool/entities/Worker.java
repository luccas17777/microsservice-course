package com.ibm.hrpayrool.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.io.Serializable;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Worker implements Serializable { //Serve para que o objeto criado com essa classe seja transformado em BYTES.
    private static final long serialVersionUID=1L;

    private Long id;
    private String name;
    private Double dailyIncome;


}
