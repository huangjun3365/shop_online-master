package com.soft2242.shop.service;

import com.soft2242.shop.entity.IndexCarousel;
import com.baomidou.mybatisplus.extension.service.IService;

import java.util.List;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author huangJun3365
 * @since 2023-11-09
 */
public interface IndexCarouselService extends IService<IndexCarousel> {

    List<IndexCarousel> getList(Integer distributionSite);
}
