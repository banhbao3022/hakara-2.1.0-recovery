package p007c.p190n.p194b.p266d.p314j.p315a;

import android.content.Context;
import android.os.Bundle;
import android.os.RemoteException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.Callable;
import java.util.concurrent.TimeUnit;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import p007c.p190n.p194b.p209b.p263z1.C2096e;
import p007c.p190n.p194b.p266d.p267a.p282z.C2330u;
import p007c.p190n.p194b.p266d.p298f.C2622l;
import p007c.p190n.p194b.p266d.p310g.BinderC2800b;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* JADX INFO: loaded from: classes.dex */
public final class jq0 implements dv1<String> {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ lq0 f15705a;

    public jq0(lq0 lq0Var) {
        this.f15705a = lq0Var;
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.dv1
    /* JADX INFO: renamed from: a */
    public final void mo4616a(Throwable th) {
        synchronized (this) {
            lq0 lq0Var = this.f15705a;
            lq0Var.f16444c = true;
            lq0Var.f16455n.put("com.google.android.gms.ads.MobileAds", new C3762z9("com.google.android.gms.ads.MobileAds", false, (int) (C2330u.f10884a.f10896k.mo5621a() - this.f15705a.f16445d), "Internal Error."));
            this.f15705a.f16446e.m7287b(new Exception());
        }
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.dv1
    /* JADX INFO: renamed from: b */
    public final void mo4617b(String str) {
        final String str2 = str;
        synchronized (this) {
            lq0 lq0Var = this.f15705a;
            lq0Var.f16444c = true;
            lq0Var.f16455n.put("com.google.android.gms.ads.MobileAds", new C3762z9("com.google.android.gms.ads.MobileAds", true, (int) (C2330u.f10884a.f10896k.mo5621a() - this.f15705a.f16445d), ""));
            this.f15705a.f16450i.execute(new Runnable(this, str2) { // from class: c.n.b.d.j.a.iq0

                /* JADX INFO: renamed from: f */
                public final jq0 f15338f;

                /* JADX INFO: renamed from: g */
                public final String f15339g;

                {
                    this.f15338f = this;
                    this.f15339g = str2;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    JSONObject jSONObject;
                    jq0 jq0Var = this.f15338f;
                    String str3 = this.f15339g;
                    lq0 lq0Var2 = jq0Var.f15705a;
                    try {
                        ArrayList arrayList = new ArrayList();
                        JSONObject jSONObject2 = new JSONObject(str3).getJSONObject("initializer_settings").getJSONObject("config");
                        Iterator<String> itKeys = jSONObject2.keys();
                        while (itKeys.hasNext()) {
                            String next = itKeys.next();
                            Object obj = new Object();
                            C3147io c3147io = new C3147io();
                            kv1 kv1VarM6248r = cw0.m6248r(c3147io, ((Long) C2862b.f12493a.f12496d.m6596a(C3052g3.f14319b1)).longValue(), TimeUnit.SECONDS, lq0Var2.f16452k);
                            lq0Var2.f16453l.m8811a(next);
                            lq0Var2.f16456o.m7108A0(new ib0(next));
                            long jMo5621a = C2330u.f10884a.f10896k.mo5621a();
                            kv1VarM6248r.mo6230f(new Runnable(lq0Var2, obj, c3147io, next, jMo5621a) { // from class: c.n.b.d.j.a.eq0

                                /* JADX INFO: renamed from: f */
                                public final lq0 f13642f;

                                /* JADX INFO: renamed from: g */
                                public final Object f13643g;

                                /* JADX INFO: renamed from: h */
                                public final C3147io f13644h;

                                /* JADX INFO: renamed from: i */
                                public final String f13645i;

                                /* JADX INFO: renamed from: j */
                                public final long f13646j;

                                {
                                    this.f13642f = lq0Var2;
                                    this.f13643g = obj;
                                    this.f13644h = c3147io;
                                    this.f13645i = next;
                                    this.f13646j = jMo5621a;
                                }

                                @Override // java.lang.Runnable
                                public final void run() {
                                    lq0 lq0Var3 = this.f13642f;
                                    Object obj2 = this.f13643g;
                                    C3147io c3147io2 = this.f13644h;
                                    String str4 = this.f13645i;
                                    long j2 = this.f13646j;
                                    Objects.requireNonNull(lq0Var3);
                                    synchronized (obj2) {
                                        if (!c3147io2.isDone()) {
                                            lq0Var3.f16455n.put(str4, new C3762z9(str4, false, (int) (C2330u.f10884a.f10896k.mo5621a() - j2), "Timeout."));
                                            lq0Var3.f16453l.m8813c(str4, "timeout");
                                            lq0Var3.f16456o.m7108A0(new kb0(str4, "timeout"));
                                            c3147io2.m7286a(Boolean.FALSE);
                                        }
                                    }
                                }
                            }, lq0Var2.f16450i);
                            arrayList.add(kv1VarM6248r);
                            kq0 kq0Var = new kq0(lq0Var2, obj, next, jMo5621a, c3147io);
                            JSONObject jSONObjectOptJSONObject = jSONObject2.optJSONObject(next);
                            ArrayList arrayList2 = new ArrayList();
                            if (jSONObjectOptJSONObject != null) {
                                try {
                                    JSONArray jSONArray = jSONObjectOptJSONObject.getJSONArray("data");
                                    int i = 0;
                                    while (i < jSONArray.length()) {
                                        JSONObject jSONObject3 = jSONArray.getJSONObject(i);
                                        String strOptString = jSONObject3.optString("format", "");
                                        JSONObject jSONObjectOptJSONObject2 = jSONObject3.optJSONObject("data");
                                        Bundle bundle = new Bundle();
                                        if (jSONObjectOptJSONObject2 != null) {
                                            Iterator<String> itKeys2 = jSONObjectOptJSONObject2.keys();
                                            while (itKeys2.hasNext()) {
                                                String next2 = itKeys2.next();
                                                jSONObject = jSONObject2;
                                                try {
                                                    bundle.putString(next2, jSONObjectOptJSONObject2.optString(next2, ""));
                                                    jSONObject2 = jSONObject;
                                                } catch (JSONException unused) {
                                                }
                                            }
                                        }
                                        JSONObject jSONObject4 = jSONObject2;
                                        arrayList2.add(new C3096ha(strOptString, bundle));
                                        i++;
                                        jSONObject2 = jSONObject4;
                                    }
                                } catch (JSONException unused2) {
                                }
                                jSONObject = jSONObject2;
                            } else {
                                jSONObject = jSONObject2;
                            }
                            lq0Var2.m7605e(next, false, "", 0);
                            try {
                                try {
                                    lq0Var2.f16451j.execute(new Runnable(lq0Var2, lq0Var2.f16449h.m7719a(next, new JSONObject()), kq0Var, arrayList2, next) { // from class: c.n.b.d.j.a.gq0

                                        /* JADX INFO: renamed from: f */
                                        public final lq0 f14637f;

                                        /* JADX INFO: renamed from: g */
                                        public final vi1 f14638g;

                                        /* JADX INFO: renamed from: h */
                                        public final InterfaceC2948da f14639h;

                                        /* JADX INFO: renamed from: i */
                                        public final List f14640i;

                                        /* JADX INFO: renamed from: j */
                                        public final String f14641j;

                                        {
                                            this.f14637f = lq0Var2;
                                            this.f14638g = vi1Var;
                                            this.f14639h = kq0Var;
                                            this.f14640i = arrayList2;
                                            this.f14641j = next;
                                        }

                                        @Override // java.lang.Runnable
                                        public final void run() {
                                            lq0 lq0Var3 = this.f14637f;
                                            vi1 vi1Var = this.f14638g;
                                            InterfaceC2948da interfaceC2948da = this.f14639h;
                                            List<C3096ha> list = this.f14640i;
                                            String str4 = this.f14641j;
                                            Objects.requireNonNull(lq0Var3);
                                            try {
                                                try {
                                                    Context context = lq0Var3.f16448g.get();
                                                    if (context == null) {
                                                        context = lq0Var3.f16447f;
                                                    }
                                                    Objects.requireNonNull(vi1Var);
                                                    try {
                                                        vi1Var.f20804a.mo7834a2(new BinderC2800b(context), interfaceC2948da, list);
                                                    } catch (Throwable th) {
                                                        throw new mi1(th);
                                                    }
                                                } catch (mi1 unused3) {
                                                    StringBuilder sb = new StringBuilder(String.valueOf(str4).length() + 74);
                                                    sb.append("Failed to initialize adapter. ");
                                                    sb.append(str4);
                                                    sb.append(" does not implement the initialize() method.");
                                                    interfaceC2948da.mo5941S(sb.toString());
                                                }
                                            } catch (RemoteException e) {
                                                C2622l.m5438t3("", e);
                                            }
                                        }
                                    });
                                } catch (RemoteException e) {
                                    C2622l.m5438t3("", e);
                                }
                            } catch (mi1 unused3) {
                                kq0Var.mo5941S("Failed to create Adapter.");
                            }
                            jSONObject2 = jSONObject;
                        }
                        ns1<Object> ns1Var = ts1.f19979g;
                        new vu1(ts1.m8449u(arrayList), false, lq0Var2.f16450i, new Callable(lq0Var2) { // from class: c.n.b.d.j.a.fq0

                            /* JADX INFO: renamed from: a */
                            public final lq0 f14094a;

                            {
                                this.f14094a = lq0Var2;
                            }

                            @Override // java.util.concurrent.Callable
                            public final Object call() {
                                this.f14094a.f16446e.m7286a(Boolean.TRUE);
                                return null;
                            }
                        });
                    } catch (JSONException e2) {
                        C2096e.m4554C("Malformed CLD response", e2);
                    }
                }
            });
        }
    }
}
