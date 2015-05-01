/*
 * @(#)TagDaoImpl.java		Created at 15/4/22
 * 
 * Copyright (c) azolla.org All rights reserved.
 * Azolla PROPRIETARY/CONFIDENTIAL. Use is subject to license terms. 
 */
package org.azolla.p.roc.dao.impl;

import org.apache.ibatis.session.SqlSession;
import org.azolla.p.roc.dao.ITagDao;
import org.azolla.p.roc.vo.TagVo;
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
public class TagDaoImpl implements ITagDao
{
    @Autowired
    private SqlSession sqlSession;

    @Override
    public List<TagVo> lst()
    {
        return sqlSession.selectList("mapper.tag.lst");
    }

    @Override
    public List<TagVo> lstBpostUrlTitle(String postUrlTitle)
    {
        return sqlSession.selectList("mapper.tag.lstBpostUrlTitle", postUrlTitle);
    }

    @Override
    public TagVo get(String urlName)
    {
        return sqlSession.selectOne("mapper.tag.get",urlName);
    }
}