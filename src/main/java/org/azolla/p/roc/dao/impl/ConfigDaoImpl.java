/*
 * @(#)ConfigDaoImpl.java		Created at 15/4/21
 * 
 * Copyright (c) azolla.org All rights reserved.
 * Azolla PROPRIETARY/CONFIDENTIAL. Use is subject to license terms. 
 */
package org.azolla.p.roc.dao.impl;

import org.apache.ibatis.session.RowBounds;
import org.apache.ibatis.session.SqlSession;
import org.azolla.p.roc.aware.CacheAware;
import org.azolla.p.roc.dao.IConfigDao;
import org.azolla.p.roc.vo.ConfigVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * The coder is very lazy, nothing to write for this class
 *
 * @author sk@azolla.org
 * @since ADK1.0
 */
@Repository
public class ConfigDaoImpl implements IConfigDao
{
    @Autowired
    private SqlSession sqlSession;

    @Autowired
    private CacheAware cacheAware;

    public List<ConfigVo> lstWithoutVOD(RowBounds rowBounds)
    {
        return sqlSession.selectList("mapper.config.lstWithoutVOD",null,rowBounds);
    }

    @Override
    public List<ConfigVo> lst()
    {
        return sqlSession.selectList("mapper.config.lst");
    }

    @Override
    public ConfigVo getByRocKey(String rocKey)
    {
        return sqlSession.selectOne("mapper.config.getByRocKey",rocKey);
    }

    public int add(ConfigVo configVo)
    {
        int rtn = sqlSession.insert("mapper.config.add",configVo);
        if(rtn > 0)
        {
            cacheAware.reload(CacheAware.CONFIG_CACHE);
        }
        return rtn;
    }

    public int mod(ConfigVo configVo)
    {
        int rtn = sqlSession.update("mapper.config.mod",configVo);
        if(rtn > 0)
        {
            cacheAware.reload(CacheAware.CONFIG_CACHE);
        }
        return rtn;
    }

    public int rmvById(int id)
    {
        int rtn = sqlSession.update("mapper.config.rmvById",id);
        if(rtn > 0)
        {
            cacheAware.reload(CacheAware.CONFIG_CACHE);
        }
        return rtn;
    }
}
