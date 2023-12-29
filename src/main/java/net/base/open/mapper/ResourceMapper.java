package net.base.open.mapper;

import java.util.List;

import net.base.open.entity.Resource;

public interface ResourceMapper {
    public void addResource(String Rno,String Rname,int Rnum,String Rindate,String Ruse);

    public List<Resource> getResource(String Rno,String Rname,int offset,int limit);

    public void updateResource(String Rno,String Rname,int Rnum);

    public void deleteResource(String Rno,String Rname);
}
