package net.invoker.securitydemo.Service;

import net.invoker.securitydemo.Dao.SysUserMapper;
import net.invoker.securitydemo.Entity.SysUser;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by invoker on 2019-10-19
 * Description:
 */
@Service
public class SysUserService {
    @Autowired
    private SysUserMapper userMapper;

    public SysUser selectById(Integer id) {
        return userMapper.selectById(id);
    }

    public SysUser selectByName(String name) {
        return userMapper.selectByName(name);
    }

}
