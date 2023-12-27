package net.base.open.mapper;

import java.sql.Date;
import java.util.List;

import net.base.open.entity.Case;

public interface CaseMapper {
    public void addCase(String Cname,Date Cdate,String Cinfo,String Cresult,String Cno);

    public List<Case> getCases(String Cname,String Cresult,String Cno,int offset,int limit);
}
