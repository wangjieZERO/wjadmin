package com.wangjie.mapper;

import com.wangjie.model.Test;
import org.apache.ibatis.annotations.Mapper;

public interface TestMapper {

   Test selectTestByPrimaryKey(Integer id);
}
