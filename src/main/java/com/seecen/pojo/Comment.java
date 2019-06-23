package com.seecen.pojo;

import java.util.Date;

public class Comment {
    private Integer cmid;

    private String cmcontent;

    private Date cmtime;

    private Integer postsid;

    private Posts posts;

    public Posts getPosts() {
        return posts;
    }

    public void setPosts(Posts posts) {
        this.posts = posts;
    }



    public Integer getCmid() {
        return cmid;
    }

    public void setCmid(Integer cmid) {
        this.cmid = cmid;
    }

    public String getCmcontent() {
        return cmcontent;
    }

    public void setCmcontent(String cmcontent) {
        this.cmcontent = cmcontent == null ? null : cmcontent.trim();
    }

    public Date getCmtime() {
        return cmtime;
    }

    public void setCmtime(Date cmtime) {
        this.cmtime = cmtime;
    }

    public Integer getPostsid() {
        return postsid;
    }

    public void setPostsid(Integer postsid) {
        this.postsid = postsid;
    }
}