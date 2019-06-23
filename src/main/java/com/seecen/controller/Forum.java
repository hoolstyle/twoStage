package com.seecen.controller;

import com.seecen.pojo.Page;
import com.seecen.pojo.PostType;
import com.seecen.pojo.Posts;
import com.seecen.pojo.State;
import com.seecen.service.*;
import javafx.geometry.Pos;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @Author 山泊树
 * @create 2019/6/16 15:32
 */

@Controller
public class Forum {

    @Autowired
    private PostsService postsService;

    @Autowired
    private CommentService commentService;

    @Autowired
    private PostTypeService postTypeService;

    @Autowired
    private StateService stateService;

    @RequestMapping("portal")
    public String Portal(){
        return "index";
    }

    @RequestMapping("/list")
    public String list(Model model, Posts posts, Integer pageNum){
        Page<Posts> page = postsService.findPostsByPage(posts, pageNum);
        model.addAttribute("p",page);
        return "backend/comment/home";
    }
    @ResponseBody
    @RequestMapping("/delAll")
    public String delAll(@RequestBody List<Integer> ids){
        if (commentService.reDel(ids)>0){}
            if (postsService.delAll(ids)>0){
                return "1";
            }
        return "0";
    }
    //根据ID异步删除
    @ResponseBody
    @RequestMapping("del/{id}")//del?uid=111
    public String del(@PathVariable("id") Integer id){
        if (commentService.del(id)){}//先删除评论
            if (postsService.delById(id)){
                return "1";
            }

        return "0";
    }


    //管理员增加帖子
    @RequestMapping("addPost")
    public String addTieZi(Model model){
        List<PostType> list = postTypeService.selects();
        model.addAttribute("selects",list);
        return "backend/comment/add";
    }

    //管理员提交帖子
    @ResponseBody
    @RequestMapping("subPost")
    public String subPost(Posts posts){
        if (postsService.insertPost(posts)){
            return "1";
        }
        return "0";
    }

    //管理员修改
    @RequestMapping("upDate")
    public String modification(Integer id, Model model){
        List<State> sta = stateService.findState();
       List<PostType> poty = postTypeService.selects();
       Posts posts = postsService.selectDetail(id);
       model.addAttribute("poty",poty);
       model.addAttribute("uppo",posts);
       model.addAttribute("sta",sta);
        return "backend/comment/edit";
    }
    //管理员提交修改
    @ResponseBody
    @RequestMapping("ups")
    public String upDateSuccess(@RequestBody Posts posts){
        if (postsService.updatePost(posts)){
            return "1";
        }
        return "0";
    }

}
