package com.dagather.fonme.redis.service;

import java.io.Serializable;
import redis.clients.jedis.ShardedJedis;

public abstract interface IRedisService {
	public abstract ShardedJedis getShardedJedis();

	public abstract boolean returnResource(ShardedJedis paramShardedJedis);

	public abstract boolean setObjectKeyToRedis(String paramString, Serializable paramSerializable);

	public abstract boolean setObjectKeyToRedis(String paramString, Serializable paramSerializable, int paramInt);

	public abstract <T> T getObjectKeyToRedis(String paramString, Class<T> paramClass);

	public abstract boolean setStringKeyToRedis(String paramString1, String paramString2);

	public abstract boolean setStringKeyToRedis(String paramString1, String paramString2, int paramInt);

	public abstract String getStringKeyToRedis(String paramString);

	public abstract boolean keyExists(String paramString);

	public abstract Long expire(String paramString, int paramInt);

	public abstract Long incr(String paramString);

	public abstract Long incr(String paramString, int paramInt);

	public abstract Long dinc(String paramString);

	public abstract Long dinc(String paramString, int paramInt);

	public abstract boolean delKey(String paramString);

	public abstract Long rpush(String paramString1, String paramString2, int paramInt);

	public abstract <T> T lrang(String paramString, Long paramLong1, Long paramLong2, Class<T> paramClass);
}
