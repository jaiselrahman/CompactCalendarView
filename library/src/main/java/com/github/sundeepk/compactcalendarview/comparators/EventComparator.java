package com.github.sundeepk.compactcalendarview.comparators;

import com.github.sundeepk.compactcalendarview.domain.BaseEvent;

import java.util.Comparator;

public class EventComparator implements Comparator<BaseEvent> {

    @Override
    public int compare(BaseEvent lhs, BaseEvent rhs) {
        return lhs.getTimeInMillis() < rhs.getTimeInMillis() ? -1 : lhs.getTimeInMillis() == rhs.getTimeInMillis() ? 0 : 1;
    }
}
