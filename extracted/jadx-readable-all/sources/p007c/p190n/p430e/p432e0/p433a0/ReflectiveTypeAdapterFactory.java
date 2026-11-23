package p007c.p190n.p430e.p432e0.p433a0;

import java.io.IOException;
import java.lang.reflect.Field;
import p007c.p190n.p430e.Gson6;
import p007c.p190n.p430e.TypeAdapter2;
import p007c.p190n.p430e.p436f0.TypeToken;
import p007c.p190n.p430e.p437g0.JsonReader2;
import p007c.p190n.p430e.p437g0.JsonWriter;

/* JADX INFO: renamed from: c.n.e.e0.a0.i, reason: use source file name */
/* JADX INFO: compiled from: ReflectiveTypeAdapterFactory.java */
/* JADX INFO: loaded from: classes.dex */
public class ReflectiveTypeAdapterFactory extends ReflectiveTypeAdapterFactory2.b {

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ Field f27358d;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ boolean f27359e;

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ TypeAdapter2 f27360f;

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ Gson6 f27361g;

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ TypeToken f27362h;

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ boolean f27363i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ReflectiveTypeAdapterFactory(ReflectiveTypeAdapterFactory2 reflectiveTypeAdapterFactory2, String str, boolean z, boolean z2, Field field, boolean z3, TypeAdapter2 typeAdapter2, Gson6 gson6, TypeToken typeToken, boolean z4) {
        super(str, z, z2);
        this.f27358d = field;
        this.f27359e = z3;
        this.f27360f = typeAdapter2;
        this.f27361g = gson6;
        this.f27362h = typeToken;
        this.f27363i = z4;
    }

    @Override // p007c.p190n.p430e.p432e0.p433a0.ReflectiveTypeAdapterFactory2.b
    /* JADX INFO: renamed from: a */
    public void mo12263a(JsonReader2 jsonReader2, Object obj) throws IllegalAccessException, IOException {
        Object objMo12212a = this.f27360f.mo12212a(jsonReader2);
        if (objMo12212a == null && this.f27363i) {
            return;
        }
        this.f27358d.set(obj, objMo12212a);
    }

    @Override // p007c.p190n.p430e.p432e0.p433a0.ReflectiveTypeAdapterFactory2.b
    /* JADX INFO: renamed from: b */
    public void mo12264b(JsonWriter jsonWriter, Object obj) throws IllegalAccessException, IOException {
        (this.f27359e ? this.f27360f : new TypeAdapterRuntimeTypeWrapper(this.f27361g, this.f27360f, this.f27362h.f27514b)).mo12213b(jsonWriter, this.f27358d.get(obj));
    }

    @Override // p007c.p190n.p430e.p432e0.p433a0.ReflectiveTypeAdapterFactory2.b
    /* JADX INFO: renamed from: c */
    public boolean mo12265c(Object obj) throws IllegalAccessException, IOException {
        return this.f27372b && this.f27358d.get(obj) != obj;
    }
}
