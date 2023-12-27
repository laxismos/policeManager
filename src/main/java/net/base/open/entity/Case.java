package net.base.open.entity;

import java.util.Date;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Setter
@Getter
@ToString
public class Case {
    private String Cname;
    private Date Cdate;
    private String Cinfo;
    private String Cresult;
    private String Cno;

    public Case(){
    }

    public Case(String Cno){
        this.Cno = Cno;
    }
}
