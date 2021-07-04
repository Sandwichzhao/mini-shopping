package com.sandwich.admin.service.impl;

import com.sandwich.admin.bean.AdRequest;
import com.sandwich.admin.domain.AdEntity;
import com.sandwich.admin.repository.AdRepository;
import com.sandwich.admin.service.AdService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AdServiceImpl implements AdService {

    @Autowired
    private AdRepository adRepository;

    /**
     * 查询
     * @param pk
     */
    public AdEntity find(long pk) {
        return adRepository.findById(pk).get();
    }

    /**
     * 新增或编辑
     * @param adRequest
     */
    public AdEntity save(AdRequest adRequest) {
        AdEntity adEntity = new AdEntity();
        adEntity.setId(adRequest.getId());
        adEntity.setLinkType(adRequest.getLinkType());
        adEntity.setLink(adRequest.getLink());
        adEntity.setGoodsId(adRequest.getGoodsId());
        adEntity.setImageUrl(adRequest.getImageUrl());
        adEntity.setEndTime(adRequest.getEndTime());
        adEntity.setEnabled(adRequest.getEnabled());
        adEntity.setSortOrder(adRequest.getSortOrder());
        adEntity.setIsDelete(adRequest.getIsDelete());
        adRepository.save(adEntity);
        return adEntity;
    }
}
