package com.cxb.pss.domain;

import lombok.Data;

import java.io.Serializable;

@Data
public class Book implements Serializable {
    private static final long serialVersionUID = -2164058270260403154L;
    private String id;
    private String name;
}
