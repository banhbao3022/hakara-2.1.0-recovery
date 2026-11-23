package p007c.p190n.p194b.p266d.p314j.p315a;

import android.content.Context;
import android.os.Bundle;
import android.os.RemoteException;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.Callable;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import org.json.JSONArray;
import org.json.JSONObject;
import p007c.p190n.p194b.p266d.p298f.C2622l;
import p007c.p190n.p194b.p266d.p310g.BinderC2800b;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* JADX INFO: loaded from: classes.dex */
public final class p91 implements ia1<q91> {

    /* JADX INFO: renamed from: a */
    public final lv1 f17881a;

    /* JADX INFO: renamed from: b */
    public final ScheduledExecutorService f17882b;

    /* JADX INFO: renamed from: c */
    public final e31 f17883c;

    /* JADX INFO: renamed from: d */
    public final Context f17884d;

    /* JADX INFO: renamed from: e */
    public final ii1 f17885e;

    /* JADX INFO: renamed from: f */
    public final z21 f17886f;

    /* JADX INFO: renamed from: g */
    public final String f17887g;

    public p91(lv1 lv1Var, ScheduledExecutorService scheduledExecutorService, String str, e31 e31Var, Context context, ii1 ii1Var, z21 z21Var) {
        this.f17881a = lv1Var;
        this.f17882b = scheduledExecutorService;
        this.f17887g = str;
        this.f17883c = e31Var;
        this.f17884d = context;
        this.f17885e = ii1Var;
        this.f17886f = z21Var;
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.ia1
    public final kv1<q91> zza() {
        return cw0.m6244n(new pu1(this) { // from class: c.n.b.d.j.a.l91

            /* JADX INFO: renamed from: a */
            public final p91 f16299a;

            {
                this.f16299a = this;
            }

            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Type inference failed for: r1v1, types: [java.util.Map] */
            /* JADX WARN: Type inference failed for: r1v11, types: [java.util.Map] */
            /* JADX WARN: Type inference failed for: r1v2, types: [java.util.Map] */
            /* JADX WARN: Type inference failed for: r1v6, types: [java.util.HashMap] */
            /* JADX WARN: Type inference failed for: r1v7, types: [java.util.Map] */
            @Override // p007c.p190n.p194b.p266d.p314j.p315a.pu1
            public final kv1 zza() {
                ?? EmptyMap;
                Map<String, List<h31>> map;
                final p91 p91Var = this.f16299a;
                e31 e31Var = p91Var.f17883c;
                String str = p91Var.f17887g;
                String str2 = p91Var.f17885e.f15193f;
                Objects.requireNonNull(e31Var);
                if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2) || (map = e31Var.f13476b.get(str)) == null) {
                    EmptyMap = Collections.emptyMap();
                } else {
                    List<h31> list = map.get(str2);
                    if (list == null) {
                        list = map.get(C2622l.m5288N0(e31Var.f13478d, str2, str));
                    }
                    if (list == null) {
                        EmptyMap = Collections.emptyMap();
                    } else {
                        EmptyMap = new HashMap();
                        for (h31 h31Var : list) {
                            String str3 = h31Var.f14730a;
                            if (!EmptyMap.containsKey(str3)) {
                                EmptyMap.put(str3, new ArrayList());
                            }
                            ((List) EmptyMap.get(str3)).add(h31Var.f14731b);
                        }
                    }
                }
                final ArrayList arrayList = new ArrayList();
                for (Map.Entry entry : EmptyMap.entrySet()) {
                    final String str4 = (String) entry.getKey();
                    final List list2 = (List) entry.getValue();
                    Bundle bundle = p91Var.f17885e.f15191d.f13725r;
                    final Bundle bundle2 = bundle != null ? bundle.getBundle(str4) : null;
                    arrayList.add(cw0.m6246p((zu1) cw0.m6248r(zu1.m8908s(cw0.m6244n(new pu1(p91Var, str4, list2, bundle2) { // from class: c.n.b.d.j.a.m91

                        /* JADX INFO: renamed from: a */
                        public final p91 f16703a;

                        /* JADX INFO: renamed from: b */
                        public final String f16704b;

                        /* JADX INFO: renamed from: c */
                        public final List f16705c;

                        /* JADX INFO: renamed from: d */
                        public final Bundle f16706d;

                        {
                            this.f16703a = p91Var;
                            this.f16704b = str4;
                            this.f16705c = list2;
                            this.f16706d = bundle2;
                        }

                        @Override // p007c.p190n.p194b.p266d.p314j.p315a.pu1
                        public final kv1 zza() throws RemoteException {
                            p91 p91Var2 = this.f16703a;
                            String str5 = this.f16704b;
                            List list3 = this.f16705c;
                            Bundle bundle3 = this.f16706d;
                            Objects.requireNonNull(p91Var2);
                            C3147io c3147io = new C3147io();
                            z21 z21Var = p91Var2.f17886f;
                            Objects.requireNonNull(z21Var);
                            try {
                                z21Var.f22161a.put(str5, z21Var.f22162b.m7720b(str5));
                            } catch (RemoteException e) {
                                C2622l.m5438t3("Couldn't create RTB adapter : ", e);
                            }
                            InterfaceC3249lf interfaceC3249lfM8844a = p91Var2.f17886f.m8844a(str5);
                            Objects.requireNonNull(interfaceC3249lfM8844a);
                            interfaceC3249lfM8844a.mo7334o2(new BinderC2800b(p91Var2.f17884d), p91Var2.f17887g, bundle3, (Bundle) list3.get(0), p91Var2.f17885e.f15192e, new i31(str5, interfaceC3249lfM8844a, c3147io));
                            return c3147io;
                        }
                    }, p91Var.f17881a)), ((Long) C2862b.f12493a.f12496d.m6596a(C3052g3.f14257R0)).longValue(), TimeUnit.MILLISECONDS, p91Var.f17882b), Throwable.class, new cs1(str4) { // from class: c.n.b.d.j.a.n91

                        /* JADX INFO: renamed from: a */
                        public final String f17042a;

                        {
                            this.f17042a = str4;
                        }

                        @Override // p007c.p190n.p194b.p266d.p314j.p315a.cs1
                        public final Object apply(Object obj) {
                            String strValueOf = String.valueOf(this.f17042a);
                            C2622l.m5408n3(strValueOf.length() != 0 ? "Error calling adapter: ".concat(strValueOf) : new String("Error calling adapter: "));
                            return null;
                        }
                    }, p91Var.f17881a));
                }
                return cw0.m6252v(arrayList).m6889a(new Callable(arrayList) { // from class: c.n.b.d.j.a.o91

                    /* JADX INFO: renamed from: a */
                    public final List f17565a;

                    {
                        this.f17565a = arrayList;
                    }

                    /* JADX WARN: Multi-variable type inference failed */
                    @Override // java.util.concurrent.Callable
                    public final Object call() {
                        List<kv1> list3 = this.f17565a;
                        JSONArray jSONArray = new JSONArray();
                        for (kv1 kv1Var : list3) {
                            if (((JSONObject) kv1Var.get()) != null) {
                                jSONArray.put(kv1Var.get());
                            }
                        }
                        if (jSONArray.length() == 0) {
                            return null;
                        }
                        return new q91(jSONArray.toString());
                    }
                }, p91Var.f17881a);
            }
        }, this.f17881a);
    }
}
