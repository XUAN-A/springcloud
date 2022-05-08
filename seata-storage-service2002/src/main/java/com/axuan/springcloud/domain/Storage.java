package com.axuan.springcloud.domain;

import lombok.Data;

/**
 * @author axuan
 * @date 2022/4/24 下午7:45
 */
@Data
public class Storage {

    private Long id;

    /**
     * 产品id
     */
    private Long productId;

    /**
     * 总库存
     */
    private Integer total;

    /**
     * 已用库存
     */
    private Integer used;

    /**
     * 剩余库存
     */
    private Integer residue;

}
