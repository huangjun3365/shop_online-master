package com.soft2242.shop.service;

import com.soft2242.shop.entity.IndexRecommend;
import com.baomidou.mybatisplus.extension.service.IService;
import com.soft2242.shop.vo.IndexRecommendVO;

import java.util.List;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author huangJun3365
 * @since 2023-11-09
 */
public interface IndexRecommendService extends IService<IndexRecommend> {

    List<IndexRecommendVO> getList();
}
