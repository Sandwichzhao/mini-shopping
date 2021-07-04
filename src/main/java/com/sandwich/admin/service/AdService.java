package com.sandwich.admin.service;

import com.sandwich.admin.bean.AdRequest;
import com.sandwich.admin.domain.AdEntity;

public interface AdService {
    AdEntity find(long pk);

    AdEntity save(AdRequest adRequest);
}
