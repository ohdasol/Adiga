package com.we.adiga.service;

import java.util.List;
import java.util.stream.Collectors;

import com.we.adiga.model.dto.BannerDTO;
import com.we.adiga.model.entity.Banner;
import com.we.adiga.repository.BannerRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BannerServiceImpl implements BannerService {

    @Autowired
    private BannerRepository bannerRepository;
    
    @Override
    public void insertBanner(BannerDTO bannerDTO) {
        
        Banner banner = bannerRepository.findByPlaceAddr(bannerDTO.getPlaceAddr());
            
            Banner b = new Banner();

            // DB에 존재하면 조회수 +1 / 존재하지 않으면 새로 추가하고 조회수 +1
            if(banner == null) {
                b.setId(bannerDTO.getId());
                b.setPlaceName(bannerDTO.getPlaceName());
                b.setPlaceAddr(bannerDTO.getPlaceAddr());
                b.setPlaceTel(bannerDTO.getPlaceTel());
                b.setPlaceClosedate(bannerDTO.getPlaceClosedate());
                b.setCount(1);
                bannerRepository.save(b);
            } else {
                banner.setCount(banner.getCount() + 1);
                bannerRepository.save(banner);
            }
    }

    @Override
    public List<BannerDTO> findBanners() {
        List<Banner> list = bannerRepository.findTop3ByOrderByCountDesc();

        List<BannerDTO> result = list.stream().map(r -> new BannerDTO(r)).collect(Collectors.toList());
        return result;
    }
}
