package cn.kgc.itrip.service;

import cn.kgc.itrip.model.ItripUser;

public interface TokenService {

    //构建
    public  String generateToken(ItripUser itripUser,String userAgent);

    public void saveToken(String token,ItripUser itripUser);
}
