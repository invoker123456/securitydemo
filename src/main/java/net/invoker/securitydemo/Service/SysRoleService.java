package net.invoker.securitydemo.Service;

import net.invoker.securitydemo.Dao.SysRoleMapper;
import net.invoker.securitydemo.Entity.SysRole;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by invoker on 2019-10-19
 * Description:
 */
@Service
public class SysRoleService {
    @Autowired
    private SysRoleMapper roleMapper;

    public SysRole selectById(Integer id) {
        return roleMapper.selectById(id);
    }

    public SysRole selectByName(String name) {
        return roleMapper.selectByName(name);
    }
}
