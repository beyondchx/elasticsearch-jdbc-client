package com.qingqing.search.client.handler.date;

import com.qingqing.search.client.handler.DateAbstractTypeHandler;

/**
 * Created by yaoqijun on 2016/11/14.
 */
public class YearMonthDateTypeHandler extends DateAbstractTypeHandler{
    @Override
    public String getDateFormat() {
        return "yyyy-MM";
    }
}
