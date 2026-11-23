package p007c.p190n.p194b.p195a.p198j.p203v.p204h;

import android.content.Context;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.Executor;
import p007c.p071d.p078c.p079a.outline;
import p007c.p165l.p175i0.C1095a;
import p007c.p190n.p194b.p195a.p198j.TransportContext;
import p007c.p190n.p194b.p195a.p198j.p199s.AutoValue_BackendRequest;
import p007c.p190n.p194b.p195a.p198j.p199s.BackendRegistry;
import p007c.p190n.p194b.p195a.p198j.p199s.BackendResponse;
import p007c.p190n.p194b.p195a.p198j.p199s.TransportBackend;
import p007c.p190n.p194b.p195a.p198j.p203v.p205i.EventStore;
import p007c.p190n.p194b.p195a.p198j.p203v.p205i.PersistedEvent;
import p007c.p190n.p194b.p195a.p198j.p206w.SynchronizationGuard;
import p007c.p190n.p194b.p195a.p198j.p207x.Clock;

/* JADX INFO: renamed from: c.n.b.a.j.v.h.l, reason: use source file name */
/* JADX INFO: compiled from: Uploader.java */
/* JADX INFO: loaded from: classes.dex */
public class Uploader6 {

    /* JADX INFO: renamed from: a */
    public final Context f5848a;

    /* JADX INFO: renamed from: b */
    public final BackendRegistry f5849b;

    /* JADX INFO: renamed from: c */
    public final EventStore f5850c;

    /* JADX INFO: renamed from: d */
    public final WorkScheduler f5851d;

    /* JADX INFO: renamed from: e */
    public final Executor f5852e;

    /* JADX INFO: renamed from: f */
    public final SynchronizationGuard f5853f;

    /* JADX INFO: renamed from: g */
    public final Clock f5854g;

    public Uploader6(Context context, BackendRegistry backendRegistry, EventStore eventStore, WorkScheduler workScheduler, Executor executor, SynchronizationGuard synchronizationGuard, Clock clock) {
        this.f5848a = context;
        this.f5849b = backendRegistry;
        this.f5850c = eventStore;
        this.f5851d = workScheduler;
        this.f5852e = executor;
        this.f5853f = synchronizationGuard;
        this.f5854g = clock;
    }

    /* JADX INFO: renamed from: a */
    public void m2850a(final TransportContext transportContext, final int i) {
        BackendResponse backendResponseMo2756a;
        TransportBackend transportBackendMo2831a = this.f5849b.mo2831a(transportContext.mo2808b());
        final Iterable iterable = (Iterable) this.f5853f.mo2871a(new SynchronizationGuard.a(this, transportContext) { // from class: c.n.b.a.j.v.h.h

            /* JADX INFO: renamed from: a */
            public final Uploader6 f5837a;

            /* JADX INFO: renamed from: b */
            public final TransportContext f5838b;

            {
                this.f5837a = this;
                this.f5838b = transportContext;
            }

            @Override // p007c.p190n.p194b.p195a.p198j.p206w.SynchronizationGuard.a
            /* JADX INFO: renamed from: h */
            public Object mo2836h() {
                Uploader6 uploader6 = this.f5837a;
                return uploader6.f5850c.mo2865t(this.f5838b);
            }
        });
        if (iterable.iterator().hasNext()) {
            if (transportBackendMo2831a == null) {
                C1095a.m2397m("Uploader", "Unknown backend for %s, deleting event batch for it...", transportContext);
                backendResponseMo2756a = BackendResponse.m2832a();
            } else {
                ArrayList arrayList = new ArrayList();
                Iterator it = iterable.iterator();
                while (it.hasNext()) {
                    arrayList.add(((PersistedEvent) it.next()).mo2856a());
                }
                AutoValue_BackendRequest.b bVar = new AutoValue_BackendRequest.b();
                bVar.f5761a = arrayList;
                bVar.f5762b = transportContext.mo2809c();
                String str = bVar.f5761a == null ? " events" : "";
                if (!str.isEmpty()) {
                    throw new IllegalStateException(outline.m1599u("Missing required properties:", str));
                }
                backendResponseMo2756a = transportBackendMo2831a.mo2756a(new AutoValue_BackendRequest(bVar.f5761a, bVar.f5762b, null));
            }
            final BackendResponse backendResponse = backendResponseMo2756a;
            this.f5853f.mo2871a(new SynchronizationGuard.a(this, backendResponse, iterable, transportContext, i) { // from class: c.n.b.a.j.v.h.i

                /* JADX INFO: renamed from: a */
                public final Uploader6 f5839a;

                /* JADX INFO: renamed from: b */
                public final BackendResponse f5840b;

                /* JADX INFO: renamed from: c */
                public final Iterable f5841c;

                /* JADX INFO: renamed from: d */
                public final TransportContext f5842d;

                /* JADX INFO: renamed from: e */
                public final int f5843e;

                {
                    this.f5839a = this;
                    this.f5840b = backendResponse;
                    this.f5841c = iterable;
                    this.f5842d = transportContext;
                    this.f5843e = i;
                }

                @Override // p007c.p190n.p194b.p195a.p198j.p206w.SynchronizationGuard.a
                /* JADX INFO: renamed from: h */
                public Object mo2836h() {
                    Uploader6 uploader6 = this.f5839a;
                    BackendResponse backendResponse2 = this.f5840b;
                    Iterable<PersistedEvent> iterable2 = this.f5841c;
                    TransportContext transportContext2 = this.f5842d;
                    int i2 = this.f5843e;
                    if (backendResponse2.mo2826c() == BackendResponse.a.TRANSIENT_ERROR) {
                        uploader6.f5850c.mo2866v0(iterable2);
                        uploader6.f5851d.mo2847a(transportContext2, i2 + 1);
                        return null;
                    }
                    uploader6.f5850c.mo2861k(iterable2);
                    if (backendResponse2.mo2826c() == BackendResponse.a.OK) {
                        uploader6.f5850c.mo2867x(transportContext2, backendResponse2.mo2825b() + uploader6.f5854g.mo2878a());
                    }
                    if (!uploader6.f5850c.mo2864s0(transportContext2)) {
                        return null;
                    }
                    uploader6.f5851d.mo2847a(transportContext2, 1);
                    return null;
                }
            });
        }
    }
}
