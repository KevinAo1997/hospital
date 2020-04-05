package com.aokai.hospital.utils;

import com.aokai.hospital.model.dto.User;
import com.auth0.jwt.JWT;
import com.auth0.jwt.JWTVerifier;
import com.auth0.jwt.algorithms.Algorithm;
import com.auth0.jwt.interfaces.DecodedJWT;
import java.io.UnsupportedEncodingException;
import java.util.Date;

/**
 * Description :   .
 *
 * @author : aokai
 * @date : Created in 2020/4/5 17:52
 */
public class TokenUtil {

    /**
     * token过期时间
     */
    private static final long EXPIRE_TIME = 10*60*60*1000;

    /**
     * 密匙盐
     */
    private static final String TOKEN_SECRET = "txdy";


    /**
     * 签名生成
     * @param user
     * @return
     */
    public static String sign(User user) {
        String token = null;
        Date expiresAt = new Date(System.currentTimeMillis() + EXPIRE_TIME);
        try {
            token = JWT.create()
                    .withIssuer("auth0")
                    .withClaim("username", user.getUsername())
                    .withExpiresAt(expiresAt)
                    // 使用HMAC256加密算法
                    .sign(Algorithm.HMAC256(TOKEN_SECRET));
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        }
        return token;
    }

    /**
     * 签名验证
     * @param token
     * @return
     */
    public static boolean verify(String token){
        try {
            JWTVerifier verifier = JWT.require(Algorithm.HMAC256(TOKEN_SECRET)).withIssuer("auth0").build();
            DecodedJWT jwt = verifier.verify(token);
            System.out.println("认证通过：");
            System.out.println("username: " + jwt.getClaim("username").asString());
            System.out.println("过期时间：      " + jwt.getExpiresAt());
            return true;
        } catch (Exception e){
            return false;
        }
    }

}
