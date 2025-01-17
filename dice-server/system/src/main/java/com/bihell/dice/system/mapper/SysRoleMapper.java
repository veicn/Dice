package com.bihell.dice.system.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.bihell.dice.system.entity.SysRole;
import com.bihell.dice.system.param.sysrole.SysRolePageParam;
import com.bihell.dice.system.vo.SysRoleQueryVo;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.io.Serializable;

/**
 * <pre>
 * 系统角色 Mapper 接口
 * </pre>
 *
 * @author geekidea
 * @since 2019-10-24
 */
@Repository
public interface SysRoleMapper extends BaseMapper<SysRole> {

    /**
     * 根据ID获取查询对象
     *
     * @param id
     * @return
     */
    SysRoleQueryVo getSysRoleById(Serializable id);

    /**
     * 获取分页对象
     *
     * @param page
     * @param sysRolePageParam
     * @return
     */
    IPage<SysRoleQueryVo> getSysRolePageList(@Param("page") Page page, @Param("param") SysRolePageParam sysRolePageParam);

}
