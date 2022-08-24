package com.lucian.bean;

import com.baomidou.mybatisplus.annotation.TableName;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

/**
 * @author denglingxiang
 * @date 2022/08/23 08:50
 **/
@TableName(value = "posts")
@Getter
@Setter
@EqualsAndHashCode(callSuper = true)
public class Post extends BaseEntity{

    /**
     * 序列化id
     */
    private final long serialVersionUID = -7903161777677765181L;

    /**
     *  大标题
     */
    private String title;
    /**
     * 描述
     */
    private String description;
    /**
     * 内容
     */
    private String content;
    /**
     * 浏览数
     */
    private Integer viewCount;
    /**
     * 点赞数
     */
    private Integer likes;
    /**
     * 排序
     */
    private Integer sort;
    /**
     * 作者id
     */
    private String userId;
    /**
     * 封面id
     */
    private String uploadFileId;
}
