package com.sandwich.admin.bean;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class AdRequest {
    private long id;
    private int linkType;
    private String link;
    private long goodsId;
    private String imageUrl;
    private long endTime;
    private int enabled;
    private int sortOrder;
    private int isDelete;
}
