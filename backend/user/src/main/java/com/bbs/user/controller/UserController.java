package com.bbs.user.controller;

import com.bbs.common.model.ApiResponse;
import com.bbs.user.model.User;
import com.bbs.user.service.UserService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.*;

import static com.bbs.common.constant.HeadConstant.APP_HEAD;

/**
 * @author: guangxush
 * @create: 2020/05/05
 */
@RestController
@Slf4j
public class UserController {

    @Autowired
    UserService userService;

    @Value("${app.header}")
    private String header;

    /**
     * 用户登录
     * @param sHead
     * @param user
     * @return
     */
    @RequestMapping(path = "/login", method = RequestMethod.POST)
    @ResponseBody
    public ApiResponse<Boolean> login(@RequestHeader(APP_HEAD) String sHead,
                                      @RequestBody User user){
        if(!sHead.equals(header)){
            return new ApiResponse<Boolean>().fail(false);
        }
        Boolean result = userService.login(user.getUid());
        if(result){
            return new ApiResponse<Boolean>().success(true);
        } else{
            return new ApiResponse<Boolean>().fail(false);
        }
    }

    /**
     * 用户注册
     * @param sHead
     * @param user
     * @return
     */
    @RequestMapping(path = "/register", method = RequestMethod.POST)
    @ResponseBody
    public ApiResponse<User> register(@RequestHeader(APP_HEAD) String sHead,
                                        @RequestBody User user){
        if(!sHead.equals(header)){
            return new ApiResponse<User>().fail(null);
        }
        User userVO = userService.register(user);
        if(userVO!=null){
            return new ApiResponse<User>().success(userVO);
        } else{
            return new ApiResponse<User>().fail(userVO);
        }
    }

    /**
     * 用户更新信息
     * @param sHead
     * @param user
     * @return
     */
    @RequestMapping(path = "/update", method = RequestMethod.POST)
    @ResponseBody
    public ApiResponse<User> update(@RequestHeader(APP_HEAD) String sHead,
                                      @RequestBody User user){
        if(!sHead.equals(header)){
            return new ApiResponse<User>().fail(null);
        }
        User userVO = userService.update(user);
        if(userVO!=null){
            return new ApiResponse<User>().success(userVO);
        } else{
            return new ApiResponse<User>().fail(userVO);
        }
    }
}
