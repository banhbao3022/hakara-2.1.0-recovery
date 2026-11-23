package p007c.p190n.p194b.p266d.p314j.p315a;

import android.annotation.TargetApi;
import android.graphics.Rect;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;
import android.widget.EditText;
import android.widget.TextView;
import p007c.p190n.p194b.p266d.p298f.C2622l;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* JADX INFO: loaded from: classes.dex */
@TargetApi(14)
public final class iq2 extends Thread {

    /* JADX INFO: renamed from: f */
    public boolean f15340f;

    /* JADX INFO: renamed from: g */
    public boolean f15341g;

    /* JADX INFO: renamed from: h */
    public final Object f15342h;

    /* JADX INFO: renamed from: i */
    public final yp2 f15343i;

    /* JADX INFO: renamed from: j */
    public final int f15344j;

    /* JADX INFO: renamed from: k */
    public final int f15345k;

    /* JADX INFO: renamed from: l */
    public final int f15346l;

    /* JADX INFO: renamed from: m */
    public final int f15347m;

    /* JADX INFO: renamed from: n */
    public final int f15348n;

    /* JADX INFO: renamed from: o */
    public final int f15349o;

    /* JADX INFO: renamed from: p */
    public final int f15350p;

    /* JADX INFO: renamed from: q */
    public final int f15351q;

    /* JADX INFO: renamed from: r */
    public final String f15352r;

    /* JADX INFO: renamed from: s */
    public final boolean f15353s;

    /* JADX INFO: renamed from: t */
    public final boolean f15354t;

    /* JADX INFO: renamed from: u */
    public final boolean f15355u;

    public iq2() {
        yp2 yp2Var = new yp2();
        this.f15340f = false;
        this.f15341g = false;
        this.f15343i = yp2Var;
        this.f15342h = new Object();
        this.f15345k = C3164j4.f15469d.m6603d().intValue();
        this.f15346l = C3164j4.f15466a.m6603d().intValue();
        this.f15347m = C3164j4.f15470e.m6603d().intValue();
        this.f15348n = C3164j4.f15468c.m6603d().intValue();
        AbstractC3718y2<Integer> abstractC3718y2 = C3052g3.f14214K;
        C2862b c2862b = C2862b.f12493a;
        this.f15349o = ((Integer) c2862b.f12496d.m6596a(abstractC3718y2)).intValue();
        this.f15350p = ((Integer) c2862b.f12496d.m6596a(C3052g3.f14220L)).intValue();
        this.f15351q = ((Integer) c2862b.f12496d.m6596a(C3052g3.f14226M)).intValue();
        this.f15344j = C3164j4.f15471f.m6603d().intValue();
        this.f15352r = (String) c2862b.f12496d.m6596a(C3052g3.f14238O);
        this.f15353s = ((Boolean) c2862b.f12496d.m6596a(C3052g3.f14244P)).booleanValue();
        this.f15354t = ((Boolean) c2862b.f12496d.m6596a(C3052g3.f14250Q)).booleanValue();
        this.f15355u = ((Boolean) c2862b.f12496d.m6596a(C3052g3.f14256R)).booleanValue();
        setName("ContentFetchTask");
    }

    /* JADX INFO: renamed from: a */
    public final hq2 m7288a(View view, xp2 xp2Var) {
        if (view == null) {
            return new hq2(0, 0);
        }
        boolean globalVisibleRect = view.getGlobalVisibleRect(new Rect());
        if ((view instanceof TextView) && !(view instanceof EditText)) {
            CharSequence text = ((TextView) view).getText();
            if (TextUtils.isEmpty(text)) {
                return new hq2(0, 0);
            }
            xp2Var.m8747c(text.toString(), globalVisibleRect, view.getX(), view.getY(), view.getWidth(), view.getHeight());
            return new hq2(1, 0);
        }
        if ((view instanceof WebView) && !(view instanceof InterfaceC3410ps)) {
            WebView webView = (WebView) view;
            synchronized (xp2Var.f21642g) {
                xp2Var.f21648m++;
            }
            webView.post(new gq2(this, xp2Var, webView, globalVisibleRect));
            return new hq2(0, 1);
        }
        if (!(view instanceof ViewGroup)) {
            return new hq2(0, 0);
        }
        ViewGroup viewGroup = (ViewGroup) view;
        int i = 0;
        int i2 = 0;
        for (int i3 = 0; i3 < viewGroup.getChildCount(); i3++) {
            hq2 hq2VarM7288a = m7288a(viewGroup.getChildAt(i3), xp2Var);
            i += hq2VarM7288a.f14938a;
            i2 += hq2VarM7288a.f14939b;
        }
        return new hq2(i, i2);
    }

    /* JADX INFO: renamed from: b */
    public final void m7289b() {
        synchronized (this.f15342h) {
            this.f15341g = true;
            C2622l.m5318U2("ContentFetchThread: paused, mPause = true");
        }
    }

    /* JADX WARN: Bottom block not found for handler: all -> 0x0108 */
    /* JADX WARN: Code duplicated, block: B:61:0x00fa A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:67:0x00f6 A[EXC_TOP_SPLITTER, LOOP:1: B:67:0x00f6->B:72:0x00f6, LOOP_START, SYNTHETIC] */
    @Override // java.lang.Thread, java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void run() {
        /*
            Method dump skipped, instruction units count: 267
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p007c.p190n.p194b.p266d.p314j.p315a.iq2.run():void");
    }
}
