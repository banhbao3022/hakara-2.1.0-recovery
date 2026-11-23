package p007c.p190n.p194b.p195a.p198j;

import java.util.HashMap;
import java.util.Objects;
import p007c.p071d.p078c.p079a.outline;
import p007c.p190n.p194b.p195a.Encoding;
import p007c.p190n.p194b.p195a.Event;
import p007c.p190n.p194b.p195a.Priority2;
import p007c.p190n.p194b.p195a.Transformer;
import p007c.p190n.p194b.p195a.Transport;
import p007c.p190n.p194b.p195a.TransportScheduleCallback;
import p007c.p190n.p194b.p195a.p198j.p203v.Scheduler;

/* JADX INFO: renamed from: c.n.b.a.j.n, reason: use source file name */
/* JADX INFO: compiled from: TransportImpl.java */
/* JADX INFO: loaded from: classes.dex */
public final class TransportImpl2<T> implements Transport<T> {

    /* JADX INFO: renamed from: a */
    public final TransportContext f5744a;

    /* JADX INFO: renamed from: b */
    public final String f5745b;

    /* JADX INFO: renamed from: c */
    public final Encoding f5746c;

    /* JADX INFO: renamed from: d */
    public final Transformer<T, byte[]> f5747d;

    /* JADX INFO: renamed from: e */
    public final TransportInternal f5748e;

    public TransportImpl2(TransportContext transportContext, String str, Encoding encoding, Transformer<T, byte[]> transformer, TransportInternal transportInternal) {
        this.f5744a = transportContext;
        this.f5745b = str;
        this.f5746c = encoding;
        this.f5747d = transformer;
        this.f5748e = transportInternal;
    }

    @Override // p007c.p190n.p194b.p195a.Transport
    /* JADX INFO: renamed from: a */
    public void mo2748a(Event<T> event) {
        mo2749b(event, new TransportScheduleCallback() { // from class: c.n.b.a.j.m
            @Override // p007c.p190n.p194b.p195a.TransportScheduleCallback
            /* JADX INFO: renamed from: a */
            public void mo2751a(Exception exc) {
            }
        });
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p007c.p190n.p194b.p195a.Transport
    /* JADX INFO: renamed from: b */
    public void mo2749b(Event<T> event, TransportScheduleCallback transportScheduleCallback) {
        TransportInternal transportInternal = this.f5748e;
        AutoValue_SendRequest autoValue_SendRequest = new AutoValue_SendRequest();
        TransportContext transportContext = this.f5744a;
        Objects.requireNonNull(transportContext, "Null transportContext");
        autoValue_SendRequest.f5712a = transportContext;
        Objects.requireNonNull(event, "Null event");
        autoValue_SendRequest.f5714c = event;
        String str = this.f5745b;
        Objects.requireNonNull(str, "Null transportName");
        autoValue_SendRequest.f5713b = str;
        Transformer<T, byte[]> transformer = this.f5747d;
        Objects.requireNonNull(transformer, "Null transformer");
        autoValue_SendRequest.f5715d = transformer;
        Encoding encoding = this.f5746c;
        Objects.requireNonNull(encoding, "Null encoding");
        autoValue_SendRequest.f5716e = encoding;
        String strM1599u = autoValue_SendRequest.f5712a == null ? " transportContext" : "";
        if (autoValue_SendRequest.f5713b == null) {
            strM1599u = outline.m1599u(strM1599u, " transportName");
        }
        if (autoValue_SendRequest.f5714c == null) {
            strM1599u = outline.m1599u(strM1599u, " event");
        }
        if (autoValue_SendRequest.f5715d == null) {
            strM1599u = outline.m1599u(strM1599u, " transformer");
        }
        if (autoValue_SendRequest.f5716e == null) {
            strM1599u = outline.m1599u(strM1599u, " encoding");
        }
        if (!strM1599u.isEmpty()) {
            throw new IllegalStateException(outline.m1599u("Missing required properties:", strM1599u));
        }
        TransportContext transportContext2 = autoValue_SendRequest.f5712a;
        String str2 = autoValue_SendRequest.f5713b;
        Event<?> event2 = autoValue_SendRequest.f5714c;
        Transformer<?, byte[]> transformer2 = autoValue_SendRequest.f5715d;
        Encoding encoding2 = autoValue_SendRequest.f5716e;
        TransportRuntime transportRuntime = (TransportRuntime) transportInternal;
        Scheduler scheduler = transportRuntime.f5752d;
        Priority2 priority2Mo2747c = event2.mo2747c();
        Objects.requireNonNull(transportContext2);
        TransportContext.a aVarM2819a = TransportContext.m2819a();
        aVarM2819a.mo2812b(transportContext2.mo2808b());
        aVarM2819a.mo2814d(priority2Mo2747c);
        ((AutoValue_TransportContext.b) aVarM2819a).f5721b = transportContext2.mo2809c();
        TransportContext transportContextMo2811a = aVarM2819a.mo2811a();
        AutoValue_EventInternal.b bVar = new AutoValue_EventInternal.b();
        bVar.f5711f = new HashMap();
        bVar.m2805g(transportRuntime.f5750b.mo2878a());
        bVar.m2807i(transportRuntime.f5751c.mo2878a());
        bVar.m2806h(str2);
        bVar.m2804f(new EncodedPayload(encoding2, transformer2.apply(event2.mo2746b())));
        bVar.f5707b = event2.mo2745a();
        scheduler.mo2837a(transportContextMo2811a, bVar.mo2800b(), transportScheduleCallback);
    }
}
