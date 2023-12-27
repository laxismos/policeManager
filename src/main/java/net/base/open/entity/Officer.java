package net.base.open.entity;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class Officer {
    private String Ono;
    private String Oname;
    private String Osex;
    private String Oposition;
    private String Ophone;
    private String Oaddress;

    public Officer(){
    }

    public Officer(String Ono){
        this.Ono = Ono;
    }
}
