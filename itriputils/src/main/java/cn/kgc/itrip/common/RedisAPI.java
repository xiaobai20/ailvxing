package cn.kgc.itrip.common;

import com.sun.org.apache.xpath.internal.operations.Bool;
import org.springframework.stereotype.Component;
import redis.clients.jedis.Jedis;
import redis.clients.jedis.JedisPool;

import javax.annotation.Resource;

/**
 * Created by sam on 2018/4/20.
 */

public class RedisAPI {

    private JedisPool jedisPool;

    public RedisAPI(JedisPool jedisPool) {
        this.jedisPool = jedisPool;
    }

    /**
     * 以键值对的方式保存数据到redis
     *
     * @param key
     * @param value
     */
    public void set(String key, String value) {
        //获取连接
        Jedis jedis = jedisPool.getResource();
        try {
            String result = jedis.set(key, value);
            // 资源还回到连接池当中
            jedisPool.returnResource(jedis);
        } catch (Exception e) {
            e.printStackTrace();
            //销毁资源
            jedisPool.returnBrokenResource(jedis);
        }
    }


    /**
     * 以键值对的方式保存数据到redis
     *
     * @param key
     * @param value
     * @param expire 时间 单位[秒]
     */
    public void set(String key, String value, int expire) {
        //获取连接
        Jedis jedis = jedisPool.getResource();
        try {
            String result = jedis.setex(key, expire, value);
            // 资源还回到连接池当中
            jedisPool.returnResource(jedis);
        } catch (Exception e) {
            e.printStackTrace();
            //销毁资源
            jedisPool.returnBrokenResource(jedis);
        }
    }

    /**
     * 取值
     *
     * @param key
     */
    public String get(String key) {
        //获取连接
        Jedis jedis = jedisPool.getResource();
        try {
            String result = jedis.get(key);
            // 资源还回到连接池当中
            jedisPool.returnResource(jedis);
            return result;
        } catch (Exception e) {
            e.printStackTrace();
            //销毁资源
            jedisPool.returnBrokenResource(jedis);
            return null;
        }
    }


    /**
     * 获取剩余秒数
     *
     * @param key
     */
    public Long ttl(String key) {
        //获取连接
        Jedis jedis = jedisPool.getResource();
        try {
            Long result = jedis.ttl(key);
            // 资源还回到连接池当中
            jedisPool.returnResource(jedis);
            return result;
        } catch (Exception e) {
            e.printStackTrace();
            //销毁资源
            jedisPool.returnBrokenResource(jedis);
            return null;
        }
    }

    /**
     * 判断key是否存在
     *
     * @param key
     */
    public Boolean exists(String key) {
        //获取连接
        Jedis jedis = jedisPool.getResource();
        try {
            Boolean result = jedis.exists(key);
            // 资源还回到连接池当中
            jedisPool.returnResource(jedis);
            return result;
        } catch (Exception e) {
            e.printStackTrace();
            //销毁资源
            jedisPool.returnBrokenResource(jedis);
            return false;
        }
    }

    /**
     * 删除
     *
     * @param key
     */
    public Long del(String key) {
        //获取连接
        Jedis jedis = jedisPool.getResource();
        try {
            Long result = jedis.del(key);
            // 资源还回到连接池当中
            jedisPool.returnResource(jedis);
            return result;
        } catch (Exception e) {
            e.printStackTrace();
            //销毁资源
            jedisPool.returnBrokenResource(jedis);
            return null;
        }
    }
}
