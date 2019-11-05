package net.invoker.securitydemo.Entity;

import lombok.Data;

import java.io.Serializable;

/**
 * Created by invoker on 2019-10-19
 * Description:
 */
@Data
public class SysRole implements Serializable {
    static final long serialVersionUID = 1L;

    private Integer id;

    private String name;
}
