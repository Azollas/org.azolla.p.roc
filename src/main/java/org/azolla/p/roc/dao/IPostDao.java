/*
 * @(#)IPostDao.java		Created at 15/4/21
 *
 * Copyright (c) azolla.org All rights reserved.
 * Azolla PROPRIETARY/CONFIDENTIAL. Use is subject to license terms.
 */
package org.azolla.p.roc.dao;

import org.apache.ibatis.session.RowBounds;
import org.azolla.p.roc.vo.PostVo;

import javax.annotation.Nonnull;
import java.util.List;

/**
 * The coder is very lazy, nothing to write for this class
 *
 * @author sk@azolla.org
 * @since ADK1.0
 */
public interface IPostDao
{
  public List<PostVo> lstByTagUrlName(String tagUrlName, RowBounds rowBounds);

  public List<PostVo> search(@Nonnull String search, @Nonnull RowBounds rowBounds);
}
