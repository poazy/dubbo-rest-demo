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
public class DrdRQ<T> extends DsRqRs<T> implements Serializable {
    private static final long serialVersionUID = 555717785167986683L;

    protected T data;

}
