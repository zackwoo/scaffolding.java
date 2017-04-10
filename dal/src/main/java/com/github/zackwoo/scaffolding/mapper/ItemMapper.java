package com.github.zackwoo.scaffolding.mapper;

import com.github.zackwoo.scaffolding.entity.Item;
import com.github.zackwoo.scaffolding.entity.ItemExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ItemMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ITEM
     *
     * @mbg.generated Mon Apr 10 18:49:55 CST 2017
     */
    long countByExample(ItemExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ITEM
     *
     * @mbg.generated Mon Apr 10 18:49:55 CST 2017
     */
    int deleteByExample(ItemExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ITEM
     *
     * @mbg.generated Mon Apr 10 18:49:55 CST 2017
     */
    int deleteByPrimaryKey(String itemid);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ITEM
     *
     * @mbg.generated Mon Apr 10 18:49:55 CST 2017
     */
    int insert(Item record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ITEM
     *
     * @mbg.generated Mon Apr 10 18:49:55 CST 2017
     */
    int insertSelective(Item record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ITEM
     *
     * @mbg.generated Mon Apr 10 18:49:55 CST 2017
     */
    List<Item> selectByExample(ItemExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ITEM
     *
     * @mbg.generated Mon Apr 10 18:49:55 CST 2017
     */
    Item selectByPrimaryKey(String itemid);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ITEM
     *
     * @mbg.generated Mon Apr 10 18:49:55 CST 2017
     */
    int updateByExampleSelective(@Param("record") Item record, @Param("example") ItemExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ITEM
     *
     * @mbg.generated Mon Apr 10 18:49:55 CST 2017
     */
    int updateByExample(@Param("record") Item record, @Param("example") ItemExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ITEM
     *
     * @mbg.generated Mon Apr 10 18:49:55 CST 2017
     */
    int updateByPrimaryKeySelective(Item record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ITEM
     *
     * @mbg.generated Mon Apr 10 18:49:55 CST 2017
     */
    int updateByPrimaryKey(Item record);
}