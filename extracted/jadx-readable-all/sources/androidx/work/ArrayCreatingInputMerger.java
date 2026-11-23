package androidx.work;

import java.lang.reflect.Array;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import p636z0.p709j0.Data;
import p636z0.p709j0.InputMerger;

/* JADX INFO: loaded from: classes.dex */
public final class ArrayCreatingInputMerger extends InputMerger {
    @Override // p636z0.p709j0.InputMerger
    /* JADX INFO: renamed from: a */
    public Data mo938a(List<Data> list) {
        Object objNewInstance;
        Data.a aVar = new Data.a();
        HashMap map = new HashMap();
        Iterator<Data> it = list.iterator();
        while (it.hasNext()) {
            for (Map.Entry entry : Collections.unmodifiableMap(it.next().f37260c).entrySet()) {
                String str = (String) entry.getKey();
                Object value = entry.getValue();
                Class<?> cls = value.getClass();
                Object obj = map.get(str);
                if (obj != null) {
                    Class<?> cls2 = obj.getClass();
                    if (cls2.equals(cls)) {
                        if (cls2.isArray()) {
                            int length = Array.getLength(obj);
                            int length2 = Array.getLength(value);
                            Object objNewInstance2 = Array.newInstance(obj.getClass().getComponentType(), length + length2);
                            System.arraycopy(obj, 0, objNewInstance2, 0, length);
                            System.arraycopy(value, 0, objNewInstance2, length, length2);
                            value = objNewInstance2;
                        } else {
                            objNewInstance = Array.newInstance(obj.getClass(), 2);
                            Array.set(objNewInstance, 0, obj);
                            Array.set(objNewInstance, 1, value);
                            value = objNewInstance;
                        }
                    } else if (cls2.isArray() && cls2.getComponentType().equals(cls)) {
                        value = m939b(obj, value);
                    } else {
                        if (!cls.isArray() || !cls.getComponentType().equals(cls2)) {
                            throw new IllegalArgumentException();
                        }
                        value = m939b(value, obj);
                    }
                } else if (!cls.isArray()) {
                    objNewInstance = Array.newInstance(value.getClass(), 1);
                    Array.set(objNewInstance, 0, value);
                    value = objNewInstance;
                }
                map.put(str, value);
            }
        }
        aVar.m15882b(map);
        return aVar.m15881a();
    }

    /* JADX INFO: renamed from: b */
    public final Object m939b(Object obj, Object obj2) {
        int length = Array.getLength(obj);
        Object objNewInstance = Array.newInstance(obj2.getClass(), length + 1);
        System.arraycopy(obj, 0, objNewInstance, 0, length);
        Array.set(objNewInstance, length, obj2);
        return objNewInstance;
    }
}
