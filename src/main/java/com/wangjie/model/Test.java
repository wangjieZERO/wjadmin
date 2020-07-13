package com.wangjie.model;

import com.wangjie.common.BaseEntity;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;
import java.sql.Timestamp;


@Getter
@Setter
public class Test extends BaseEntity implements Serializable {

    private String name;

    private Timestamp time;

}
