package com.llzzcc.eduservice.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import java.util.Date;
import com.baomidou.mybatisplus.annotation.TableId;
import java.io.Serializable;
import java.util.List;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

/**
 * <p>
 * 
 * </p>
 *
 * @author llzzcc
 * @since 2021-05-07
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
@ApiModel(value="ConfigGrandUser对象", description="")
public class ConfigGrandUser implements Serializable {

    private static final long serialVersionUID = 1L;

    private Integer userId;

    private String userName;

    private String userInfo;

    private Integer userDeptId;

    private String userDeptName;

    private String userPasswd;

    private List<Integer> userSourceArray;

    private List<Integer> userPageArray;

    private List<Integer> userModelArray;

    private String userColsJson;

    private String tagIsDeleted;

    private Date tagCreateTime;

    private Date tagModifiedTime;


}
