package net.base.open.entity;

import java.util.Date;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Setter
@Getter
@ToString
public class Suspect {
    private String Sno;
    private String Sname;
    private String Sreason;
    private Date Sdate;
    private int Sstatus;

    public Suspect(){}

    public Suspect(String Sno){
        this.Sno = Sno;
    }
}
