package net.base.open.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import net.base.open.entity.Officer;

@Mapper
public interface OfficerMapper {
    /**
     * 添加警员的接口
     * @param Ono 警员编号，即警号
     * @param Oname 警员名称
     * @param Osex 警员性别
     * @param Oposition 警员职位
     * @param Ophone 警员号码
     * @param Oaddress 警员住址
     */
    public void addOfficer(String Ono,String Oname,String Osex,String Oposition,String Ophone,String Oaddress);

    /**
     * 获取警员的接口，若对参数置null则表示忽略该参数进行查找
     * @param Ono 警号
     * @param Oname 警员姓名
     * @param Osex 警员性别
     * @param Oposition 警员职位
     * @param offset 起始查询数
     * @param limit 限制查询数
     * @return 查询的结果列表
     */
    public List<Officer> getOfficers(String Ono,String Oname,String Osex,String Oposition,int offset,int limit);

    /**
     * 删除一个警员的信息，可以使用警号或警察姓名做索引，两个索引只能使用其一
     * @param Ono 使用警号为索引
     * @param Oname 使用名称为索引，则 Ono 需置为 null
     */
    public void deleteOfficer(String Ono,String Oname);

    /**
     * 更新一个警员的信息，以Ono为索引，若想保持某项值不变，直接置为null
     * @param Ono
     * @param Oname
     * @param Oposition
     * @param Ophone
     * @param Oaddress
     */
    public void updateOfficer(String Ono,String Oname,String Oposition,String Ophone,String Oaddress);
}
