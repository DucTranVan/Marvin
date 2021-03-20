package com.marvin.core.account.application.domain.transaction;

import lombok.ToString;

@ToString
public class Tag
{

    private Integer id;
    private String name;

    public Tag()
    {
    }

    public Tag(String name)
    {
        this.name = name;
    }

    public Integer getId()
    {
        return id;
    }

    public void setId(Integer id)
    {
        this.id = id;
    }

    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }


}
