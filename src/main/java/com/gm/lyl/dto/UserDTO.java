package com.gm.lyl.dto;

import com.gm.lyl.dto.base.OutputConverter;
import com.gm.lyl.entity.AdminRole;
import com.gm.lyl.entity.User;
import lombok.Data;
import lombok.ToString;

import java.util.List;

/**
 * @author Evan
 * @date 2020/4/1 19:57
 */
@Data
@ToString
public class UserDTO implements OutputConverter<UserDTO, User> {

    private int id;

    private String username;

    private String name;

    private String phone;

    private String email;

    private boolean enabled;

    private List<AdminRole> roles;

}
