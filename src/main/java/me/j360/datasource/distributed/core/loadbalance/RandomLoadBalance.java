package me.j360.datasource.distributed.core.loadbalance;

import java.util.List;
import java.util.concurrent.ThreadLocalRandom;

/**
 * Created with j360-datasource -> me.j360.datasource.distributed.core.shard.support
 * User: min_xu
 * Date: 2015/10/31
 * Time: 9:55
 * ˵����������ؾ����㷨
 */
public class RandomLoadBalance extends AbstractLoadBalance {

    @Override
    protected <S> S doSelect(List<S> shards, String seed) {
        return shards.get(ThreadLocalRandom.current().nextInt(shards.size()));
    }
}
