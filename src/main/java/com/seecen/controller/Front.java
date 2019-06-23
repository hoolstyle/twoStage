package com.seecen.controller;

import com.alibaba.fastjson.annotation.JSONField;
import com.seecen.pojo.Comment;
import com.seecen.pojo.Page;
import com.seecen.pojo.PostType;
import com.seecen.pojo.Posts;
import com.seecen.service.*;
import org.apache.commons.io.FilenameUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.multipart.MultipartHttpServletRequest;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import java.io.File;
import java.io.IOException;
import java.util.Iterator;
import java.util.List;
import java.util.UUID;

/**
 * @Author 山泊树
 * @create 2019/6/17 16:44
 */
@Controller
public class Front {

    @Autowired
    private PostsService postsService;

    @Autowired
    private PostsInfoService postsInfoService;

    @Autowired
    private PostTypeService postTypeService;

    @Autowired
    private CommentService commentService;

    @Autowired
    private CommentInfoService commentInfoService;


    @RequestMapping("fronts")
    public String indexs(Model model, Posts posts, Integer pageNum) {
        List<Posts> list = postsInfoService.findPostsByHost();
        Page<Posts> page = postsService.findPostsByPageFronts(posts, pageNum);
       /* List<Posts> posts1 = postsInfoService.selectCountComment(posts);*/
        model.addAttribute("li", list);
        model.addAttribute("p", page);
        /*model.addAttribute("cout",posts1);*/
        return "/frontend/comment/home";
    }

    //前端热议模板的请求
    @RequestMapping("hotPost")
    public String hotPost(Model model, Integer id) {
        return "";
    }

    @RequestMapping("frontsR")
    public String add(Model model) {
        List<PostType> list = postTypeService.selects();
        model.addAttribute("selects", list);
        return "frontend/comment/add";
    }
    @ResponseBody
    @RequestMapping("frontsWs/{id}")
    public String write( @PathVariable("id") Integer id) {
            Posts posts = postsService.selectHuiFu(id);
            if (postsService.updateHuiFu(posts)){
                return "1";
            }
            return "0";
        }



    @RequestMapping("frontsW")
    public String write(@RequestParam(value = "fmg",
            required = false, defaultValue = "默认值") Integer id,Model model) {
        Posts posts = postsService.selectDetail(id);
        List<Comment> list = commentInfoService.selectNew(id);
        List<Posts> list1 = postsInfoService.findPostsByHost();
        posts.setPostsheat(posts.getPostsheat() + 1);
        model.addAttribute("pos", posts);
        model.addAttribute("lis", list);
        model.addAttribute("li", list1);
        return "frontend/comment/detail";
    }

    //发布评论
    @RequestMapping(value = "reply", method = RequestMethod.POST)
    public String writeBack(Comment comment, Model model) {
        if (commentService.replys(comment)) {
            return "redirect:/frontsW?fmg=" + comment.getPostsid();
        }
        return "redirect:/frontsW?fmg=" + comment.getPostsid();
    }

    //发布帖子
    @RequestMapping(value = "issue", method = RequestMethod.POST)
    public String writepost(Posts posts) {
        if (postsService.insertPost(posts)) {
            return "redirect:/fronts.spring";
        }
        return "redirect:/frontsR";
    }

    //先把图片上传到服务器，把路径也要放在数据库
    @ResponseBody
    @RequestMapping("/upload")
    public Posts insertPictrue( Posts posts, HttpServletRequest request) throws IOException {
        MultipartHttpServletRequest multRequest = (MultipartHttpServletRequest) request;
        Iterator<String> it = multRequest.getFileNames();
        //定义序号     int count = 1;
        //当前项目路径（存储图片的文件夹）
        String path = request.getSession().getServletContext().getRealPath("/images");
        File fileUrl = new File(path);
        //如果当前项目里不存在images文件夹，就创建
        if (!fileUrl.exists()) {
            fileUrl.mkdir();
        }
        while (it.hasNext()){
                //生成一个唯一标识符给图片命名，避免图片名重复，覆盖原有图片            
                String name = UUID.randomUUID().toString().replaceAll("-", "");
                // 文件的扩展名
            MultipartFile file = multRequest.getFile(it.next());
                //img.getOriginalFilename() 是上传图片的原始名字
                String ext = FilenameUtils.getExtension(file.getOriginalFilename());
                //transferTo()方法将上传的文件写到服务器指定的文件
            file.transferTo(new File(path + "/" + name + "." + ext));
                // 存到数据库的路径（相对路径）
            String url = "images/" + name + "." + ext;
            posts.setPicture(url);
//            count++;
        }
            return posts;

    }


}
