package me.j360.datasource.distributed.core.loadbalance;

import java.util.List;

/**
 * Created with j360-datasource -> me.j360.datasource.distributed.core.shard.support
 * User: min_xu
 * Date: 2015/10/31
 * Time: 9:55
 * ˵�������ؾ���ӿ���
 */

public interface LoadBalance {

    public <S> S select( List<S> shards, String seed);

}
