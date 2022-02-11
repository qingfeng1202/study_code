package com.qingfeng.springboot_security.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class UserDO implements Serializable {

    private Long id;

    private String userName;

    private String password;

}
