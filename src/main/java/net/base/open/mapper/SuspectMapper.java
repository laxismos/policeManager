package net.base.open.mapper;

import java.util.Date;
import java.util.List;

import net.base.open.entity.Suspect;

public interface SuspectMapper {
    public void addSuspect(String Sno,String Sname,String Srseason,Date Stime);

    public List<Suspect> getSuspects(String Sno,String Sname,int offset,int limit);

    public void updateSuspect(String Sno,String Sname,String Sreason,String Stime,Integer Sstatus);

    public void deleteSuspect(String Sno,String Sname);
}
