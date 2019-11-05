package net.invoker.securitydemo.Service;

import net.invoker.securitydemo.Dao.SysUserRoleMapper;
import net.invoker.securitydemo.Entity.SysUserRole;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by invoker on 2019-10-19
 * Description:
 */
@Service
public class SysUserRoleService {
    @Autowired
    private SysUserRoleMapper userRoleMapper;

    public List<SysUserRole> listByUserId(Integer userId) {
        return userRoleMapper.listByUserId(userId);
    }

}
