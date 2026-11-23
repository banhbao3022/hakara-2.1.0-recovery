package com.google.android.gms.measurement.internal;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.common.util.DynamiteApi;
import java.util.Iterator;
import java.util.Map;
import java.util.Objects;
import java.util.TreeSet;
import java.util.concurrent.atomic.AtomicReference;
import p007c.p190n.p194b.p266d.p298f.C2622l;
import p007c.p190n.p194b.p266d.p310g.BinderC2800b;
import p007c.p190n.p194b.p266d.p310g.InterfaceC2799a;
import p007c.p190n.p194b.p266d.p314j.p325k.AbstractBinderC4288oc;
import p007c.p190n.p194b.p266d.p314j.p325k.C4145e9;
import p007c.p190n.p194b.p266d.p314j.p325k.C4149f;
import p007c.p190n.p194b.p266d.p314j.p325k.C4300pa;
import p007c.p190n.p194b.p266d.p314j.p325k.InterfaceC4107c;
import p007c.p190n.p194b.p266d.p314j.p325k.InterfaceC4121d;
import p007c.p190n.p194b.p266d.p314j.p325k.InterfaceC4316qc;
import p007c.p190n.p194b.p266d.p327k.p329b.C4453a7;
import p007c.p190n.p194b.p266d.p327k.p329b.C4500e6;
import p007c.p190n.p194b.p266d.p327k.p329b.C4573k7;
import p007c.p190n.p194b.p266d.p327k.p329b.C4585l7;
import p007c.p190n.p194b.p266d.p327k.p329b.C4613o;
import p007c.p190n.p194b.p266d.p327k.p329b.C4625p;
import p007c.p190n.p194b.p266d.p327k.p329b.C4647r;
import p007c.p190n.p194b.p266d.p327k.p329b.C4707w4;
import p007c.p190n.p194b.p266d.p327k.p329b.C4723x9;
import p007c.p190n.p194b.p266d.p327k.p329b.InterfaceC4464b6;
import p007c.p190n.p194b.p266d.p327k.p329b.InterfaceC4730y5;
import p007c.p190n.p194b.p266d.p327k.p329b.RunnableC4456aa;
import p007c.p190n.p194b.p266d.p327k.p329b.RunnableC4466b8;
import p007c.p190n.p194b.p266d.p327k.p329b.RunnableC4468ba;
import p007c.p190n.p194b.p266d.p327k.p329b.RunnableC4476c6;
import p007c.p190n.p194b.p266d.p327k.p329b.RunnableC4477c7;
import p007c.p190n.p194b.p266d.p327k.p329b.RunnableC4479c9;
import p007c.p190n.p194b.p266d.p327k.p329b.RunnableC4512f6;
import p007c.p190n.p194b.p266d.p327k.p329b.RunnableC4548i6;
import p007c.p190n.p194b.p266d.p327k.p329b.RunnableC4560j6;
import p007c.p190n.p194b.p266d.p327k.p329b.RunnableC4572k6;
import p007c.p190n.p194b.p266d.p327k.p329b.RunnableC4608n6;
import p007c.p190n.p194b.p266d.p327k.p329b.RunnableC4620o6;
import p007c.p190n.p194b.p266d.p327k.p329b.RunnableC4687u6;
import p007c.p190n.p194b.p266d.p327k.p329b.RunnableC4698v6;
import p007c.p190n.p194b.p266d.p327k.p329b.RunnableC4709w6;
import p007c.p190n.p194b.p266d.p327k.p329b.RunnableC4720x6;
import p636z0.p691g.ArrayMap;

/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement-sdk@@18.0.0 */
/* JADX INFO: loaded from: classes.dex */
@DynamiteApi
public class AppMeasurementDynamiteService extends AbstractBinderC4288oc {

    /* JADX INFO: renamed from: f */
    public C4707w4 f28699f = null;

    /* JADX INFO: renamed from: g */
    public final Map<Integer, InterfaceC4464b6> f28700g = new ArrayMap();

    /* JADX INFO: renamed from: com.google.android.gms.measurement.internal.AppMeasurementDynamiteService$a */
    /* JADX INFO: compiled from: com.google.android.gms:play-services-measurement-sdk@@18.0.0 */
    public class C5901a implements InterfaceC4730y5 {

        /* JADX INFO: renamed from: a */
        public InterfaceC4107c f28701a;

        public C5901a(InterfaceC4107c interfaceC4107c) {
            this.f28701a = interfaceC4107c;
        }
    }

    /* JADX INFO: renamed from: com.google.android.gms.measurement.internal.AppMeasurementDynamiteService$b */
    /* JADX INFO: compiled from: com.google.android.gms:play-services-measurement-sdk@@18.0.0 */
    public class C5902b implements InterfaceC4464b6 {

        /* JADX INFO: renamed from: a */
        public InterfaceC4107c f28703a;

        public C5902b(InterfaceC4107c interfaceC4107c) {
            this.f28703a = interfaceC4107c;
        }

        @Override // p007c.p190n.p194b.p266d.p327k.p329b.InterfaceC4464b6
        /* JADX INFO: renamed from: a */
        public final void mo10409a(String str, String str2, Bundle bundle, long j2) {
            try {
                this.f28703a.mo9492V3(str, str2, bundle, j2);
            } catch (RemoteException e) {
                AppMeasurementDynamiteService.this.f28699f.mo10684l().f24421i.m10812b("Event listener threw exception", e);
            }
        }
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p325k.InterfaceC4302pc
    public void beginAdUnitExposure(String str, long j2) throws RemoteException {
        m12677i1();
        this.f28699f.m10825A().m10374v(str, j2);
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p325k.InterfaceC4302pc
    public void clearConditionalUserProperty(String str, String str2, Bundle bundle) throws RemoteException {
        m12677i1();
        this.f28699f.m10836s().m10527R(str, str2, bundle);
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p325k.InterfaceC4302pc
    public void clearMeasurementEnabled(long j2) throws RemoteException {
        m12677i1();
        C4500e6 c4500e6M10836s = this.f28699f.m10836s();
        c4500e6M10836s.m10479t();
        c4500e6M10836s.mo10686n().m10758v(new RunnableC4709w6(c4500e6M10836s, null));
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p325k.InterfaceC4302pc
    public void endAdUnitExposure(String str, long j2) throws RemoteException {
        m12677i1();
        this.f28699f.m10825A().m10377y(str, j2);
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p325k.InterfaceC4302pc
    public void generateEventId(InterfaceC4316qc interfaceC4316qc) throws RemoteException {
        m12677i1();
        this.f28699f.m10837t().m10877K(interfaceC4316qc, this.f28699f.m10837t().m10902t0());
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p325k.InterfaceC4302pc
    public void getAppInstanceId(InterfaceC4316qc interfaceC4316qc) throws RemoteException {
        m12677i1();
        this.f28699f.mo10686n().m10758v(new RunnableC4476c6(this, interfaceC4316qc));
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p325k.InterfaceC4302pc
    public void getCachedAppInstanceId(InterfaceC4316qc interfaceC4316qc) throws RemoteException {
        m12677i1();
        this.f28699f.m10837t().m10879M(interfaceC4316qc, this.f28699f.m10836s().f23855g.get());
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p325k.InterfaceC4302pc
    public void getConditionalUserProperties(String str, String str2, InterfaceC4316qc interfaceC4316qc) throws RemoteException {
        m12677i1();
        this.f28699f.mo10686n().m10758v(new RunnableC4479c9(this, interfaceC4316qc, str, str2));
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p325k.InterfaceC4302pc
    public void getCurrentScreenClass(InterfaceC4316qc interfaceC4316qc) throws RemoteException {
        m12677i1();
        C4585l7 c4585l7 = this.f28699f.m10836s().f24476a.m10840w().f24065c;
        this.f28699f.m10837t().m10879M(interfaceC4316qc, c4585l7 != null ? c4585l7.f24122b : null);
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p325k.InterfaceC4302pc
    public void getCurrentScreenName(InterfaceC4316qc interfaceC4316qc) throws RemoteException {
        m12677i1();
        C4585l7 c4585l7 = this.f28699f.m10836s().f24476a.m10840w().f24065c;
        this.f28699f.m10837t().m10879M(interfaceC4316qc, c4585l7 != null ? c4585l7.f24121a : null);
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p325k.InterfaceC4302pc
    public void getGmpAppId(InterfaceC4316qc interfaceC4316qc) throws RemoteException {
        m12677i1();
        this.f28699f.m10837t().m10879M(interfaceC4316qc, this.f28699f.m10836s().m10524O());
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p325k.InterfaceC4302pc
    public void getMaxUserProperties(String str, InterfaceC4316qc interfaceC4316qc) throws RemoteException {
        m12677i1();
        this.f28699f.m10836s();
        C2622l.m5359e(str);
        this.f28699f.m10837t().m10876J(interfaceC4316qc, 25);
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p325k.InterfaceC4302pc
    public void getTestFlag(InterfaceC4316qc interfaceC4316qc, int i) throws RemoteException {
        m12677i1();
        if (i == 0) {
            C4723x9 c4723x9M10837t = this.f28699f.m10837t();
            C4500e6 c4500e6M10836s = this.f28699f.m10836s();
            Objects.requireNonNull(c4500e6M10836s);
            AtomicReference atomicReference = new AtomicReference();
            c4723x9M10837t.m10879M(interfaceC4316qc, (String) c4500e6M10836s.mo10686n().m10755s(atomicReference, 15000L, "String test flag value", new RunnableC4620o6(c4500e6M10836s, atomicReference)));
            return;
        }
        if (i == 1) {
            C4723x9 c4723x9M10837t2 = this.f28699f.m10837t();
            C4500e6 c4500e6M10836s2 = this.f28699f.m10836s();
            Objects.requireNonNull(c4500e6M10836s2);
            AtomicReference atomicReference2 = new AtomicReference();
            c4723x9M10837t2.m10877K(interfaceC4316qc, ((Long) c4500e6M10836s2.mo10686n().m10755s(atomicReference2, 15000L, "long test flag value", new RunnableC4698v6(c4500e6M10836s2, atomicReference2))).longValue());
            return;
        }
        if (i == 2) {
            C4723x9 c4723x9M10837t3 = this.f28699f.m10837t();
            C4500e6 c4500e6M10836s3 = this.f28699f.m10836s();
            Objects.requireNonNull(c4500e6M10836s3);
            AtomicReference atomicReference3 = new AtomicReference();
            double dDoubleValue = ((Double) c4500e6M10836s3.mo10686n().m10755s(atomicReference3, 15000L, "double test flag value", new RunnableC4720x6(c4500e6M10836s3, atomicReference3))).doubleValue();
            Bundle bundle = new Bundle();
            bundle.putDouble("r", dDoubleValue);
            try {
                interfaceC4316qc.mo10100V(bundle);
                return;
            } catch (RemoteException e) {
                c4723x9M10837t3.f24476a.mo10684l().f24421i.m10812b("Error returning double value to wrapper", e);
                return;
            }
        }
        if (i == 3) {
            C4723x9 c4723x9M10837t4 = this.f28699f.m10837t();
            C4500e6 c4500e6M10836s4 = this.f28699f.m10836s();
            Objects.requireNonNull(c4500e6M10836s4);
            AtomicReference atomicReference4 = new AtomicReference();
            c4723x9M10837t4.m10876J(interfaceC4316qc, ((Integer) c4500e6M10836s4.mo10686n().m10755s(atomicReference4, 15000L, "int test flag value", new RunnableC4687u6(c4500e6M10836s4, atomicReference4))).intValue());
            return;
        }
        if (i != 4) {
            return;
        }
        C4723x9 c4723x9M10837t5 = this.f28699f.m10837t();
        C4500e6 c4500e6M10836s5 = this.f28699f.m10836s();
        Objects.requireNonNull(c4500e6M10836s5);
        AtomicReference atomicReference5 = new AtomicReference();
        c4723x9M10837t5.m10881O(interfaceC4316qc, ((Boolean) c4500e6M10836s5.mo10686n().m10755s(atomicReference5, 15000L, "boolean test flag value", new RunnableC4512f6(c4500e6M10836s5, atomicReference5))).booleanValue());
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p325k.InterfaceC4302pc
    public void getUserProperties(String str, String str2, boolean z, InterfaceC4316qc interfaceC4316qc) throws RemoteException {
        m12677i1();
        this.f28699f.mo10686n().m10758v(new RunnableC4477c7(this, interfaceC4316qc, str, str2, z));
    }

    /* JADX INFO: renamed from: i1 */
    public final void m12677i1() {
        if (this.f28699f == null) {
            throw new IllegalStateException("Attempting to perform action before initialize.");
        }
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p325k.InterfaceC4302pc
    public void initForTests(Map map) throws RemoteException {
        m12677i1();
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p325k.InterfaceC4302pc
    public void initialize(InterfaceC2799a interfaceC2799a, C4149f c4149f, long j2) throws RemoteException {
        Context context = (Context) BinderC2800b.m5639T1(interfaceC2799a);
        C4707w4 c4707w4 = this.f28699f;
        if (c4707w4 == null) {
            this.f28699f = C4707w4.m10821b(context, c4149f, Long.valueOf(j2));
        } else {
            c4707w4.mo10684l().f24421i.m10811a("Attempting to initialize multiple times");
        }
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p325k.InterfaceC4302pc
    public void isDataCollectionEnabled(InterfaceC4316qc interfaceC4316qc) throws RemoteException {
        m12677i1();
        this.f28699f.mo10686n().m10758v(new RunnableC4468ba(this, interfaceC4316qc));
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p325k.InterfaceC4302pc
    public void logEvent(String str, String str2, Bundle bundle, boolean z, boolean z2, long j2) throws RemoteException {
        m12677i1();
        this.f28699f.m10836s().m10518I(str, str2, bundle, z, z2, j2);
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p325k.InterfaceC4302pc
    public void logEventAndBundle(String str, String str2, Bundle bundle, InterfaceC4316qc interfaceC4316qc, long j2) throws RemoteException {
        m12677i1();
        C2622l.m5359e(str2);
        (bundle != null ? new Bundle(bundle) : new Bundle()).putString("_o", "app");
        this.f28699f.mo10686n().m10758v(new RunnableC4466b8(this, interfaceC4316qc, new C4625p(str2, new C4613o(bundle), "app", j2), str));
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p325k.InterfaceC4302pc
    public void logHealthData(int i, String str, InterfaceC2799a interfaceC2799a, InterfaceC2799a interfaceC2799a2, InterfaceC2799a interfaceC2799a3) throws RemoteException {
        m12677i1();
        this.f28699f.mo10684l().m10749w(i, true, false, str, interfaceC2799a == null ? null : BinderC2800b.m5639T1(interfaceC2799a), interfaceC2799a2 == null ? null : BinderC2800b.m5639T1(interfaceC2799a2), interfaceC2799a3 != null ? BinderC2800b.m5639T1(interfaceC2799a3) : null);
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p325k.InterfaceC4302pc
    public void onActivityCreated(InterfaceC2799a interfaceC2799a, Bundle bundle, long j2) throws RemoteException {
        m12677i1();
        C4453a7 c4453a7 = this.f28699f.m10836s().f23851c;
        if (c4453a7 != null) {
            this.f28699f.m10836s().m10522M();
            c4453a7.onActivityCreated((Activity) BinderC2800b.m5639T1(interfaceC2799a), bundle);
        }
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p325k.InterfaceC4302pc
    public void onActivityDestroyed(InterfaceC2799a interfaceC2799a, long j2) throws RemoteException {
        m12677i1();
        C4453a7 c4453a7 = this.f28699f.m10836s().f23851c;
        if (c4453a7 != null) {
            this.f28699f.m10836s().m10522M();
            c4453a7.onActivityDestroyed((Activity) BinderC2800b.m5639T1(interfaceC2799a));
        }
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p325k.InterfaceC4302pc
    public void onActivityPaused(InterfaceC2799a interfaceC2799a, long j2) throws RemoteException {
        m12677i1();
        C4453a7 c4453a7 = this.f28699f.m10836s().f23851c;
        if (c4453a7 != null) {
            this.f28699f.m10836s().m10522M();
            c4453a7.onActivityPaused((Activity) BinderC2800b.m5639T1(interfaceC2799a));
        }
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p325k.InterfaceC4302pc
    public void onActivityResumed(InterfaceC2799a interfaceC2799a, long j2) throws RemoteException {
        m12677i1();
        C4453a7 c4453a7 = this.f28699f.m10836s().f23851c;
        if (c4453a7 != null) {
            this.f28699f.m10836s().m10522M();
            c4453a7.onActivityResumed((Activity) BinderC2800b.m5639T1(interfaceC2799a));
        }
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p325k.InterfaceC4302pc
    public void onActivitySaveInstanceState(InterfaceC2799a interfaceC2799a, InterfaceC4316qc interfaceC4316qc, long j2) throws RemoteException {
        m12677i1();
        C4453a7 c4453a7 = this.f28699f.m10836s().f23851c;
        Bundle bundle = new Bundle();
        if (c4453a7 != null) {
            this.f28699f.m10836s().m10522M();
            c4453a7.onActivitySaveInstanceState((Activity) BinderC2800b.m5639T1(interfaceC2799a), bundle);
        }
        try {
            interfaceC4316qc.mo10100V(bundle);
        } catch (RemoteException e) {
            this.f28699f.mo10684l().f24421i.m10812b("Error returning bundle value to wrapper", e);
        }
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p325k.InterfaceC4302pc
    public void onActivityStarted(InterfaceC2799a interfaceC2799a, long j2) throws RemoteException {
        m12677i1();
        if (this.f28699f.m10836s().f23851c != null) {
            this.f28699f.m10836s().m10522M();
        }
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p325k.InterfaceC4302pc
    public void onActivityStopped(InterfaceC2799a interfaceC2799a, long j2) throws RemoteException {
        m12677i1();
        if (this.f28699f.m10836s().f23851c != null) {
            this.f28699f.m10836s().m10522M();
        }
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p325k.InterfaceC4302pc
    public void performAction(Bundle bundle, InterfaceC4316qc interfaceC4316qc, long j2) throws RemoteException {
        m12677i1();
        interfaceC4316qc.mo10100V(null);
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p325k.InterfaceC4302pc
    public void registerOnMeasurementEventListener(InterfaceC4107c interfaceC4107c) throws RemoteException {
        InterfaceC4464b6 c5902b;
        m12677i1();
        synchronized (this.f28700g) {
            c5902b = this.f28700g.get(Integer.valueOf(interfaceC4107c.zza()));
            if (c5902b == null) {
                c5902b = new C5902b(interfaceC4107c);
                this.f28700g.put(Integer.valueOf(interfaceC4107c.zza()), c5902b);
            }
        }
        C4500e6 c4500e6M10836s = this.f28699f.m10836s();
        c4500e6M10836s.m10479t();
        if (c4500e6M10836s.f23853e.add(c5902b)) {
            return;
        }
        c4500e6M10836s.mo10684l().f24421i.m10811a("OnEventListener already registered");
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p325k.InterfaceC4302pc
    public void resetAnalyticsData(long j2) throws RemoteException {
        m12677i1();
        C4500e6 c4500e6M10836s = this.f28699f.m10836s();
        c4500e6M10836s.f23855g.set(null);
        c4500e6M10836s.mo10686n().m10758v(new RunnableC4608n6(c4500e6M10836s, j2));
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p325k.InterfaceC4302pc
    public void setConditionalUserProperty(Bundle bundle, long j2) throws RemoteException {
        m12677i1();
        if (bundle == null) {
            this.f28699f.mo10684l().f24418f.m10811a("Conditional user property must not be null");
        } else {
            this.f28699f.m10836s().m10530y(bundle, j2);
        }
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p325k.InterfaceC4302pc
    public void setConsent(Bundle bundle, long j2) throws RemoteException {
        m12677i1();
        C4500e6 c4500e6M10836s = this.f28699f.m10836s();
        if (C4145e9.m9566a() && c4500e6M10836s.f24476a.f24534h.m10423u(null, C4647r.f24311H0)) {
            c4500e6M10836s.m10529x(bundle, 30, j2);
        }
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p325k.InterfaceC4302pc
    public void setConsentThirdParty(Bundle bundle, long j2) throws RemoteException {
        m12677i1();
        C4500e6 c4500e6M10836s = this.f28699f.m10836s();
        if (C4145e9.m9566a() && c4500e6M10836s.f24476a.f24534h.m10423u(null, C4647r.f24313I0)) {
            c4500e6M10836s.m10529x(bundle, 10, j2);
        }
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p325k.InterfaceC4302pc
    public void setCurrentScreen(InterfaceC2799a interfaceC2799a, String str, String str2, long j2) throws RemoteException {
        m12677i1();
        C4573k7 c4573k7M10840w = this.f28699f.m10840w();
        Activity activity = (Activity) BinderC2800b.m5639T1(interfaceC2799a);
        if (!c4573k7M10840w.f24476a.f24534h.m10428z().booleanValue()) {
            c4573k7M10840w.mo10684l().f24423k.m10811a("setCurrentScreen cannot be called while screen reporting is disabled.");
            return;
        }
        if (c4573k7M10840w.f24065c == null) {
            c4573k7M10840w.mo10684l().f24423k.m10811a("setCurrentScreen cannot be called while no activity active");
            return;
        }
        if (c4573k7M10840w.f24068f.get(activity) == null) {
            c4573k7M10840w.mo10684l().f24423k.m10811a("setCurrentScreen must be called with an activity in the activity lifecycle");
            return;
        }
        if (str2 == null) {
            str2 = C4573k7.m10623x(activity.getClass().getCanonicalName());
        }
        boolean zM10864q0 = C4723x9.m10864q0(c4573k7M10840w.f24065c.f24122b, str2);
        boolean zM10864q1 = C4723x9.m10864q0(c4573k7M10840w.f24065c.f24121a, str);
        if (zM10864q0 && zM10864q1) {
            c4573k7M10840w.mo10684l().f24423k.m10811a("setCurrentScreen cannot be called with the same class and name");
            return;
        }
        if (str != null && (str.length() <= 0 || str.length() > 100)) {
            c4573k7M10840w.mo10684l().f24423k.m10812b("Invalid screen name length in setCurrentScreen. Length", Integer.valueOf(str.length()));
            return;
        }
        if (str2 != null && (str2.length() <= 0 || str2.length() > 100)) {
            c4573k7M10840w.mo10684l().f24423k.m10812b("Invalid class name length in setCurrentScreen. Length", Integer.valueOf(str2.length()));
            return;
        }
        c4573k7M10840w.mo10684l().f24426n.m10813c("Setting current screen to name, class", str == null ? "null" : str, str2);
        C4585l7 c4585l7 = new C4585l7(str, str2, c4573k7M10840w.m10817f().m10902t0());
        c4573k7M10840w.f24068f.put(activity, c4585l7);
        c4573k7M10840w.m10630z(activity, c4585l7, true);
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p325k.InterfaceC4302pc
    public void setDataCollectionEnabled(boolean z) throws RemoteException {
        m12677i1();
        C4500e6 c4500e6M10836s = this.f28699f.m10836s();
        c4500e6M10836s.m10479t();
        c4500e6M10836s.mo10686n().m10758v(new RunnableC4548i6(c4500e6M10836s, z));
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p325k.InterfaceC4302pc
    public void setDefaultEventParameters(Bundle bundle) {
        m12677i1();
        final C4500e6 c4500e6M10836s = this.f28699f.m10836s();
        final Bundle bundle2 = bundle == null ? null : new Bundle(bundle);
        c4500e6M10836s.mo10686n().m10758v(new Runnable(c4500e6M10836s, bundle2) { // from class: c.n.b.d.k.b.d6

            /* JADX INFO: renamed from: f */
            public final C4500e6 f23832f;

            /* JADX INFO: renamed from: g */
            public final Bundle f23833g;

            {
                this.f23832f = c4500e6M10836s;
                this.f23833g = bundle2;
            }

            @Override // java.lang.Runnable
            public final void run() {
                boolean z;
                C4500e6 c4500e6 = this.f23832f;
                Bundle bundle3 = this.f23833g;
                Objects.requireNonNull(c4500e6);
                if (C4300pa.m10143a() && c4500e6.f24476a.f24534h.m10417k(C4647r.f24388z0)) {
                    if (bundle3 == null) {
                        c4500e6.m10818g().f23888D.m10621b(new Bundle());
                        return;
                    }
                    Bundle bundleM10620a = c4500e6.m10818g().f23888D.m10620a();
                    for (String str : bundle3.keySet()) {
                        Object obj = bundle3.get(str);
                        if (obj != null && !(obj instanceof String) && !(obj instanceof Long) && !(obj instanceof Double)) {
                            c4500e6.m10817f();
                            if (C4723x9.m10856W(obj)) {
                                c4500e6.m10817f().m10884R(c4500e6.f23864p, 27, null, null, 0);
                            }
                            c4500e6.mo10684l().f24423k.m10813c("Invalid default event parameter type. Name, value", str, obj);
                        } else if (C4723x9.m10865r0(str)) {
                            c4500e6.mo10684l().f24423k.m10812b("Invalid default event parameter name. Name", str);
                        } else if (obj == null) {
                            bundleM10620a.remove(str);
                        } else if (c4500e6.m10817f().m10890b0("param", str, 100, obj)) {
                            c4500e6.m10817f().m10875I(bundleM10620a, str, obj);
                        }
                    }
                    c4500e6.m10817f();
                    int iM10422t = c4500e6.f24476a.f24534h.m10422t();
                    if (bundleM10620a.size() > iM10422t) {
                        Iterator it = new TreeSet(bundleM10620a.keySet()).iterator();
                        int i = 0;
                        while (true) {
                            z = true;
                            if (!it.hasNext()) {
                                break;
                            }
                            String str2 = (String) it.next();
                            i++;
                            if (i > iM10422t) {
                                bundleM10620a.remove(str2);
                            }
                        }
                    } else {
                        z = false;
                    }
                    if (z) {
                        c4500e6.m10817f().m10884R(c4500e6.f23864p, 26, null, null, 0);
                        c4500e6.mo10684l().f24423k.m10811a("Too many default event parameters set. Discarding beyond event parameter limit");
                    }
                    c4500e6.m10818g().f23888D.m10621b(bundleM10620a);
                    C4677t7 c4677t7M10385p = c4500e6.m10385p();
                    c4677t7M10385p.mo10381b();
                    c4677t7M10385p.m10479t();
                    c4677t7M10385p.m10778z(new RunnableC4490d8(c4677t7M10385p, bundleM10620a, c4677t7M10385p.m10775I(false)));
                }
            }
        });
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p325k.InterfaceC4302pc
    public void setEventInterceptor(InterfaceC4107c interfaceC4107c) throws RemoteException {
        m12677i1();
        C5901a c5901a = new C5901a(interfaceC4107c);
        if (this.f28699f.mo10686n().m10761y()) {
            this.f28699f.m10836s().m10512B(c5901a);
        } else {
            this.f28699f.mo10686n().m10758v(new RunnableC4456aa(this, c5901a));
        }
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p325k.InterfaceC4302pc
    public void setInstanceIdProvider(InterfaceC4121d interfaceC4121d) throws RemoteException {
        m12677i1();
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p325k.InterfaceC4302pc
    public void setMeasurementEnabled(boolean z, long j2) throws RemoteException {
        m12677i1();
        C4500e6 c4500e6M10836s = this.f28699f.m10836s();
        Boolean boolValueOf = Boolean.valueOf(z);
        c4500e6M10836s.m10479t();
        c4500e6M10836s.mo10686n().m10758v(new RunnableC4709w6(c4500e6M10836s, boolValueOf));
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p325k.InterfaceC4302pc
    public void setMinimumSessionDuration(long j2) throws RemoteException {
        m12677i1();
        C4500e6 c4500e6M10836s = this.f28699f.m10836s();
        c4500e6M10836s.mo10686n().m10758v(new RunnableC4572k6(c4500e6M10836s, j2));
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p325k.InterfaceC4302pc
    public void setSessionTimeoutDuration(long j2) throws RemoteException {
        m12677i1();
        C4500e6 c4500e6M10836s = this.f28699f.m10836s();
        c4500e6M10836s.mo10686n().m10758v(new RunnableC4560j6(c4500e6M10836s, j2));
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p325k.InterfaceC4302pc
    public void setUserId(String str, long j2) throws RemoteException {
        m12677i1();
        this.f28699f.m10836s().m10521L(null, "_id", str, true, j2);
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p325k.InterfaceC4302pc
    public void setUserProperty(String str, String str2, InterfaceC2799a interfaceC2799a, boolean z, long j2) throws RemoteException {
        m12677i1();
        this.f28699f.m10836s().m10521L(str, str2, BinderC2800b.m5639T1(interfaceC2799a), z, j2);
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p325k.InterfaceC4302pc
    public void unregisterOnMeasurementEventListener(InterfaceC4107c interfaceC4107c) throws RemoteException {
        InterfaceC4464b6 interfaceC4464b6Remove;
        m12677i1();
        synchronized (this.f28700g) {
            interfaceC4464b6Remove = this.f28700g.remove(Integer.valueOf(interfaceC4107c.zza()));
        }
        if (interfaceC4464b6Remove == null) {
            interfaceC4464b6Remove = new C5902b(interfaceC4107c);
        }
        C4500e6 c4500e6M10836s = this.f28699f.m10836s();
        c4500e6M10836s.m10479t();
        if (c4500e6M10836s.f23853e.remove(interfaceC4464b6Remove)) {
            return;
        }
        c4500e6M10836s.mo10684l().f24421i.m10811a("OnEventListener had not been registered");
    }
}
