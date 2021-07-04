package com.sandwich.admin.controller;

import com.sandwich.admin.bean.AdRequest;
import com.sandwich.admin.domain.AdEntity;
import com.sandwich.admin.service.AdService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;

@RestController
@RequestMapping("/v1/ad")
public class AdController {

    @Autowired
    private AdService adService;

    /**
     * 查询
     *
     * @param pk
     */
    @GetMapping("/find")
    public ResponseEntity<?> find(@RequestHeader HttpHeaders headers,
                                  @RequestParam(name = "pk") long pk) {
        AdEntity adEntity = adService.find(pk);
        return new ResponseEntity<>(adEntity, HttpStatus.OK);
    }

    /**
     * 新增或编辑
     *
     * @param adRequest
     */
    @PostMapping("/save")
    public ResponseEntity<?> save(HttpServletRequest request, @RequestHeader HttpHeaders headers, @RequestBody AdRequest adRequest) {
        AdEntity adEntity = adService.save(adRequest);
        return new ResponseEntity<>(adEntity, HttpStatus.OK);
    }
}