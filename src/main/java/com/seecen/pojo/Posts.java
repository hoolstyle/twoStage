package com.seecen.pojo;

import com.alibaba.fastjson.annotation.JSONField;
import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;

public class Posts extends DateCondition{
    private Integer postsid;

    private String poststitle;

    private String postscontent;

    @JSONField(format = "yyyy-MM-dd HH:mm:ss")
    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private Date releasetime;

    private String picture;

    private Integer state;

    private Long likenumint;

    private Long postsheat;

    private Long commentid;

    private Integer poststype;

    private Integer userid;

    //用户评论数据
    private Comment comment;
    //用户表
    private User user;
    //帖子类型
    private PostType postType;

    public Comment getComment() {
        return comment;
    }

    public void setComment(Comment comment) {
        this.comment = comment;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public PostType getPostType() {
        return postType;
    }

    public void setPostType(PostType postType) {
        this.postType = postType;
    }

    public Integer getPostsid() {
        return postsid;
    }

    public void setPostsid(Integer postsid) {
        this.postsid = postsid;
    }

    public String getPoststitle() {
        return poststitle;
    }

    public void setPoststitle(String poststitle) {
        this.poststitle = poststitle == null ? null : poststitle.trim();
    }

    public String getPostscontent() {
        return postscontent;
    }

    public void setPostscontent(String postscontent) {
        this.postscontent = postscontent == null ? null : postscontent.trim();
    }

    public Date getReleasetime() {
        return releasetime;
    }

    public void setReleasetime(Date releasetime) {
        this.releasetime = releasetime;
    }

    public String getPicture() {
        return picture;
    }

    public void setPicture(String picture) {
        this.picture = picture == null ? null : picture.trim();
    }

    public Integer getState() {
        return state;
    }

    public void setState(Integer state) {
        this.state = state;
    }

    public Long getLikenumint() {
        return likenumint;
    }

    public void setLikenumint(Long likenumint) {
        this.likenumint = likenumint;
    }

    public Long getPostsheat() {
        return postsheat;
    }

    public void setPostsheat(Long postsheat) {
        this.postsheat = postsheat;
    }

    public Long getCommentid() {
        return commentid;
    }

    public void setCommentid(Long commentid) {
        this.commentid = commentid;
    }

    public Integer getPoststype() {
        return poststype;
    }

    public void setPoststype(Integer poststype) {
        this.poststype = poststype;
    }

    public Integer getUserid() {
        return userid;
    }

    public void setUserid(Integer userid) {
        this.userid = userid;
    }
}