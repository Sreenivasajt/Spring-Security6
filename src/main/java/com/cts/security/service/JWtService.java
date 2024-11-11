package com.cts.security.service;

import com.cts.security.entity.User;
import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.io.Decoders;
import io.jsonwebtoken.security.Keys;
import org.springframework.stereotype.Service;

import javax.crypto.SecretKey;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

@Service
public class JWtService {

    private String secretKey=null;

    public String generateToken(User user) {

        Map<String, Object> claims = new HashMap<>();
       return Jwts
               .builder()
               .claims()
               .add(claims)
               .subject(user.getUserName())
               .issuer("DCB")
               .issuedAt(new Date(System.currentTimeMillis()))
               .expiration(new Date(System.currentTimeMillis()+60*10*1000))
               .and()
               .signWith(generateKey())
               .compact();

    }

    private SecretKey generateKey() {
        byte[] decode = Decoders.BASE64.decode(getSecretKey());
        return Keys.hmacShaKeyFor(decode);
    }

    public String getSecretKey(){
        return secretKey="9a4f2c8d3b7a1e6f45c8a0b3f267d8b1d4e6f3c8a9d2b5f8e3a9c8b5f6v8a3d9";
    }
}
