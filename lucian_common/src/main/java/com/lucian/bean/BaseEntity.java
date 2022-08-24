package com.lucian.bean;

import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;
import java.util.Date;

/**
 * @author denglingxiang
 * @date 2022/08/24 10:08
 **/
@Getter
@Setter
public class BaseEntity implements Serializable {
    private String id;

    private Date createdAt;

    private Date updatedAt;

    private Date deletedAt;
}
