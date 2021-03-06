/*
 * @(#)IMapperDao.java		Created at 15/8/15
 *
 * Copyright (c) azolla.org All rights reserved.
 * Azolla PROPRIETARY/CONFIDENTIAL. Use is subject to license terms.
 */
package org.azolla.p.roc.dao;

import org.apache.ibatis.session.RowBounds;
import tk.mybatis.mapper.common.Mapper;

import javax.annotation.Nonnull;
import java.util.List;

/**
 * The coder is very lazy, nothing to write for this class
 *
 * @author sk@azolla.org
 * @since ADK1.0
 */
public interface IMapperDao<T>
{
  public int add(@Nonnull Class<? extends Mapper<T>> mapperClass, @Nonnull T t);

  public int rmv(@Nonnull Class<? extends Mapper<T>> mapperClass, @Nonnull T t);

  public int mod(@Nonnull Class<? extends Mapper<T>> mapperClass, @Nonnull T t);

  public List<T> lst(@Nonnull Class<? extends Mapper<T>> mapperClass, @Nonnull T t);

  public List<T> lst(@Nonnull Class<? extends Mapper<T>> mapperClass, @Nonnull T t, @Nonnull RowBounds rowBounds);

  public T selectOne(@Nonnull Class<? extends Mapper<T>> mapperClass, @Nonnull T t);
}
