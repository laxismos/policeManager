package net.base.open.mapper;

import java.util.Date;
import java.util.List;

import net.base.open.entity.Attendence;

public interface AttendenceMapper {
     public void addAttendence(Date Adate,String Aname,String Ainfo);

     public List<Attendence> getAttendences(Date s_Adate,Date e_Adate,String Aname,int offset,int limit);

     public void updateAttendence(Date Adate,String Aname,String Ainfo);

     public void deleteAttendence(Date Adate);
}
