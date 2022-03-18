package com.xtl.service;

import org.apache.ibatis.annotations.Param;

/**
 * @author 31925
 */
public interface StorageService {

    /**
     * 扣减库存
     * @param productId 产品id
     * @param count 数量
     */
    void decrease( Long productId, Integer count);

}
