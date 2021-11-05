package com.blog.services;

import com.blog.repository.BlogsRepository;
import com.blog.repository.entity.Blogs;

import java.util.List;

public class BlogService{

    private BlogsRepository blogsRepository;

    public BlogService(){
        blogsRepository = new BlogsRepository();
    }

    public void created(Blogs blog) {
        blogsRepository.created(blog);
    }

    public void update(Blogs blog) {
        blogsRepository.update(blog);
    }

    public void remove(Blogs blog) {
        blogsRepository.remove(blog);
    }

    public Object SingleData(String ID) {
        Object blog = blogsRepository.SingleData(ID);
        if(blog == null){
            return null;
        }else{
            return blog;
        }
    }

    public List<Object> MultipleData() {
        return blogsRepository.MultipleData();
    }
}
