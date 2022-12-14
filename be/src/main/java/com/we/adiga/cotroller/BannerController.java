package com.we.adiga.controller;

import java.util.List;

import com.we.adiga.model.dto.BannerDTO;
import com.we.adiga.service.BannerService;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin(origins="*")
@RestController
@RequestMapping("/letsgo/banner")
public class BannerController {

    private final BannerService bannerService;

    public BannerController(BannerService bannerService) {
        this.bannerService = bannerService;
    }

    @PostMapping()
    public void insertBanner(@RequestBody BannerDTO bannerDTO) {
        bannerService.insertBanner(bannerDTO);
    }

    @GetMapping()
    public List<BannerDTO> findBanners() {
        return bannerService.findBanners();
    }

}