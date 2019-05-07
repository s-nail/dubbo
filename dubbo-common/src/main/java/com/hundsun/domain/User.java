package com.hundsun.domain;



import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.io.Serializable;

@Getter
@Setter
@ToString
public class User implements Serializable {
    private int id;
    private String username;
    private String password;

}
