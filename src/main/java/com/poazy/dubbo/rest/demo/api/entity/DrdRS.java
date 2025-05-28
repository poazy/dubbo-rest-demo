package com.poazy.dubbo.rest.demo.api.entity;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.io.Serializable;

/**
 * @author duanbo
 * @date 2020/2/26
 */
@Data
@NoArgsConstructor
@ToString(callSuper = true)
@EqualsAndHashCode(callSuper = true)
public class DrdRS<T> extends DsRqRs<T> implements Serializable {
    private static final long serialVersionUID = 2386942403388144872L;

    protected Integer code;
    protected String msg;
    protected T data;

}
