package com.marvin.core.account.application.domain.transaction;

import lombok.EqualsAndHashCode;
import lombok.ToString;

@ToString
@EqualsAndHashCode
public class Category
{

    private Integer id;
    private String name;
    private CategoryType type;


    public Category(String name, CategoryType type)
    {
        this.name = name;
        this.type = type;
    }

    public Category()
    {
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

    public CategoryType getType()
    {
        return type;
    }

    public void setType(CategoryType type)
    {
        this.type = type;
    }
}

