package p007c.p190n.p194b.p266d.p314j.p320f;

import android.content.Context;
import android.os.RemoteException;
import android.text.TextUtils;
import com.google.android.gms.cast.CastDevice;
import java.io.IOException;
import java.util.Objects;
import p007c.p190n.p194b.p266d.p290d.C2372a0;
import p007c.p190n.p194b.p266d.p290d.C2383e;
import p007c.p190n.p194b.p266d.p290d.InterfaceC2415o1;
import p007c.p190n.p194b.p266d.p290d.p291r.C2424b;
import p007c.p190n.p194b.p266d.p290d.p295s.C2516a;
import p007c.p190n.p194b.p266d.p290d.p295s.C2518b;
import p007c.p190n.p194b.p266d.p290d.p295s.C2532h0;
import p007c.p190n.p194b.p266d.p290d.p295s.InterfaceC2542m0;
import p007c.p190n.p194b.p266d.p298f.C2622l;
import p007c.p190n.p194b.p266d.p298f.p299o.p300n.AbstractC2687r;
import p007c.p190n.p194b.p266d.p298f.p299o.p300n.InterfaceC2681o;
import p007c.p190n.p194b.p266d.p333n.C4782j;

/* JADX INFO: renamed from: c.n.b.d.j.f.m8 */
/* JADX INFO: compiled from: com.google.android.gms:play-services-cast-framework@@18.1.0 */
/* JADX INFO: loaded from: classes.dex */
public final class C3937m8 implements InterfaceC4006t7 {

    /* JADX INFO: renamed from: a */
    public static final C2518b f22811a = new C2518b("CastApiAdapter");

    /* JADX INFO: renamed from: b */
    public final InterfaceC3828c f22812b;

    /* JADX INFO: renamed from: c */
    public final Context f22813c;

    /* JADX INFO: renamed from: d */
    public final CastDevice f22814d;

    /* JADX INFO: renamed from: e */
    public final C2424b f22815e;

    /* JADX INFO: renamed from: f */
    public final C2383e.c f22816f;

    /* JADX INFO: renamed from: g */
    public final InterfaceC3917k8 f22817g;

    /* JADX INFO: renamed from: h */
    public InterfaceC2415o1 f22818h;

    public C3937m8(InterfaceC3828c interfaceC3828c, Context context, CastDevice castDevice, C2424b c2424b, C2383e.c cVar, InterfaceC3917k8 interfaceC3917k8) {
        this.f22812b = interfaceC3828c;
        this.f22813c = context;
        this.f22814d = castDevice;
        this.f22815e = c2424b;
        this.f22816f = cVar;
        this.f22817g = interfaceC3917k8;
    }

    /* JADX INFO: renamed from: a */
    public final void m9146a(final String str) throws IOException {
        final C2383e.d dVarRemove;
        InterfaceC2415o1 interfaceC2415o1 = this.f22818h;
        if (interfaceC2415o1 != null) {
            final C2372a0 c2372a0 = (C2372a0) interfaceC2415o1;
            Objects.requireNonNull(c2372a0);
            if (TextUtils.isEmpty(str)) {
                throw new IllegalArgumentException("Channel namespace cannot be null or empty");
            }
            synchronized (c2372a0.f10976F) {
                dVarRemove = c2372a0.f10976F.remove(str);
            }
            AbstractC2687r.a aVarM5551a = AbstractC2687r.m5551a();
            aVarM5551a.f11748a = new InterfaceC2681o(c2372a0, dVarRemove, str) { // from class: c.n.b.d.d.e0

                /* JADX INFO: renamed from: a */
                public final C2372a0 f11025a;

                /* JADX INFO: renamed from: b */
                public final C2383e.d f11026b;

                /* JADX INFO: renamed from: c */
                public final String f11027c;

                {
                    this.f11025a = c2372a0;
                    this.f11026b = dVarRemove;
                    this.f11027c = str;
                }

                @Override // p007c.p190n.p194b.p266d.p298f.p299o.p300n.InterfaceC2681o
                /* JADX INFO: renamed from: a */
                public final void mo4950a(Object obj, Object obj2) throws RemoteException {
                    C2372a0 c2372a1 = this.f11025a;
                    C2383e.d dVar = this.f11026b;
                    String str2 = this.f11027c;
                    C2532h0 c2532h0 = (C2532h0) obj;
                    C4782j c4782j = (C4782j) obj2;
                    C2622l.m5389k(c2372a1.f10981o != 1, "Not active connection");
                    if (dVar != null) {
                        ((InterfaceC2542m0) c2532h0.m5581u()).mo5144p1(str2);
                    }
                    c4782j.f24683a.m10944q(null);
                }
            };
            c2372a0.m5487c(1, aVarM5551a.m5553a());
        }
    }

    /* JADX INFO: renamed from: b */
    public final void m9147b(final String str, final C2383e.d dVar) throws IOException {
        InterfaceC2415o1 interfaceC2415o1 = this.f22818h;
        if (interfaceC2415o1 != null) {
            final C2372a0 c2372a0 = (C2372a0) interfaceC2415o1;
            C2516a.m5113c(str);
            synchronized (c2372a0.f10976F) {
                c2372a0.f10976F.put(str, dVar);
            }
            AbstractC2687r.a aVarM5551a = AbstractC2687r.m5551a();
            aVarM5551a.f11748a = new InterfaceC2681o(c2372a0, str, dVar) { // from class: c.n.b.d.d.c0

                /* JADX INFO: renamed from: a */
                public final C2372a0 f11006a;

                /* JADX INFO: renamed from: b */
                public final String f11007b;

                /* JADX INFO: renamed from: c */
                public final C2383e.d f11008c;

                {
                    this.f11006a = c2372a0;
                    this.f11007b = str;
                    this.f11008c = dVar;
                }

                @Override // p007c.p190n.p194b.p266d.p298f.p299o.p300n.InterfaceC2681o
                /* JADX INFO: renamed from: a */
                public final void mo4950a(Object obj, Object obj2) throws RemoteException {
                    C2372a0 c2372a1 = this.f11006a;
                    String str2 = this.f11007b;
                    C2383e.d dVar2 = this.f11008c;
                    C2532h0 c2532h0 = (C2532h0) obj;
                    C4782j c4782j = (C4782j) obj2;
                    C2622l.m5389k(c2372a1.f10981o != 1, "Not active connection");
                    ((InterfaceC2542m0) c2532h0.m5581u()).mo5144p1(str2);
                    if (dVar2 != null) {
                        ((InterfaceC2542m0) c2532h0.m5581u()).mo5143i3(str2);
                    }
                    c4782j.f24683a.m10944q(null);
                }
            };
            c2372a0.m5487c(1, aVarM5551a.m5553a());
        }
    }
}
