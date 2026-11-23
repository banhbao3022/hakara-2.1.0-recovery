package p007c.p190n.p194b.p266d.p314j.p320f;

import java.nio.charset.Charset;
import java.util.Objects;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

/* JADX INFO: renamed from: c.n.b.d.j.f.t6 */
/* JADX INFO: compiled from: com.google.android.gms:play-services-cast@@18.1.0 */
/* JADX INFO: loaded from: classes.dex */
public final class C4005t6 {

    /* JADX INFO: renamed from: a */
    public static final C4005t6 f22879a = new C4005t6();

    /* JADX INFO: renamed from: c */
    public final ConcurrentMap<Class<?>, InterfaceC4059z6<?>> f22881c = new ConcurrentHashMap();

    /* JADX INFO: renamed from: b */
    public final InterfaceC4050y6 f22880b = new C4058z5();

    /* JADX INFO: renamed from: a */
    public final <T> InterfaceC4059z6<T> m9222a(Class<T> cls) {
        InterfaceC4059z6<T> interfaceC4059z6M9117h;
        C3955o6 c3955o6;
        Class<?> cls2;
        Charset charset = C3814a5.f22506a;
        Objects.requireNonNull(cls, "messageType");
        InterfaceC4059z6<T> interfaceC4059z6 = (InterfaceC4059z6) this.f22881c.get(cls);
        if (interfaceC4059z6 != null) {
            return interfaceC4059z6;
        }
        C4058z5 c4058z5 = (C4058z5) this.f22880b;
        Objects.requireNonNull(c4058z5);
        Class<?> cls3 = C3826b7.f22526a;
        if (!AbstractC4057z4.class.isAssignableFrom(cls) && (cls2 = C3826b7.f22526a) != null && !cls2.isAssignableFrom(cls)) {
            throw new IllegalArgumentException("Message classes must extend GeneratedMessage or GeneratedMessageLite");
        }
        InterfaceC3875g6 interfaceC3875g6Mo8959a = c4058z5.f23006b.mo8959a(cls);
        if (interfaceC3875g6Mo8959a.mo9028c()) {
            if (AbstractC4057z4.class.isAssignableFrom(cls)) {
                AbstractC3946n7<?, ?> abstractC3946n7 = C3826b7.f22529d;
                AbstractC3963p4<?> abstractC3963p4 = C3983r4.f22860a;
                c3955o6 = new C3955o6(abstractC3946n7, C3983r4.f22860a, interfaceC3875g6Mo8959a.mo9026a());
            } else {
                AbstractC3946n7<?, ?> abstractC3946n8 = C3826b7.f22527b;
                AbstractC3963p4<?> abstractC3963p5 = C3983r4.f22861b;
                if (abstractC3963p5 == null) {
                    throw new IllegalStateException("Protobuf runtime is not correctly loaded.");
                }
                c3955o6 = new C3955o6(abstractC3946n8, abstractC3963p5, interfaceC3875g6Mo8959a.mo9026a());
            }
            interfaceC4059z6M9117h = c3955o6;
        } else {
            if (AbstractC4057z4.class.isAssignableFrom(cls)) {
                if (interfaceC3875g6Mo8959a.mo9027b() == 1) {
                    InterfaceC3975q6 interfaceC3975q6 = C3995s6.f22872b;
                    AbstractC3984r5 abstractC3984r5 = AbstractC3984r5.f22863b;
                    AbstractC3946n7<?, ?> abstractC3946n9 = C3826b7.f22529d;
                    AbstractC3963p4<?> abstractC3963p6 = C3983r4.f22860a;
                    interfaceC4059z6M9117h = C3935m6.m9117h(interfaceC3875g6Mo8959a, interfaceC3975q6, abstractC3984r5, abstractC3946n9, C3983r4.f22860a, C3885h6.f22694b);
                } else {
                    interfaceC4059z6M9117h = C3935m6.m9117h(interfaceC3875g6Mo8959a, C3995s6.f22872b, AbstractC3984r5.f22863b, C3826b7.f22529d, null, C3885h6.f22694b);
                }
            } else {
                if (interfaceC3875g6Mo8959a.mo9027b() == 1) {
                    InterfaceC3975q6 interfaceC3975q7 = C3995s6.f22871a;
                    AbstractC3984r5 abstractC3984r6 = AbstractC3984r5.f22862a;
                    AbstractC3946n7<?, ?> abstractC3946n10 = C3826b7.f22527b;
                    AbstractC3963p4<?> abstractC3963p7 = C3983r4.f22861b;
                    if (abstractC3963p7 == null) {
                        throw new IllegalStateException("Protobuf runtime is not correctly loaded.");
                    }
                    interfaceC4059z6M9117h = C3935m6.m9117h(interfaceC3875g6Mo8959a, interfaceC3975q7, abstractC3984r6, abstractC3946n10, abstractC3963p7, C3885h6.f22693a);
                } else {
                    interfaceC4059z6M9117h = C3935m6.m9117h(interfaceC3875g6Mo8959a, C3995s6.f22871a, AbstractC3984r5.f22862a, C3826b7.f22528c, null, C3885h6.f22693a);
                }
            }
        }
        InterfaceC4059z6<T> interfaceC4059z7 = (InterfaceC4059z6) this.f22881c.putIfAbsent(cls, interfaceC4059z6M9117h);
        return interfaceC4059z7 != null ? interfaceC4059z7 : interfaceC4059z6M9117h;
    }

    /* JADX INFO: renamed from: b */
    public final <T> InterfaceC4059z6<T> m9223b(T t) {
        return m9222a(t.getClass());
    }
}
