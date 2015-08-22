/*
 * @(#)ConfigMapper.java		Created at 15/8/21
 * 
 * Copyright (c) azolla.org All rights reserved.
 * Azolla PROPRIETARY/CONFIDENTIAL. Use is subject to license terms. 
 */
package org.azolla.p.roc.mapper;

import org.azolla.p.roc.vo.ConfigVo;
import org.springframework.stereotype.Repository;
import tk.mybatis.mapper.common.Mapper;

/**
 * The coder is very lazy, nothing to write for this class
 *
 * @author sk@azolla.org
 * @since ADK1.0
 */
@Repository
public interface ConfigMapper extends Mapper<ConfigVo>
{
}
