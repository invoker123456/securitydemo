package net.invoker.securitydemo.Entity;

import lombok.Data;

import java.io.Serializable;

/**
 * Created by invoker on 2019-10-19
 * Description:
 */
@Data
public class SysUserRole implements Serializable {
    static final long serialVersionUID = 1L;

    private Integer userId;

    private Integer roleId;
}
