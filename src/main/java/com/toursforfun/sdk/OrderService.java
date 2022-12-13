package com.toursforfun.sdk;

import cn.hutool.http.HttpUtil;

public class OrderService {

    public static String getOrderBasic(int order_id) {
        String url = getHost() + "/order/" + Integer.toString(order_id);
        return HttpUtil.get(url);
    }

    public static String getHost()
    {
        return "http://ordersvcs.services.qa1.tff.bz";
    }
}
