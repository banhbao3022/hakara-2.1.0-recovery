package p477d1.p493x.p495c;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import p007c.p071d.p078c.p079a.outline;
import p007c.p451o.p452a.C5729a;
import p477d1.Function2;
import p477d1.Tuples;
import p477d1.p479b0.KClass;
import p477d1.p481d0.Strings5;
import p477d1.p483s.Collections2;
import p477d1.p483s.Iterables2;
import p477d1.p483s.Maps6;
import p477d1.p483s.Maps7;
import p477d1.p483s.MapsJVM;
import p477d1.p493x.p494b.InterfaceC6153a;
import p477d1.p493x.p494b.InterfaceC6154b;
import p477d1.p493x.p494b.InterfaceC6155c;
import p477d1.p493x.p494b.InterfaceC6156d;
import p477d1.p493x.p494b.InterfaceC6157e;
import p477d1.p493x.p494b.InterfaceC6158f;
import p477d1.p493x.p494b.InterfaceC6159g;
import p477d1.p493x.p494b.InterfaceC6160h;
import p477d1.p493x.p494b.InterfaceC6161i;
import p477d1.p493x.p494b.InterfaceC6162j;
import p477d1.p493x.p494b.InterfaceC6163k;
import p477d1.p493x.p494b.InterfaceC6164l;
import p477d1.p493x.p494b.InterfaceC6165m;
import p477d1.p493x.p494b.InterfaceC6166n;
import p477d1.p493x.p494b.InterfaceC6167o;
import p477d1.p493x.p494b.InterfaceC6168p;
import p477d1.p493x.p494b.InterfaceC6169q;
import p477d1.p493x.p494b.InterfaceC6170r;
import p477d1.p493x.p494b.InterfaceC6171s;
import p477d1.p493x.p494b.InterfaceC6172t;
import p477d1.p493x.p494b.InterfaceC6173u;
import p477d1.p493x.p494b.InterfaceC6174v;
import p477d1.p493x.p494b.InterfaceC6175w;

/* JADX INFO: renamed from: d1.x.c.d, reason: use source file name */
/* JADX INFO: compiled from: ClassReference.kt */
/* JADX INFO: loaded from: classes.dex */
public final class ClassReference implements KClass<Object>, ClassBasedDeclarationContainer {

    /* JADX INFO: renamed from: a */
    public static final Map<Class<? extends Function2<?>>, Integer> f29591a;

    /* JADX INFO: renamed from: b */
    public static final HashMap<String, String> f29592b;

    /* JADX INFO: renamed from: c */
    public static final HashMap<String, String> f29593c;

    /* JADX INFO: renamed from: d */
    public static final HashMap<String, String> f29594d;

    /* JADX INFO: renamed from: e */
    public static final a f29595e = new a(null);

    /* JADX INFO: renamed from: f */
    public final Class<?> f29596f;

    /* JADX INFO: renamed from: d1.x.c.d$a */
    /* JADX INFO: compiled from: ClassReference.kt */
    public static final class a {
        public a() {
        }

        public a(DefaultConstructorMarker defaultConstructorMarker) {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    static {
        Map<Class<? extends Function2<?>>, Integer> mapSingletonMap;
        List listM13038c = Collections2.m13038c(InterfaceC6153a.class, InterfaceC6164l.class, InterfaceC6168p.class, InterfaceC6169q.class, InterfaceC6170r.class, InterfaceC6171s.class, InterfaceC6172t.class, InterfaceC6173u.class, InterfaceC6174v.class, InterfaceC6175w.class, InterfaceC6154b.class, InterfaceC6155c.class, InterfaceC6156d.class, InterfaceC6157e.class, InterfaceC6158f.class, InterfaceC6159g.class, InterfaceC6160h.class, InterfaceC6161i.class, InterfaceC6162j.class, InterfaceC6163k.class, InterfaceC6165m.class, InterfaceC6166n.class, InterfaceC6167o.class);
        ArrayList arrayList = new ArrayList(Iterables2.m13042g(listM13038c, 10));
        int i = 0;
        for (Object obj : listM13038c) {
            int i2 = i + 1;
            if (i < 0) {
                Collections2.m13041f();
                throw null;
            }
            arrayList.add(new Tuples((Class) obj, Integer.valueOf(i)));
            i = i2;
        }
        Intrinsics2.m13089e(arrayList, "$this$toMap");
        int size = arrayList.size();
        if (size == 0) {
            mapSingletonMap = Maps7.f29520f;
        } else if (size != 1) {
            mapSingletonMap = new LinkedHashMap<>(MapsJVM.m13052a(arrayList.size()));
            Maps6.m13024c(arrayList, mapSingletonMap);
        } else {
            Tuples tuples = (Tuples) arrayList.get(0);
            Intrinsics2.m13089e(tuples, "pair");
            mapSingletonMap = Collections.singletonMap(tuples.f29491f, tuples.f29492g);
            Intrinsics2.m13088d(mapSingletonMap, "java.util.Collections.si…(pair.first, pair.second)");
        }
        f29591a = mapSingletonMap;
        HashMap<String, String> map = new HashMap<>();
        map.put("boolean", "kotlin.Boolean");
        map.put("char", "kotlin.Char");
        map.put("byte", "kotlin.Byte");
        map.put("short", "kotlin.Short");
        map.put("int", "kotlin.Int");
        map.put("float", "kotlin.Float");
        map.put("long", "kotlin.Long");
        map.put("double", "kotlin.Double");
        f29592b = map;
        HashMap<String, String> map2 = new HashMap<>();
        map2.put("java.lang.Boolean", "kotlin.Boolean");
        map2.put("java.lang.Character", "kotlin.Char");
        map2.put("java.lang.Byte", "kotlin.Byte");
        map2.put("java.lang.Short", "kotlin.Short");
        map2.put("java.lang.Integer", "kotlin.Int");
        map2.put("java.lang.Float", "kotlin.Float");
        map2.put("java.lang.Long", "kotlin.Long");
        map2.put("java.lang.Double", "kotlin.Double");
        f29593c = map2;
        HashMap<String, String> map3 = new HashMap<>();
        map3.put("java.lang.Object", "kotlin.Any");
        map3.put("java.lang.String", "kotlin.String");
        map3.put("java.lang.CharSequence", "kotlin.CharSequence");
        map3.put("java.lang.Throwable", "kotlin.Throwable");
        map3.put("java.lang.Cloneable", "kotlin.Cloneable");
        map3.put("java.lang.Number", "kotlin.Number");
        map3.put("java.lang.Comparable", "kotlin.Comparable");
        map3.put("java.lang.Enum", "kotlin.Enum");
        map3.put("java.lang.annotation.Annotation", "kotlin.Annotation");
        map3.put("java.lang.Iterable", "kotlin.collections.Iterable");
        map3.put("java.util.Iterator", "kotlin.collections.Iterator");
        map3.put("java.util.Collection", "kotlin.collections.Collection");
        map3.put("java.util.List", "kotlin.collections.List");
        map3.put("java.util.Set", "kotlin.collections.Set");
        map3.put("java.util.ListIterator", "kotlin.collections.ListIterator");
        map3.put("java.util.Map", "kotlin.collections.Map");
        map3.put("java.util.Map$Entry", "kotlin.collections.Map.Entry");
        map3.put("kotlin.jvm.internal.StringCompanionObject", "kotlin.String.Companion");
        map3.put("kotlin.jvm.internal.EnumCompanionObject", "kotlin.Enum.Companion");
        map3.putAll(map);
        map3.putAll(map2);
        Collection<String> collectionValues = map.values();
        Intrinsics2.m13088d(collectionValues, "primitiveFqNames.values");
        for (String str : collectionValues) {
            StringBuilder sb = new StringBuilder();
            sb.append("kotlin.jvm.internal.");
            Intrinsics2.m13088d(str, "kotlinName");
            sb.append(Strings5.m13003F(str, '.', str));
            sb.append("CompanionObject");
            Tuples tuples2 = new Tuples(sb.toString(), outline.m1599u(str, ".Companion"));
            map3.put(tuples2.f29491f, tuples2.f29492g);
        }
        for (Map.Entry<Class<? extends Function2<?>>, Integer> entry : f29591a.entrySet()) {
            map3.put(entry.getKey().getName(), "kotlin.Function" + entry.getValue().intValue());
        }
        f29594d = map3;
        LinkedHashMap linkedHashMap = new LinkedHashMap(MapsJVM.m13052a(map3.size()));
        Iterator it = map3.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry entry2 = (Map.Entry) it.next();
            Object key = entry2.getKey();
            String str2 = (String) entry2.getValue();
            linkedHashMap.put(key, Strings5.m13003F(str2, '.', str2));
        }
    }

    public ClassReference(Class<?> cls) {
        Intrinsics2.m13089e(cls, "jClass");
        this.f29596f = cls;
    }

    @Override // p477d1.p479b0.KClass
    /* JADX INFO: renamed from: a */
    public boolean mo12972a(Object obj) {
        a aVar = f29595e;
        Class<?> clsM12465t = this.f29596f;
        Objects.requireNonNull(aVar);
        Intrinsics2.m13089e(clsM12465t, "jClass");
        Map<Class<? extends Function2<?>>, Integer> map = f29591a;
        Objects.requireNonNull(map, "null cannot be cast to non-null type kotlin.collections.Map<K, V>");
        Integer num = map.get(clsM12465t);
        if (num != null) {
            return TypeIntrinsics.m13100b(obj, num.intValue());
        }
        if (clsM12465t.isPrimitive()) {
            Intrinsics2.m13089e(clsM12465t, "$this$kotlin");
            clsM12465t = C5729a.m12465t(Reflection.m13097a(clsM12465t));
        }
        return clsM12465t.isInstance(obj);
    }

    @Override // p477d1.p493x.p495c.ClassBasedDeclarationContainer
    /* JADX INFO: renamed from: b */
    public Class<?> mo13082b() {
        return this.f29596f;
    }

    public boolean equals(Object obj) {
        return (obj instanceof ClassReference) && Intrinsics2.m13085a(C5729a.m12465t(this), C5729a.m12465t((KClass) obj));
    }

    @Override // p477d1.p479b0.KClass
    public int hashCode() {
        return C5729a.m12465t(this).hashCode();
    }

    public String toString() {
        return this.f29596f.toString() + " (Kotlin reflection is not available)";
    }
}
