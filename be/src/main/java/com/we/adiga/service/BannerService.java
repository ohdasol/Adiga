package com.we.adiga.service;

import java.util.List; 

import com.we.adiga.model.dto.BannerDTO;

public interface BannerService {
    void insertBanner(BannerDTO bannerDTO);
    List<BannerDTO> findBanners();
}