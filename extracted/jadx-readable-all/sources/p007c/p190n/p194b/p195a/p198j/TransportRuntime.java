package p007c.p190n.p194b.p195a.p198j;

import android.content.Context;
import java.util.Collections;
import java.util.Iterator;
import java.util.Objects;
import java.util.Set;
import p007c.p190n.p194b.p195a.Encoding;
import p007c.p190n.p194b.p195a.TransportFactory;
import p007c.p190n.p194b.p195a.p196i.CCTDestination;
import p007c.p190n.p194b.p195a.p198j.TransportContext;
import p007c.p190n.p194b.p195a.p198j.p203v.Scheduler;
import p007c.p190n.p194b.p195a.p198j.p203v.p204h.Uploader6;
import p007c.p190n.p194b.p195a.p198j.p203v.p204h.WorkInitializer3;
import p007c.p190n.p194b.p195a.p198j.p206w.SynchronizationGuard;
import p007c.p190n.p194b.p195a.p198j.p207x.Clock;

/* JADX INFO: renamed from: c.n.b.a.j.p, reason: use source file name */
/* JADX INFO: compiled from: TransportRuntime.java */
/* JADX INFO: loaded from: classes.dex */
public class TransportRuntime implements TransportInternal {

    /* JADX INFO: renamed from: a */
    public static volatile TransportRuntimeComponent f5749a;

    /* JADX INFO: renamed from: b */
    public final Clock f5750b;

    /* JADX INFO: renamed from: c */
    public final Clock f5751c;

    /* JADX INFO: renamed from: d */
    public final Scheduler f5752d;

    /* JADX INFO: renamed from: e */
    public final Uploader6 f5753e;

    public TransportRuntime(Clock clock, Clock clock2, Scheduler scheduler, Uploader6 uploader6, final WorkInitializer3 workInitializer3) {
        this.f5750b = clock;
        this.f5751c = clock2;
        this.f5752d = scheduler;
        this.f5753e = uploader6;
        workInitializer3.f5864a.execute(new Runnable(workInitializer3) { // from class: c.n.b.a.j.v.h.n

            /* JADX INFO: renamed from: f */
            public final WorkInitializer3 f5862f;

            {
                this.f5862f = workInitializer3;
            }

            @Override // java.lang.Runnable
            public void run() {
                final WorkInitializer3 workInitializer4 = this.f5862f;
                workInitializer4.f5867d.mo2871a(new SynchronizationGuard.a(workInitializer4) { // from class: c.n.b.a.j.v.h.o

                    /* JADX INFO: renamed from: a */
                    public final WorkInitializer3 f5863a;

                    {
                        this.f5863a = workInitializer4;
                    }

                    @Override // p007c.p190n.p194b.p195a.p198j.p206w.SynchronizationGuard.a
                    /* JADX INFO: renamed from: h */
                    public Object mo2836h() {
                        WorkInitializer3 workInitializer5 = this.f5863a;
                        Iterator<TransportContext> it = workInitializer5.f5865b.mo2859C().iterator();
                        while (it.hasNext()) {
                            workInitializer5.f5866c.mo2847a(it.next(), 1);
                        }
                        return null;
                    }
                });
            }
        });
    }

    /* JADX INFO: renamed from: a */
    public static TransportRuntime m2820a() {
        TransportRuntimeComponent transportRuntimeComponent = f5749a;
        if (transportRuntimeComponent != null) {
            return ((DaggerTransportRuntimeComponent) transportRuntimeComponent).f5734q.get();
        }
        throw new IllegalStateException("Not initialized!");
    }

    /* JADX INFO: renamed from: b */
    public static void m2821b(Context context) {
        if (f5749a == null) {
            synchronized (TransportRuntime.class) {
                if (f5749a == null) {
                    Objects.requireNonNull(context);
                    f5749a = new DaggerTransportRuntimeComponent(context, null);
                }
            }
        }
    }

    /* JADX INFO: renamed from: c */
    public TransportFactory m2822c(EncodedDestination encodedDestination) {
        Set setSingleton;
        if (encodedDestination instanceof EncodedDestination) {
            Objects.requireNonNull((CCTDestination) encodedDestination);
            setSingleton = Collections.unmodifiableSet(CCTDestination.f5523d);
        } else {
            setSingleton = Collections.singleton(new Encoding("proto"));
        }
        TransportContext.a aVarM2819a = TransportContext.m2819a();
        Objects.requireNonNull(encodedDestination);
        aVarM2819a.mo2812b("cct");
        ((AutoValue_TransportContext.b) aVarM2819a).f5721b = ((CCTDestination) encodedDestination).m2753b();
        return new TransportFactoryImpl(setSingleton, aVarM2819a.mo2811a(), this);
    }
}
