package com.blog.repository;

import com.blog.repository.entity.Blogs;
import com.blog.unitlity.ICRUD;
import com.blog.unitlity.StaticDatas;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class BlogsRepository implements ICRUD {

    @Override
    public void created(Object o) {
        StaticDatas.BlogDatas.add((Blogs)o);
    }

    @Override
    public void update(Object o) {
        Blogs blogID = (Blogs)o;
        Optional<Blogs> blog = StaticDatas.BlogDatas.stream().filter(x->x.getID().equals(blogID.getID())).findFirst();
        if(blog.isPresent()){
            // BLOG GÜNCELLENDİ
        }else{
            // ÇIKIŞ
        }
    }

    @Override
    public void remove(Object o) {
        StaticDatas.BlogDatas.remove((Blogs) o);
    }

    @Override
    public Object SingleData(String ID) {
        Optional<Blogs> blog = StaticDatas.BlogDatas.stream().filter(x->x.getID().equals(ID)).findFirst();
        if(blog.isPresent()){
            return blog.get();
        }else{
            return null;
        }
    }

    @Override
    public List<Object> MultipleData() {
        List<Object> BlogsResults = new ArrayList<Object>();
        for(Blogs blog : StaticDatas.BlogDatas){
            BlogsResults.add(blog);
        }
        return BlogsResults;
    }
}










