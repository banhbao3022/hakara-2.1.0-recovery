package p007c.p190n.p194b.p266d.p327k.p329b;

import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteException;
import android.os.Binder;
import android.os.Bundle;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicBoolean;
import p007c.p190n.p194b.p266d.p298f.C2618j;
import p007c.p190n.p194b.p266d.p298f.C2620k;
import p007c.p190n.p194b.p266d.p298f.C2622l;
import p007c.p190n.p194b.p266d.p314j.p325k.AbstractC4099b5;
import p007c.p190n.p194b.p266d.p314j.p325k.C4123d1;
import p007c.p190n.p194b.p266d.p314j.p325k.C4145e9;
import p007c.p190n.p194b.p266d.p314j.p325k.C4151f1;
import p007c.p190n.p194b.p266d.p314j.p325k.C4300pa;

/* JADX INFO: renamed from: c.n.b.d.k.b.b5 */
/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement@@18.0.0 */
/* JADX INFO: loaded from: classes.dex */
public final class BinderC4463b5 extends AbstractBinderC4605n3 {

    /* JADX INFO: renamed from: f */
    public final C4611n9 f23726f;

    /* JADX INFO: renamed from: g */
    public Boolean f23727g;

    /* JADX INFO: renamed from: h */
    public String f23728h;

    public BinderC4463b5(C4611n9 c4611n9) {
        Objects.requireNonNull(c4611n9, "null reference");
        this.f23726f = c4611n9;
        this.f23728h = null;
    }

    @Override // p007c.p190n.p194b.p266d.p327k.p329b.InterfaceC4569k3
    /* JADX INFO: renamed from: I1 */
    public final List<C4712w9> mo10390I1(String str, String str2, String str3, boolean z) {
        m10391K2(str, true);
        try {
            List<C4734y9> list = (List) ((FutureTask) this.f23726f.mo10686n().m10756t(new CallableC4547i5(this, str, str2, str3))).get();
            ArrayList arrayList = new ArrayList(list.size());
            for (C4734y9 c4734y9 : list) {
                if (z || !C4723x9.m10865r0(c4734y9.f24612c)) {
                    arrayList.add(new C4712w9(c4734y9));
                }
            }
            return arrayList;
        } catch (InterruptedException | ExecutionException e) {
            this.f23726f.mo10684l().f24418f.m10813c("Failed to get user properties as. appId", C4662s3.m10738s(str), e);
            return Collections.emptyList();
        }
    }

    /* JADX INFO: renamed from: K2 */
    public final void m10391K2(String str, boolean z) {
        if (TextUtils.isEmpty(str)) {
            this.f23726f.mo10684l().f24418f.m10811a("Measurement Service called without app package");
            throw new SecurityException("Measurement Service called without app package");
        }
        if (z) {
            try {
                if (this.f23727g == null) {
                    this.f23727g = Boolean.valueOf("com.google.android.gms".equals(this.f23728h) || C2622l.m5227B(this.f23726f.f24201k.f24528b, Binder.getCallingUid()) || C2620k.m5218a(this.f23726f.f24201k.f24528b).m5221b(Binder.getCallingUid()));
                }
                if (this.f23727g.booleanValue()) {
                    return;
                }
            } catch (SecurityException e) {
                this.f23726f.mo10684l().f24418f.m10812b("Measurement Service called with invalid calling package. appId", C4662s3.m10738s(str));
                throw e;
            }
        }
        if (this.f23728h == null) {
            Context context = this.f23726f.f24201k.f24528b;
            int callingUid = Binder.getCallingUid();
            AtomicBoolean atomicBoolean = C2618j.f11583a;
            if (C2622l.m5287N(context, callingUid, str)) {
                this.f23728h = str;
            }
        }
        if (str.equals(this.f23728h)) {
        } else {
            throw new SecurityException(String.format("Unknown calling package name '%s'.", str));
        }
    }

    /* JADX INFO: renamed from: T1 */
    public final void m10392T1(Runnable runnable) {
        if (this.f23726f.mo10686n().m10761y()) {
            runnable.run();
        } else {
            this.f23726f.mo10686n().m10758v(runnable);
        }
    }

    @Override // p007c.p190n.p194b.p266d.p327k.p329b.InterfaceC4569k3
    /* JADX INFO: renamed from: W2 */
    public final void mo10393W2(long j2, String str, String str2, String str3) {
        m10392T1(new RunnableC4653r5(this, str2, str3, str, j2));
    }

    @Override // p007c.p190n.p194b.p266d.p327k.p329b.InterfaceC4569k3
    /* JADX INFO: renamed from: X0 */
    public final byte[] mo10394X0(C4625p c4625p, String str) {
        C2622l.m5359e(str);
        Objects.requireNonNull(c4625p, "null reference");
        m10391K2(str, true);
        this.f23726f.mo10684l().f24425m.m10812b("Log and bundle. event", this.f23726f.m10667O().m10718u(c4625p.f24249f));
        long jMo5622b = this.f23726f.f24201k.f24541o.mo5622b() / 1000000;
        C4674t4 c4674t4Mo10686n = this.f23726f.mo10686n();
        CallableC4607n5 callableC4607n5 = new CallableC4607n5(this, c4625p, str);
        c4674t4Mo10686n.m10763k();
        C4685u4<?> c4685u4 = new C4685u4<>(c4674t4Mo10686n, (Callable<?>) callableC4607n5, true, "Task exception on worker thread");
        if (Thread.currentThread() == c4674t4Mo10686n.f24440d) {
            c4685u4.run();
        } else {
            c4674t4Mo10686n.m10757u(c4685u4);
        }
        try {
            byte[] bArr = (byte[]) c4685u4.get();
            if (bArr == null) {
                this.f23726f.mo10684l().f24418f.m10812b("Log and bundle returned null. appId", C4662s3.m10738s(str));
                bArr = new byte[0];
            }
            this.f23726f.mo10684l().f24425m.m10814d("Log and bundle processed. event, size, time_ms", this.f23726f.m10667O().m10718u(c4625p.f24249f), Integer.valueOf(bArr.length), Long.valueOf((this.f23726f.f24201k.f24541o.mo5622b() / 1000000) - jMo5622b));
            return bArr;
        } catch (InterruptedException | ExecutionException e) {
            this.f23726f.mo10684l().f24418f.m10814d("Failed to log and bundle. appId, event, error", C4662s3.m10738s(str), this.f23726f.m10667O().m10718u(c4625p.f24249f), e);
            return null;
        }
    }

    @Override // p007c.p190n.p194b.p266d.p327k.p329b.InterfaceC4569k3
    /* JADX INFO: renamed from: X5 */
    public final void mo10395X5(C4712w9 c4712w9, C4480ca c4480ca) {
        Objects.requireNonNull(c4712w9, "null reference");
        m10403q3(c4480ca);
        m10392T1(new RunnableC4642q5(this, c4712w9, c4480ca));
    }

    @Override // p007c.p190n.p194b.p266d.p327k.p329b.InterfaceC4569k3
    /* JADX INFO: renamed from: a3 */
    public final void mo10396a3(C4480ca c4480ca) {
        m10391K2(c4480ca.f23798f, false);
        m10392T1(new RunnableC4559j5(this, c4480ca));
    }

    @Override // p007c.p190n.p194b.p266d.p327k.p329b.InterfaceC4569k3
    /* JADX INFO: renamed from: b3 */
    public final List<C4624oa> mo10397b3(String str, String str2, String str3) {
        m10391K2(str, true);
        try {
            return (List) ((FutureTask) this.f23726f.mo10686n().m10756t(new CallableC4571k5(this, str, str2, str3))).get();
        } catch (InterruptedException | ExecutionException e) {
            this.f23726f.mo10684l().f24418f.m10812b("Failed to get conditional user properties as", e);
            return Collections.emptyList();
        }
    }

    @Override // p007c.p190n.p194b.p266d.p327k.p329b.InterfaceC4569k3
    /* JADX INFO: renamed from: d1 */
    public final void mo10398d1(C4480ca c4480ca) {
        if (C4145e9.m9566a() && this.f23726f.f24201k.f24534h.m10417k(C4647r.f24315J0)) {
            C2622l.m5359e(c4480ca.f23798f);
            Objects.requireNonNull(c4480ca.f23797B, "null reference");
            RunnableC4595m5 runnableC4595m5 = new RunnableC4595m5(this, c4480ca);
            if (this.f23726f.mo10686n().m10761y()) {
                runnableC4595m5.run();
            } else {
                this.f23726f.mo10686n().m10759w(runnableC4595m5);
            }
        }
    }

    @Override // p007c.p190n.p194b.p266d.p327k.p329b.InterfaceC4569k3
    /* JADX INFO: renamed from: g3 */
    public final List<C4624oa> mo10399g3(String str, String str2, C4480ca c4480ca) {
        m10403q3(c4480ca);
        try {
            return (List) ((FutureTask) this.f23726f.mo10686n().m10756t(new CallableC4535h5(this, c4480ca, str, str2))).get();
        } catch (InterruptedException | ExecutionException e) {
            this.f23726f.mo10684l().f24418f.m10812b("Failed to get conditional user properties", e);
            return Collections.emptyList();
        }
    }

    @Override // p007c.p190n.p194b.p266d.p327k.p329b.InterfaceC4569k3
    /* JADX INFO: renamed from: g6 */
    public final void mo10400g6(C4624oa c4624oa, C4480ca c4480ca) {
        Objects.requireNonNull(c4624oa, "null reference");
        Objects.requireNonNull(c4624oa.f24240h, "null reference");
        m10403q3(c4480ca);
        C4624oa c4624oa2 = new C4624oa(c4624oa);
        c4624oa2.f24238f = c4480ca.f23798f;
        m10392T1(new RunnableC4487d5(this, c4624oa2, c4480ca));
    }

    /* JADX INFO: renamed from: i1 */
    public final void m10401i1(C4624oa c4624oa) {
        Objects.requireNonNull(c4624oa, "null reference");
        Objects.requireNonNull(c4624oa.f24240h, "null reference");
        m10391K2(c4624oa.f24238f, true);
        m10392T1(new RunnableC4523g5(this, new C4624oa(c4624oa)));
    }

    @Override // p007c.p190n.p194b.p266d.p327k.p329b.InterfaceC4569k3
    /* JADX INFO: renamed from: m2 */
    public final String mo10402m2(C4480ca c4480ca) {
        m10403q3(c4480ca);
        C4611n9 c4611n9 = this.f23726f;
        try {
            return (String) ((FutureTask) c4611n9.f24201k.mo10686n().m10756t(new CallableC4657r9(c4611n9, c4480ca))).get(30000L, TimeUnit.MILLISECONDS);
        } catch (InterruptedException | ExecutionException | TimeoutException e) {
            c4611n9.f24201k.mo10684l().f24418f.m10813c("Failed to get app instance id. appId", C4662s3.m10738s(c4480ca.f23798f), e);
            return null;
        }
    }

    /* JADX INFO: renamed from: q3 */
    public final void m10403q3(C4480ca c4480ca) {
        Objects.requireNonNull(c4480ca, "null reference");
        m10391K2(c4480ca.f23798f, false);
        this.f23726f.f24201k.m10837t().m10891c0(c4480ca.f23799g, c4480ca.f23815w, c4480ca.f23796A);
    }

    @Override // p007c.p190n.p194b.p266d.p327k.p329b.InterfaceC4569k3
    /* JADX INFO: renamed from: q4 */
    public final void mo10404q4(C4480ca c4480ca) {
        m10403q3(c4480ca);
        m10392T1(new RunnableC4499e5(this, c4480ca));
    }

    @Override // p007c.p190n.p194b.p266d.p327k.p329b.InterfaceC4569k3
    /* JADX INFO: renamed from: r5 */
    public final void mo10405r5(C4625p c4625p, C4480ca c4480ca) {
        Objects.requireNonNull(c4625p, "null reference");
        m10403q3(c4480ca);
        m10392T1(new RunnableC4583l5(this, c4625p, c4480ca));
    }

    @Override // p007c.p190n.p194b.p266d.p327k.p329b.InterfaceC4569k3
    /* JADX INFO: renamed from: u5 */
    public final void mo10406u5(final Bundle bundle, final C4480ca c4480ca) {
        if (C4300pa.m10143a() && this.f23726f.f24201k.f24534h.m10417k(C4647r.f24297A0)) {
            m10403q3(c4480ca);
            m10392T1(new Runnable(this, c4480ca, bundle) { // from class: c.n.b.d.k.b.a5

                /* JADX INFO: renamed from: f */
                public final BinderC4463b5 f23703f;

                /* JADX INFO: renamed from: g */
                public final C4480ca f23704g;

                /* JADX INFO: renamed from: h */
                public final Bundle f23705h;

                {
                    this.f23703f = this;
                    this.f23704g = c4480ca;
                    this.f23705h = bundle;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    C4613o c4613o;
                    BinderC4463b5 binderC4463b5 = this.f23703f;
                    C4480ca c4480ca2 = this.f23704g;
                    Bundle bundle2 = this.f23705h;
                    C4517g c4517gM10663K = binderC4463b5.f23726f.m10663K();
                    String str = c4480ca2.f23798f;
                    c4517gM10663K.mo10381b();
                    c4517gM10663K.m10642i();
                    C4707w4 c4707w4 = c4517gM10663K.f24476a;
                    C2622l.m5359e(str);
                    C2622l.m5359e("dep");
                    TextUtils.isEmpty("");
                    if (bundle2 == null || bundle2.isEmpty()) {
                        c4613o = new C4613o(new Bundle());
                    } else {
                        Bundle bundle3 = new Bundle(bundle2);
                        Iterator<String> it = bundle3.keySet().iterator();
                        while (it.hasNext()) {
                            String next = it.next();
                            if (next == null) {
                                c4707w4.mo10684l().f24418f.m10811a("Param name can't be null");
                                it.remove();
                            } else {
                                Object objM10872D = c4707w4.m10837t().m10872D(next, bundle3.get(next));
                                if (objM10872D == null) {
                                    c4707w4.mo10684l().f24421i.m10812b("Param value can't be null", c4707w4.m10838u().m10720x(next));
                                    it.remove();
                                } else {
                                    c4707w4.m10837t().m10875I(bundle3, next, objM10872D);
                                }
                            }
                        }
                        c4613o = new C4613o(bundle3);
                    }
                    C4679t9 c4679t9M10641h = c4517gM10663K.m10641h();
                    C4123d1.a aVarM9510K = C4123d1.m9510K();
                    if (aVarM9510K.f23087h) {
                        aVarM9510K.m9431r();
                        aVarM9510K.f23087h = false;
                    }
                    C4123d1.m9509C((C4123d1) aVarM9510K.f23086g, 0L);
                    for (String str2 : c4613o.f24221f.keySet()) {
                        C4151f1.a aVarM9571O = C4151f1.m9571O();
                        aVarM9571O.m9593x(str2);
                        c4679t9M10641h.m10798F(aVarM9571O, c4613o.m10701H(str2));
                        aVarM9510K.m9537x(aVarM9571O);
                    }
                    byte[] bArrM10139f = ((C4123d1) ((AbstractC4099b5) aVarM9510K.m9433t())).m10139f();
                    c4517gM10663K.mo10684l().f24426n.m10813c("Saving default event parameters, appId, data size", c4517gM10663K.m10816e().m10718u(str), Integer.valueOf(bArrM10139f.length));
                    ContentValues contentValues = new ContentValues();
                    contentValues.put("app_id", str);
                    contentValues.put("parameters", bArrM10139f);
                    try {
                        if (c4517gM10663K.m10579t().insertWithOnConflict("default_event_params", null, contentValues, 5) == -1) {
                            c4517gM10663K.mo10684l().f24418f.m10812b("Failed to insert default event parameters (got -1). appId", C4662s3.m10738s(str));
                        }
                    } catch (SQLiteException e) {
                        c4517gM10663K.mo10684l().f24418f.m10813c("Error storing default event parameters. appId", C4662s3.m10738s(str), e);
                    }
                }
            });
        }
    }

    @Override // p007c.p190n.p194b.p266d.p327k.p329b.InterfaceC4569k3
    /* JADX INFO: renamed from: v3 */
    public final List<C4712w9> mo10407v3(String str, String str2, boolean z, C4480ca c4480ca) {
        m10403q3(c4480ca);
        try {
            List<C4734y9> list = (List) ((FutureTask) this.f23726f.mo10686n().m10756t(new CallableC4511f5(this, c4480ca, str, str2))).get();
            ArrayList arrayList = new ArrayList(list.size());
            for (C4734y9 c4734y9 : list) {
                if (z || !C4723x9.m10865r0(c4734y9.f24612c)) {
                    arrayList.add(new C4712w9(c4734y9));
                }
            }
            return arrayList;
        } catch (InterruptedException | ExecutionException e) {
            this.f23726f.mo10684l().f24418f.m10813c("Failed to query user properties. appId", C4662s3.m10738s(c4480ca.f23798f), e);
            return Collections.emptyList();
        }
    }

    @Override // p007c.p190n.p194b.p266d.p327k.p329b.InterfaceC4569k3
    /* JADX INFO: renamed from: y3 */
    public final void mo10408y3(C4480ca c4480ca) {
        m10403q3(c4480ca);
        m10392T1(new RunnableC4664s5(this, c4480ca));
    }
}
