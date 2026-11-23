package p007c.p190n.p194b.p266d.p314j.p315a;

import android.content.Context;
import android.os.Bundle;
import android.os.Parcel;
import android.os.RemoteException;
import android.view.MotionEvent;
import android.view.View;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import p007c.p190n.p194b.p266d.p267a.p282z.C2330u;
import p007c.p190n.p194b.p266d.p267a.p282z.p284b.C2267h1;
import p007c.p190n.p194b.p266d.p267a.p282z.p284b.C2269i0;
import p007c.p190n.p194b.p266d.p298f.C2622l;
import p007c.p190n.p194b.p266d.p310g.BinderC2800b;
import p007c.p190n.p194b.p266d.p310g.InterfaceC2799a;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* JADX INFO: loaded from: classes.dex */
public final class zh0 implements kg0 {

    /* JADX INFO: renamed from: a */
    public final InterfaceC2952de f22277a;

    /* JADX INFO: renamed from: b */
    public final y60 f22278b;

    /* JADX INFO: renamed from: c */
    public final g60 f22279c;

    /* JADX INFO: renamed from: d */
    public final Context f22280d;

    /* JADX INFO: renamed from: e */
    public final rh1 f22281e;

    /* JADX INFO: renamed from: f */
    public final C3702xn f22282f;

    /* JADX INFO: renamed from: g */
    public final ii1 f22283g;

    /* JADX INFO: renamed from: h */
    public boolean f22284h = false;

    /* JADX INFO: renamed from: i */
    public boolean f22285i = false;

    /* JADX INFO: renamed from: j */
    public boolean f22286j = true;

    /* JADX INFO: renamed from: k */
    public final C3766zd f22287k;

    /* JADX INFO: renamed from: l */
    public final C2840ae f22288l;

    public zh0(C3766zd c3766zd, C2840ae c2840ae, InterfaceC2952de interfaceC2952de, y60 y60Var, g60 g60Var, Context context, rh1 rh1Var, C3702xn c3702xn, ii1 ii1Var, byte[] bArr) {
        this.f22287k = c3766zd;
        this.f22288l = c2840ae;
        this.f22277a = interfaceC2952de;
        this.f22278b = y60Var;
        this.f22279c = g60Var;
        this.f22280d = context;
        this.f22281e = rh1Var;
        this.f22282f = c3702xn;
        this.f22283g = ii1Var;
    }

    /* JADX INFO: renamed from: v */
    public static final HashMap<String, View> m8889v(Map<String, WeakReference<View>> map) {
        HashMap<String, View> map2 = new HashMap<>();
        if (map == null) {
            return map2;
        }
        synchronized (map) {
            for (Map.Entry<String, WeakReference<View>> entry : map.entrySet()) {
                View view = entry.getValue().get();
                if (view != null) {
                    map2.put(entry.getKey(), view);
                }
            }
        }
        return map2;
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.kg0
    /* JADX INFO: renamed from: B */
    public final void mo5741B() {
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.kg0
    /* JADX INFO: renamed from: a */
    public final void mo5742a(View view, MotionEvent motionEvent, View view2) {
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.kg0
    /* JADX INFO: renamed from: b */
    public final void mo5743b(InterfaceC3345o0 interfaceC3345o0) {
        C2622l.m5226A3("Mute This Ad is not supported for 3rd party ads");
    }

    /* JADX WARN: Code duplicated, block: B:51:0x00d0 A[Catch: JSONException -> 0x0046, RemoteException -> 0x015a, TRY_LEAVE, TryCatch #0 {JSONException -> 0x0046, blocks: (B:48:0x00b4, B:49:0x00ca, B:51:0x00d0), top: B:72:0x00b4 }] */
    /* JADX WARN: Code duplicated, block: B:84:0x0060 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:87:0x0046 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:90:0x00ca A[SYNTHETIC] */
    @Override // p007c.p190n.p194b.p266d.p314j.p315a.kg0
    /* JADX INFO: renamed from: c */
    public final void mo5744c(View view, Map<String, WeakReference<View>> map, Map<String, WeakReference<View>> map2, View.OnTouchListener onTouchListener, View.OnClickListener onClickListener) {
        Object obj;
        ClassLoader classLoader;
        Iterator it;
        InterfaceC2799a interfaceC2799aMo5975l;
        try {
            BinderC2800b binderC2800b = new BinderC2800b(view);
            JSONObject jSONObject = this.f22281e.f18812e0;
            boolean z = true;
            if (((Boolean) C2862b.f12493a.f12496d.m6596a(C3052g3.f14281V0)).booleanValue() && jSONObject.length() != 0) {
                Map<String, WeakReference<View>> map3 = map == null ? new HashMap<>() : map;
                Map<String, WeakReference<View>> map4 = map2 == null ? new HashMap<>() : map2;
                HashMap map5 = new HashMap();
                map5.putAll(map3);
                map5.putAll(map4);
                Iterator<String> itKeys = jSONObject.keys();
                loop0: while (itKeys.hasNext()) {
                    String next = itKeys.next();
                    JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray(next);
                    if (jSONArrayOptJSONArray != null) {
                        WeakReference weakReference = (WeakReference) map5.get(next);
                        if (weakReference != null && (obj = weakReference.get()) != null) {
                            Class<?> cls = obj.getClass();
                            if (((Boolean) C2862b.f12493a.f12496d.m6596a(C3052g3.f14287W0)).booleanValue() && next.equals("3010")) {
                                InterfaceC2952de interfaceC2952de = this.f22277a;
                                Object objM5639T1 = null;
                                if (interfaceC2952de != null) {
                                    try {
                                        interfaceC2799aMo5975l = interfaceC2952de.mo5975l();
                                    } catch (RemoteException | IllegalArgumentException unused) {
                                    }
                                } else {
                                    C3766zd c3766zd = this.f22287k;
                                    if (c3766zd != null) {
                                        interfaceC2799aMo5975l = c3766zd.m8887i4();
                                    } else {
                                        C2840ae c2840ae = this.f22288l;
                                        interfaceC2799aMo5975l = c2840ae != null ? c2840ae.m5735J3() : null;
                                    }
                                }
                                if (interfaceC2799aMo5975l != null) {
                                    objM5639T1 = BinderC2800b.m5639T1(interfaceC2799aMo5975l);
                                }
                                if (objM5639T1 != null) {
                                    cls = objM5639T1.getClass();
                                    ArrayList arrayList = new ArrayList();
                                    C2269i0.m4773a(jSONArrayOptJSONArray, arrayList);
                                    C2267h1 c2267h1 = C2330u.f10884a.f10889d;
                                    classLoader = this.f22280d.getClassLoader();
                                    it = arrayList.iterator();
                                    while (true) {
                                        if (it.hasNext()) {
                                            if (Class.forName((String) it.next(), false, classLoader).isAssignableFrom(cls)) {
                                            }
                                        }
                                    }
                                }
                            } else {
                                try {
                                    ArrayList arrayList2 = new ArrayList();
                                    C2269i0.m4773a(jSONArrayOptJSONArray, arrayList2);
                                    C2267h1 c2267h2 = C2330u.f10884a.f10889d;
                                    classLoader = this.f22280d.getClassLoader();
                                    it = arrayList2.iterator();
                                    while (true) {
                                        if (it.hasNext()) {
                                            if (Class.forName((String) it.next(), false, classLoader).isAssignableFrom(cls)) {
                                            }
                                        }
                                    }
                                } catch (JSONException unused2) {
                                    continue;
                                }
                            }
                        }
                        z = false;
                        break;
                    }
                }
            }
            this.f22286j = z;
            HashMap<String, View> mapM8889v = m8889v(map);
            HashMap<String, View> mapM8889v2 = m8889v(map2);
            InterfaceC2952de interfaceC2952de2 = this.f22277a;
            if (interfaceC2952de2 != null) {
                interfaceC2952de2.mo5963G1(binderC2800b, new BinderC2800b(mapM8889v), new BinderC2800b(mapM8889v2));
                return;
            }
            C3766zd c3766zd2 = this.f22287k;
            if (c3766zd2 != null) {
                BinderC2800b binderC2800b2 = new BinderC2800b(mapM8889v);
                BinderC2800b binderC2800b3 = new BinderC2800b(mapM8889v2);
                Parcel parcelM7001E0 = c3766zd2.m7001E0();
                ig2.m7253d(parcelM7001E0, binderC2800b);
                ig2.m7253d(parcelM7001E0, binderC2800b2);
                ig2.m7253d(parcelM7001E0, binderC2800b3);
                c3766zd2.m7002T1(22, parcelM7001E0);
                C3766zd c3766zd3 = this.f22287k;
                Parcel parcelM7001E1 = c3766zd3.m7001E0();
                ig2.m7253d(parcelM7001E1, binderC2800b);
                c3766zd3.m7002T1(12, parcelM7001E1);
                return;
            }
            C2840ae c2840ae2 = this.f22288l;
            if (c2840ae2 != null) {
                BinderC2800b binderC2800b4 = new BinderC2800b(mapM8889v);
                BinderC2800b binderC2800b5 = new BinderC2800b(mapM8889v2);
                Parcel parcelM7001E2 = c2840ae2.m7001E0();
                ig2.m7253d(parcelM7001E2, binderC2800b);
                ig2.m7253d(parcelM7001E2, binderC2800b4);
                ig2.m7253d(parcelM7001E2, binderC2800b5);
                c2840ae2.m7002T1(22, parcelM7001E2);
                C2840ae c2840ae3 = this.f22288l;
                Parcel parcelM7001E3 = c2840ae3.m7001E0();
                ig2.m7253d(parcelM7001E3, binderC2800b);
                c2840ae3.m7002T1(10, parcelM7001E3);
            }
        } catch (RemoteException e) {
            C2622l.m5241D3("Failed to call trackView", e);
        }
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.kg0
    /* JADX INFO: renamed from: d */
    public final void mo5745d(View view, Map<String, WeakReference<View>> map) {
        try {
            BinderC2800b binderC2800b = new BinderC2800b(view);
            InterfaceC2952de interfaceC2952de = this.f22277a;
            if (interfaceC2952de != null) {
                interfaceC2952de.mo5981q2(binderC2800b);
                return;
            }
            C3766zd c3766zd = this.f22287k;
            if (c3766zd != null) {
                Parcel parcelM7001E0 = c3766zd.m7001E0();
                ig2.m7253d(parcelM7001E0, binderC2800b);
                c3766zd.m7002T1(16, parcelM7001E0);
            } else {
                C2840ae c2840ae = this.f22288l;
                if (c2840ae != null) {
                    Parcel parcelM7001E1 = c2840ae.m7001E0();
                    ig2.m7253d(parcelM7001E1, binderC2800b);
                    c2840ae.m7002T1(14, parcelM7001E1);
                }
            }
        } catch (RemoteException e) {
            C2622l.m5241D3("Failed to call untrackView", e);
        }
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.kg0
    /* JADX INFO: renamed from: e */
    public final void mo5746e(View view, View view2, Map<String, WeakReference<View>> map, Map<String, WeakReference<View>> map2, boolean z) {
        if (this.f22285i && this.f22281e.f18783G) {
            return;
        }
        m8890u(view);
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.kg0
    /* JADX INFO: renamed from: f */
    public final void mo5747f() {
        this.f22285i = true;
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.kg0
    /* JADX INFO: renamed from: g */
    public final boolean mo5748g() {
        return this.f22281e.f18783G;
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.kg0
    /* JADX INFO: renamed from: h */
    public final JSONObject mo5749h(View view, Map<String, WeakReference<View>> map, Map<String, WeakReference<View>> map2) {
        return null;
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.kg0
    /* JADX INFO: renamed from: i */
    public final void mo5750i(View view, Map<String, WeakReference<View>> map, Map<String, WeakReference<View>> map2) {
        try {
            if (!this.f22284h) {
                this.f22284h = C2330u.f10884a.f10899n.m4792a(this.f22280d, this.f22282f.f21615f, this.f22281e.f18778B.toString(), this.f22283g.f15193f);
            }
            if (this.f22286j) {
                InterfaceC2952de interfaceC2952de = this.f22277a;
                if (interfaceC2952de != null && !interfaceC2952de.mo5978o()) {
                    this.f22277a.mo5962C();
                    this.f22278b.zza();
                    return;
                }
                C3766zd c3766zd = this.f22287k;
                boolean z = true;
                if (c3766zd != null) {
                    Parcel parcelM7003i1 = c3766zd.m7003i1(13, c3766zd.m7001E0());
                    ClassLoader classLoader = ig2.f15182a;
                    boolean z2 = parcelM7003i1.readInt() != 0;
                    parcelM7003i1.recycle();
                    if (!z2) {
                        C3766zd c3766zd2 = this.f22287k;
                        c3766zd2.m7002T1(10, c3766zd2.m7001E0());
                        this.f22278b.zza();
                        return;
                    }
                }
                C2840ae c2840ae = this.f22288l;
                if (c2840ae != null) {
                    Parcel parcelM7003i2 = c2840ae.m7003i1(11, c2840ae.m7001E0());
                    ClassLoader classLoader2 = ig2.f15182a;
                    if (parcelM7003i2.readInt() == 0) {
                        z = false;
                    }
                    parcelM7003i2.recycle();
                    if (z) {
                        return;
                    }
                    C2840ae c2840ae2 = this.f22288l;
                    c2840ae2.m7002T1(8, c2840ae2.m7001E0());
                    this.f22278b.zza();
                }
            }
        } catch (RemoteException e) {
            C2622l.m5241D3("Failed to call recordImpression", e);
        }
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.kg0
    /* JADX INFO: renamed from: j */
    public final void mo5751j(View view) {
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.kg0
    /* JADX INFO: renamed from: k */
    public final void mo5752k(InterfaceC3019f7 interfaceC3019f7) {
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.kg0
    /* JADX INFO: renamed from: l */
    public final boolean mo5753l(Bundle bundle) {
        return false;
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.kg0
    /* JADX INFO: renamed from: m */
    public final void mo5754m() {
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.kg0
    /* JADX INFO: renamed from: n */
    public final void mo5755n() {
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.kg0
    /* JADX INFO: renamed from: o */
    public final void mo5756o(Bundle bundle) {
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.kg0
    /* JADX INFO: renamed from: o0 */
    public final void mo5757o0(String str) {
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.kg0
    /* JADX INFO: renamed from: p */
    public final void mo5758p(Bundle bundle) {
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.kg0
    /* JADX INFO: renamed from: q */
    public final void mo5759q() {
        throw null;
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.kg0
    /* JADX INFO: renamed from: r */
    public final void mo5760r() {
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.kg0
    /* JADX INFO: renamed from: s */
    public final void mo5761s(InterfaceC3456r0 interfaceC3456r0) {
        C2622l.m5226A3("Mute This Ad is not supported for 3rd party ads");
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.kg0
    /* JADX INFO: renamed from: t */
    public final void mo5762t(View view, Map<String, WeakReference<View>> map, Map<String, WeakReference<View>> map2, boolean z) {
        if (!this.f22285i) {
            C2622l.m5226A3("Custom click reporting for 3p ads failed. enableCustomClickGesture is not set.");
        } else if (this.f22281e.f18783G) {
            m8890u(view);
        } else {
            C2622l.m5226A3("Custom click reporting for 3p ads failed. Ad unit id not in allow list.");
        }
    }

    /* JADX INFO: renamed from: u */
    public final void m8890u(View view) {
        try {
            InterfaceC2952de interfaceC2952de = this.f22277a;
            if (interfaceC2952de != null && !interfaceC2952de.mo5982r()) {
                this.f22277a.mo5968e0(new BinderC2800b(view));
                this.f22279c.m7108A0(f60.f13980a);
                return;
            }
            C3766zd c3766zd = this.f22287k;
            boolean z = true;
            if (c3766zd != null) {
                Parcel parcelM7003i1 = c3766zd.m7003i1(14, c3766zd.m7001E0());
                ClassLoader classLoader = ig2.f15182a;
                boolean z2 = parcelM7003i1.readInt() != 0;
                parcelM7003i1.recycle();
                if (!z2) {
                    C3766zd c3766zd2 = this.f22287k;
                    BinderC2800b binderC2800b = new BinderC2800b(view);
                    Parcel parcelM7001E0 = c3766zd2.m7001E0();
                    ig2.m7253d(parcelM7001E0, binderC2800b);
                    c3766zd2.m7002T1(11, parcelM7001E0);
                    this.f22279c.m7108A0(f60.f13980a);
                    return;
                }
            }
            C2840ae c2840ae = this.f22288l;
            if (c2840ae != null) {
                Parcel parcelM7003i2 = c2840ae.m7003i1(12, c2840ae.m7001E0());
                ClassLoader classLoader2 = ig2.f15182a;
                if (parcelM7003i2.readInt() == 0) {
                    z = false;
                }
                parcelM7003i2.recycle();
                if (z) {
                    return;
                }
                C2840ae c2840ae2 = this.f22288l;
                BinderC2800b binderC2800b2 = new BinderC2800b(view);
                Parcel parcelM7001E1 = c2840ae2.m7001E0();
                ig2.m7253d(parcelM7001E1, binderC2800b2);
                c2840ae2.m7002T1(9, parcelM7001E1);
                this.f22279c.m7108A0(f60.f13980a);
            }
        } catch (RemoteException e) {
            C2622l.m5241D3("Failed to call handleClick", e);
        }
    }
}
