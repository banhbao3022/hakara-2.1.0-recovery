package p007c.p190n.p194b.p266d.p314j.p315a;

import android.content.Context;
import android.util.JsonWriter;
import java.io.IOException;
import java.io.StringWriter;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import p007c.p190n.p194b.p209b.p263z1.C2096e;
import p007c.p190n.p194b.p266d.p267a.p282z.C2330u;
import p007c.p190n.p194b.p266d.p298f.C2622l;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* JADX INFO: loaded from: classes.dex */
public final class lp0 implements z80, uv2, i60, a70, b70, u70, l60, mg2, zl1 {

    /* JADX INFO: renamed from: f */
    public final List<Object> f16435f;

    /* JADX INFO: renamed from: g */
    public final ap0 f16436g;

    /* JADX INFO: renamed from: h */
    public long f16437h;

    public lp0(ap0 ap0Var, AbstractC3264lu abstractC3264lu) {
        this.f16436g = ap0Var;
        this.f16435f = Collections.singletonList(abstractC3264lu);
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.zl1
    /* JADX INFO: renamed from: A */
    public final void mo7032A(rl1 rl1Var, String str, Throwable th) {
        m7600G(ql1.class, "onTaskFailed", str, th.getClass().getSimpleName());
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.zl1
    /* JADX INFO: renamed from: F */
    public final void mo7033F(rl1 rl1Var, String str) {
        m7600G(ql1.class, "onTaskSucceeded", str);
    }

    /* JADX INFO: renamed from: G */
    public final void m7600G(Class<?> cls, String str, Object... objArr) {
        ap0 ap0Var = this.f16436g;
        List<Object> list = this.f16435f;
        String simpleName = cls.getSimpleName();
        String strConcat = simpleName.length() != 0 ? "Event-".concat(simpleName) : new String("Event-");
        Objects.requireNonNull(ap0Var);
        if (C3460r4.f18704a.m6603d().booleanValue()) {
            long jMo5623c = ap0Var.f12246a.mo5623c();
            StringWriter stringWriter = new StringWriter();
            JsonWriter jsonWriter = new JsonWriter(stringWriter);
            try {
                jsonWriter.beginObject();
                jsonWriter.name("timestamp").value(jMo5623c);
                jsonWriter.name("source").value(strConcat);
                jsonWriter.name("event").value(str);
                jsonWriter.name("components").beginArray();
                Iterator<Object> it = list.iterator();
                while (it.hasNext()) {
                    jsonWriter.value(it.next().toString());
                }
                jsonWriter.endArray();
                jsonWriter.name("params").beginArray();
                int length = objArr.length;
                for (int i = 0; i < length; i++) {
                    Object obj = objArr[i];
                    jsonWriter.value(obj != null ? obj.toString() : null);
                }
                jsonWriter.endArray();
                jsonWriter.endObject();
                jsonWriter.flush();
                jsonWriter.close();
            } catch (IOException e) {
                C2622l.m5438t3("unable to log", e);
            }
            String strValueOf = String.valueOf(stringWriter.toString());
            C2622l.m5458x3(strValueOf.length() != 0 ? "AD-DBG ".concat(strValueOf) : new String("AD-DBG "));
        }
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.z80
    /* JADX INFO: renamed from: Q */
    public final void mo6214Q(di1 di1Var) {
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.b70
    /* JADX INFO: renamed from: a */
    public final void mo5929a(Context context) {
        m7600G(b70.class, "onPause", context);
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.u70
    /* JADX INFO: renamed from: a0 */
    public final void mo5730a0() {
        long jMo5621a = C2330u.f10884a.f10896k.mo5621a();
        long j2 = this.f16437h;
        StringBuilder sb = new StringBuilder(41);
        sb.append("Ad Request Latency : ");
        sb.append(jMo5621a - j2);
        C2096e.m4590z(sb.toString());
        m7600G(u70.class, "onAdLoaded", new Object[0]);
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.i60
    /* JADX INFO: renamed from: b */
    public final void mo6969b() {
        m7600G(i60.class, "onAdOpened", new Object[0]);
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.i60
    /* JADX INFO: renamed from: c */
    public final void mo6970c() {
        m7600G(i60.class, "onAdLeftApplication", new Object[0]);
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.mg2
    /* JADX INFO: renamed from: d */
    public final void mo6971d(String str, String str2) {
        m7600G(mg2.class, "onAppEvent", str, str2);
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.i60
    /* JADX INFO: renamed from: e */
    public final void mo6972e() {
        m7600G(i60.class, "onAdClosed", new Object[0]);
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.i60
    /* JADX INFO: renamed from: f */
    public final void mo6973f() {
        m7600G(i60.class, "onRewardedVideoStarted", new Object[0]);
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.i60
    /* JADX INFO: renamed from: g */
    public final void mo6974g() {
        m7600G(i60.class, "onRewardedVideoCompleted", new Object[0]);
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.a70
    /* JADX INFO: renamed from: i */
    public final void mo5699i() {
        m7600G(a70.class, "onAdImpression", new Object[0]);
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.uv2
    /* JADX INFO: renamed from: i0 */
    public final void mo2739i0() {
        m7600G(uv2.class, "onAdClicked", new Object[0]);
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.i60
    /* JADX INFO: renamed from: j */
    public final void mo6975j(InterfaceC3068gj interfaceC3068gj, String str, String str2) {
        m7600G(i60.class, "onRewarded", interfaceC3068gj, str, str2);
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.z80
    /* JADX INFO: renamed from: m */
    public final void mo6215m(C3437qi c3437qi) {
        this.f16437h = C2330u.f10884a.f10896k.mo5621a();
        m7600G(z80.class, "onAdRequest", new Object[0]);
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.zl1
    /* JADX INFO: renamed from: n */
    public final void mo7034n(rl1 rl1Var, String str) {
        m7600G(ql1.class, "onTaskCreated", str);
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.l60
    /* JADX INFO: renamed from: o0 */
    public final void mo6216o0(yv2 yv2Var) {
        m7600G(l60.class, "onAdFailedToLoad", Integer.valueOf(yv2Var.f22116f), yv2Var.f22117g, yv2Var.f22118h);
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.zl1
    /* JADX INFO: renamed from: p */
    public final void mo7035p(rl1 rl1Var, String str) {
        m7600G(ql1.class, "onTaskStarted", str);
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.b70
    /* JADX INFO: renamed from: t */
    public final void mo5930t(Context context) {
        m7600G(b70.class, "onDestroy", context);
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.b70
    /* JADX INFO: renamed from: v */
    public final void mo5931v(Context context) {
        m7600G(b70.class, "onResume", context);
    }
}
