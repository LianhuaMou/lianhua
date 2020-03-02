package com.start.dao.mapper;

import com.start.pojo.AccountPo;
import org.apache.ibatis.annotations.Param;

public interface AccountMapper {

    AccountPo queryAccount(@Param("userId") String userId);


}
