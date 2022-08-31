package com.lucian.controller;



import com.baomidou.mybatisplus.core.metadata.IPage;
import com.lucian.annotation.Log;
import com.lucian.manager.PostManager;
import com.lucian.result.CommonResult;
import com.lucian.result.ResultCode;
import com.lucian.vo.PostIndexVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;


/**
 * @author lingxiangdeng
 */
@RestController
@RequestMapping
public class PostController {

    PostManager postManager;

    @Autowired
    public void setPostManager(PostManager postManager) {
        this.postManager = postManager;
    }

    ///**
    // * 检索
    // * @param postQuery 检索条件数据
    // * @return 检索后的数据
    // */
    //@Log(title = "检索文章")
    //@PostMapping("posts")
    //public CommonResult<IPage<PostIndexVO>> search(@RequestBody PostQuery postQuery){
    //    IPage<PostIndexVO> iPage = postManager.queryListByPage(postQuery);
    //    return CommonResult.successNoMessage(iPage);
    //}
    //
    /**
     * 一览
     * @return 一览数据
     */
    @Log(title = "文章一览")
    @GetMapping("posts")
    public String index(){
        //IPage<PostIndexVO> iPage = postManager.queryListByPage(null);
        //return CommonResult.successNoMessage(iPage);
        return "post success";
    }
    //
    ///**
    // * 创建
    // * @param postParam post表单数据
    // * @return 是否添加成功
    // */
    //@Log(title = "创建文章")
    //@PostMapping("post")
    //public CommonResult<String> create(@Valid @RequestBody PostParam postParam){
    //    return postManager.insert(postParam) ? CommonResult.success(null, "添加成功"): CommonResult.failed("添加失败");
    //}
    //
    ///**
    // * 编辑
    // * @param id blog id
    // * @return 博客详情数据
    // */
    //@Log(title = "编辑文章")
    //@GetMapping("post/{id}")
    //public CommonResult<PostFormVO> edit(@PathVariable String id){
    //    PostFormVO postFormVO = postManager.postDetail(id);
    //    if (postFormVO == null) {
    //        return CommonResult.failed(ResultCode.FIND_FAILED);
    //    }
    //    return CommonResult.successNoMessage(postFormVO);
    //}
    //
    ///**
    // * 更新
    // * @param id blog id
    // * @param postParam 表单数据
    // * @return 是否更新成功
    // */
    //@Log(title = "更新文章")
    //@PutMapping("post/{id}")
    //public CommonResult<String> update(@PathVariable String id, @Valid @RequestBody PostParam postParam){
    //    return postManager.update(id, postParam) ? CommonResult.success(null, "修改成功"): CommonResult.failed("修改失败");
    //}
    //
    ///**
    // * 删除文章
    // * @param id blog id
    // * @return 是否删除成功
    // */
    //@Log(title = "删除文章")
    //@DeleteMapping("post/{id}")
    //public CommonResult<String> delete(@PathVariable String id) {
    //    return postManager.deletePost(id) ? CommonResult.success(null, "删除成功") : CommonResult.failed("删除失败");
    //}
}
