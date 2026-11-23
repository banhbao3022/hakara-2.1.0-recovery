package p007c.p190n.p194b.p266d.p314j.p325k;

import java.nio.charset.Charset;
import java.util.Objects;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

/* JADX INFO: renamed from: c.n.b.d.j.k.w6 */
/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement-base@@18.0.0 */
/* JADX INFO: loaded from: classes.dex */
public final class C4392w6 {

    /* JADX INFO: renamed from: a */
    public static final C4392w6 f23587a = new C4392w6();

    /* JADX INFO: renamed from: c */
    public final ConcurrentMap<Class<?>, InterfaceC4431z6<?>> f23589c = new ConcurrentHashMap();

    /* JADX INFO: renamed from: b */
    public final InterfaceC4418y6 f23588b = new C4417y5();

    /* JADX INFO: renamed from: a */
    public final <T> InterfaceC4431z6<T> m10311a(Class<T> cls) {
        InterfaceC4431z6<T> interfaceC4431z6M10039n;
        C4296p6 c4296p6;
        Class<?> cls2;
        Charset charset = C4127d5.f23112a;
        Objects.requireNonNull(cls, "messageType");
        InterfaceC4431z6<T> interfaceC4431z6 = (InterfaceC4431z6) this.f23589c.get(cls);
        if (interfaceC4431z6 != null) {
            return interfaceC4431z6;
        }
        C4417y5 c4417y5 = (C4417y5) this.f23588b;
        Objects.requireNonNull(c4417y5);
        Class<?> cls3 = C4101b7.f23089a;
        if (!AbstractC4099b5.class.isAssignableFrom(cls) && (cls2 = C4101b7.f23089a) != null && !cls2.isAssignableFrom(cls)) {
            throw new IllegalArgumentException("Message classes must extend GeneratedMessage or GeneratedMessageLite");
        }
        InterfaceC4212j6 interfaceC4212j6Mo9344a = c4417y5.f23638b.mo9344a(cls);
        if (interfaceC4212j6Mo9344a.mo9834a()) {
            if (AbstractC4099b5.class.isAssignableFrom(cls)) {
                AbstractC4269n7<?, ?> abstractC4269n7 = C4101b7.f23092d;
                AbstractC4308q4<?> abstractC4308q4 = C4322r4.f23428a;
                c4296p6 = new C4296p6(abstractC4269n7, C4322r4.f23428a, interfaceC4212j6Mo9344a.mo9835b());
            } else {
                AbstractC4269n7<?, ?> abstractC4269n8 = C4101b7.f23090b;
                AbstractC4308q4<?> abstractC4308q5 = C4322r4.f23429b;
                if (abstractC4308q5 == null) {
                    throw new IllegalStateException("Protobuf runtime is not correctly loaded.");
                }
                c4296p6 = new C4296p6(abstractC4269n8, abstractC4308q5, interfaceC4212j6Mo9344a.mo9835b());
            }
            interfaceC4431z6M10039n = c4296p6;
        } else {
            if (AbstractC4099b5.class.isAssignableFrom(cls)) {
                if (interfaceC4212j6Mo9344a.zza() == 1) {
                    InterfaceC4324r6 interfaceC4324r6 = C4352t6.f23474b;
                    AbstractC4378v5 abstractC4378v5 = AbstractC4378v5.f23568b;
                    AbstractC4269n7<?, ?> abstractC4269n9 = C4101b7.f23092d;
                    AbstractC4308q4<?> abstractC4308q6 = C4322r4.f23428a;
                    interfaceC4431z6M10039n = C4268n6.m10039n(interfaceC4212j6Mo9344a, interfaceC4324r6, abstractC4378v5, abstractC4269n9, C4322r4.f23428a, C4170g6.f23171b);
                } else {
                    interfaceC4431z6M10039n = C4268n6.m10039n(interfaceC4212j6Mo9344a, C4352t6.f23474b, AbstractC4378v5.f23568b, C4101b7.f23092d, null, C4170g6.f23171b);
                }
            } else {
                if (interfaceC4212j6Mo9344a.zza() == 1) {
                    InterfaceC4324r6 interfaceC4324r7 = C4352t6.f23473a;
                    AbstractC4378v5 abstractC4378v6 = AbstractC4378v5.f23567a;
                    AbstractC4269n7<?, ?> abstractC4269n10 = C4101b7.f23090b;
                    AbstractC4308q4<?> abstractC4308q7 = C4322r4.f23429b;
                    if (abstractC4308q7 == null) {
                        throw new IllegalStateException("Protobuf runtime is not correctly loaded.");
                    }
                    interfaceC4431z6M10039n = C4268n6.m10039n(interfaceC4212j6Mo9344a, interfaceC4324r7, abstractC4378v6, abstractC4269n10, abstractC4308q7, C4170g6.f23170a);
                } else {
                    interfaceC4431z6M10039n = C4268n6.m10039n(interfaceC4212j6Mo9344a, C4352t6.f23473a, AbstractC4378v5.f23567a, C4101b7.f23091c, null, C4170g6.f23170a);
                }
            }
        }
        InterfaceC4431z6<T> interfaceC4431z7 = (InterfaceC4431z6) this.f23589c.putIfAbsent(cls, interfaceC4431z6M10039n);
        return interfaceC4431z7 != null ? interfaceC4431z7 : interfaceC4431z6M10039n;
    }

    /* JADX INFO: renamed from: b */
    public final <T> InterfaceC4431z6<T> m10312b(T t) {
        return m10311a(t.getClass());
    }
}
