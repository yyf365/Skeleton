package com.nepxion.skeleton.entity;

/**
 * <p>Title: Nepxion Skeleton Generator</p>
 * <p>Description: Nepxion Skeleton Generator For Freemarker</p>
 * <p>Copyright: Copyright (c) 2017</p>
 * <p>Company: Nepxion</p>
 * @author Haojun Ren
 * @email 1394997@qq.com
 * @version 1.0
 */

public enum SkeletonGroupType {
    NORMAL_GROUP("NORMAL_GROUP"),
    CHECKBOX_GROUP("CHECKBOX_GROUP"),
    RADIO_GROUP("RADIO_GROUP");

    private String value;

    private SkeletonGroupType(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }

    public static SkeletonGroupType fromString(String value) {
        for (SkeletonGroupType type : SkeletonGroupType.values()) {
            if (type.getValue().equalsIgnoreCase(value.trim())) {
                return type;
            }
        }

        throw new IllegalArgumentException("Mismatched type with value=" + value);
    }

    @Override
    public String toString() {
        return value;
    }
}