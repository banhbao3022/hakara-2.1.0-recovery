package p007c.p190n.p430e;

import java.lang.reflect.Type;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import p007c.p190n.p430e.p432e0.Excluder;
import p007c.p190n.p430e.p432e0.p433a0.TypeAdapters;
import p007c.p190n.p430e.p432e0.p433a0.TypeAdapters2;

/* JADX INFO: renamed from: c.n.e.l, reason: use source file name */
/* JADX INFO: compiled from: GsonBuilder.java */
/* JADX INFO: loaded from: classes.dex */
public final class GsonBuilder {

    /* JADX INFO: renamed from: a */
    public Excluder f27571a = Excluder.f27471f;

    /* JADX INFO: renamed from: b */
    public LongSerializationPolicy f27572b = LongSerializationPolicy.f27584f;

    /* JADX INFO: renamed from: c */
    public FieldNamingStrategy f27573c = FieldNamingPolicy.f27316f;

    /* JADX INFO: renamed from: d */
    public final Map<Type, InstanceCreator<?>> f27574d = new HashMap();

    /* JADX INFO: renamed from: e */
    public final List<TypeAdapterFactory> f27575e = new ArrayList();

    /* JADX INFO: renamed from: f */
    public final List<TypeAdapterFactory> f27576f = new ArrayList();

    /* JADX INFO: renamed from: g */
    public int f27577g = 2;

    /* JADX INFO: renamed from: h */
    public int f27578h = 2;

    /* JADX INFO: renamed from: i */
    public boolean f27579i = true;

    /* JADX INFO: renamed from: a */
    public Gson6 m12322a() {
        ArrayList arrayList = new ArrayList(this.f27576f.size() + this.f27575e.size() + 3);
        arrayList.addAll(this.f27575e);
        Collections.reverse(arrayList);
        ArrayList arrayList2 = new ArrayList(this.f27576f);
        Collections.reverse(arrayList2);
        arrayList.addAll(arrayList2);
        int i = this.f27577g;
        int i2 = this.f27578h;
        if (i != 2 && i2 != 2) {
            DefaultDateTypeAdapter defaultDateTypeAdapter = new DefaultDateTypeAdapter(Date.class, i, i2);
            DefaultDateTypeAdapter defaultDateTypeAdapter2 = new DefaultDateTypeAdapter(Timestamp.class, i, i2);
            DefaultDateTypeAdapter defaultDateTypeAdapter3 = new DefaultDateTypeAdapter(java.sql.Date.class, i, i2);
            TypeAdapter2<Class> typeAdapter2 = TypeAdapters.f27414a;
            arrayList.add(new TypeAdapters2(Date.class, defaultDateTypeAdapter));
            arrayList.add(new TypeAdapters2(Timestamp.class, defaultDateTypeAdapter2));
            arrayList.add(new TypeAdapters2(java.sql.Date.class, defaultDateTypeAdapter3));
        }
        return new Gson6(this.f27571a, this.f27573c, this.f27574d, false, false, false, this.f27579i, false, false, false, this.f27572b, null, this.f27577g, this.f27578h, this.f27575e, this.f27576f, arrayList);
    }
}
