package com.github.zackwoo.scaffolding.entity;

public class Bannerdata {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column BANNERDATA.FAVCATEGORY
     *
     * @mbg.generated Mon Apr 10 18:49:55 CST 2017
     */
    private String favcategory;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column BANNERDATA.BANNERNAME
     *
     * @mbg.generated Mon Apr 10 18:49:55 CST 2017
     */
    private String bannername;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column BANNERDATA.FAVCATEGORY
     *
     * @return the value of BANNERDATA.FAVCATEGORY
     *
     * @mbg.generated Mon Apr 10 18:49:55 CST 2017
     */
    public String getFavcategory() {
        return favcategory;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column BANNERDATA.FAVCATEGORY
     *
     * @param favcategory the value for BANNERDATA.FAVCATEGORY
     *
     * @mbg.generated Mon Apr 10 18:49:55 CST 2017
     */
    public void setFavcategory(String favcategory) {
        this.favcategory = favcategory == null ? null : favcategory.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column BANNERDATA.BANNERNAME
     *
     * @return the value of BANNERDATA.BANNERNAME
     *
     * @mbg.generated Mon Apr 10 18:49:55 CST 2017
     */
    public String getBannername() {
        return bannername;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column BANNERDATA.BANNERNAME
     *
     * @param bannername the value for BANNERDATA.BANNERNAME
     *
     * @mbg.generated Mon Apr 10 18:49:55 CST 2017
     */
    public void setBannername(String bannername) {
        this.bannername = bannername == null ? null : bannername.trim();
    }
}