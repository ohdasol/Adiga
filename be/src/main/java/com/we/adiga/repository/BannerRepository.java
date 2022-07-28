package com.we.adiga.repository;

import java.util.List;

import com.we.adiga.model.entity.Banner;

import org.springframework.data.jpa.repository.JpaRepository;

public interface BannerRepository extends JpaRepository<Banner, Long> {
    Banner findByPlaceAddr(String placeAddr);
    List<Banner> findTop3ByOrderByCountDesc();
}