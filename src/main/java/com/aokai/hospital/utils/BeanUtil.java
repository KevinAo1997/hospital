package com.aokai.hospital.utils;

import com.alibaba.fastjson.JSONObject;
import com.alibaba.fastjson.serializer.SerializerFeature;
import com.alibaba.fastjson.serializer.SimplePropertyPreFilter;
import java.util.List;
import java.util.stream.Collectors;
import org.springframework.beans.BeanUtils;

/**
 * Description :   .
 *
 * @author : aokai
 * @date : Created in 2020/4/9 18:57
 */
public class BeanUtil {

    public BeanUtil() {
    }

    public static <T> T copyPropertiesBySpring(Object source, Class<T> target) {
        if (source == null) {
            return null;
        } else {
            try {
                T t = target.newInstance();
                BeanUtils.copyProperties(source, t);
                return t;
            } catch (IllegalAccessException | InstantiationException var3) {
                return null;
            }
        }
    }

    public static <T> List<T> copyPropertiesBySpring(List<?> source, Class<T> target) {
        return source == null ? null : (List) source.stream().map((item) -> {
            return copyPropertiesBySpring(item, target);
        }).collect(Collectors.toList());
    }

    public static <T> T copyPropertiesBySpring(Object source, Class<T> target,
            String[] ignoreProperties) {
        if (source == null) {
            return null;
        } else {
            try {
                T t = target.newInstance();
                BeanUtils.copyProperties(source, t, ignoreProperties);
                return t;
            } catch (IllegalAccessException | InstantiationException var4) {
                return null;
            }
        }
    }

    public static <T> List<T> copyPropertiesBySpring(List<?> source, Class<T> target,
            String[] ignoreProperties) {
        return source == null ? null : (List) source.stream().map((item) -> {
            return copyPropertiesBySpring(item, target, ignoreProperties);
        }).collect(Collectors.toList());
    }

    public static <T> T copyPropertiesByFastJson(Object source, Class<T> target) {
        if (source == null) {
            return null;
        } else {
            String sourceStr = JSONObject.toJSONString(source);
            return JSONObject.parseObject(sourceStr, target);
        }
    }

    public static <T> T copyPropertiesByFastJson(Object source, Class<T> target,
            String[] ignoreProperties) {
        if (source == null) {
            return null;
        } else {
            SimplePropertyPreFilter filter = new SimplePropertyPreFilter(target, ignoreProperties);
            String sourceStr = JSONObject.toJSONString(source, filter, new SerializerFeature[0]);
            return JSONObject.parseObject(sourceStr, target);
        }
    }

    public static <T> List<T> copyPropertiesByFastJson(List<?> source, Class<T> target) {
        return source == null ? null : (List) source.stream().map((item) -> {
            return copyPropertiesByFastJson(item, target);
        }).collect(Collectors.toList());
    }

    public static <T> List<T> copyPropertiesByFastJson(List<?> source, Class<T> target,
            String[] ignoreProperties) {
        return source == null ? null : (List) source.stream().map((item) -> {
            return copyPropertiesByFastJson(item, target, ignoreProperties);
        }).collect(Collectors.toList());
    }
}

