package net.base.open.entity;

import java.util.Date;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Setter
@Getter
@ToString
public class Resource {
    private String Rno;
    private String Rname;
    private int Rnum;
    private Date Rindate;
    private String Rues;

    public Resource(){}

    public Resource(String Rno){
        this.Rno = Rno;
    }
}
