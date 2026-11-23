package p007c.p190n.p194b.p266d.p314j.p315a;

import android.annotation.SuppressLint;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import java.util.Iterator;
import java.util.Objects;
import java.util.concurrent.CopyOnWriteArraySet;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* JADX INFO: loaded from: classes.dex */
public final class vg2 implements tg2 {

    /* JADX INFO: renamed from: a */
    public final hh2[] f20765a;

    /* JADX INFO: renamed from: b */
    public final bn2 f20766b;

    /* JADX INFO: renamed from: c */
    public final zm2 f20767c;

    /* JADX INFO: renamed from: d */
    public final Handler f20768d;

    /* JADX INFO: renamed from: e */
    public final ah2 f20769e;

    /* JADX INFO: renamed from: f */
    public final CopyOnWriteArraySet<qg2> f20770f;

    /* JADX INFO: renamed from: g */
    public final mh2 f20771g;

    /* JADX INFO: renamed from: h */
    public final lh2 f20772h;

    /* JADX INFO: renamed from: i */
    public boolean f20773i;

    /* JADX INFO: renamed from: j */
    public boolean f20774j;

    /* JADX INFO: renamed from: k */
    public int f20775k;

    /* JADX INFO: renamed from: l */
    public int f20776l;

    /* JADX INFO: renamed from: m */
    public int f20777m;

    /* JADX INFO: renamed from: n */
    public boolean f20778n;

    /* JADX INFO: renamed from: o */
    public nh2 f20779o;

    /* JADX INFO: renamed from: p */
    public Object f20780p;

    /* JADX INFO: renamed from: q */
    public om2 f20781q;

    /* JADX INFO: renamed from: r */
    public zm2 f20782r;

    /* JADX INFO: renamed from: s */
    public gh2 f20783s;

    /* JADX INFO: renamed from: t */
    public xg2 f20784t;

    /* JADX INFO: renamed from: u */
    public long f20785u;

    @SuppressLint({"HandlerLeak"})
    public vg2(hh2[] hh2VarArr, bn2 bn2Var, C3556tq c3556tq, byte[] bArr) {
        String str = jo2.f15677e;
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 26);
        sb.append("Init ExoPlayerLib/2.4.2 [");
        sb.append(str);
        sb.append("]");
        Log.i("ExoPlayerImpl", sb.toString());
        this.f20765a = hh2VarArr;
        Objects.requireNonNull(bn2Var);
        this.f20766b = bn2Var;
        this.f20774j = false;
        this.f20775k = 1;
        this.f20770f = new CopyOnWriteArraySet<>();
        zm2 zm2Var = new zm2(new rm2[2], null);
        this.f20767c = zm2Var;
        this.f20779o = nh2.f17107a;
        this.f20771g = new mh2();
        this.f20772h = new lh2();
        this.f20781q = om2.f17681a;
        this.f20782r = zm2Var;
        this.f20783s = gh2.f14588a;
        ug2 ug2Var = new ug2(this, Looper.myLooper() != null ? Looper.myLooper() : Looper.getMainLooper());
        this.f20768d = ug2Var;
        xg2 xg2Var = new xg2(0, 0L);
        this.f20784t = xg2Var;
        this.f20769e = new ah2(hh2VarArr, bn2Var, c3556tq, this.f20774j, 0, ug2Var, xg2Var, this, null);
    }

    /* JADX INFO: renamed from: a */
    public final void m8553a(boolean z) {
        if (this.f20774j != z) {
            this.f20774j = z;
            this.f20769e.f12150j.obtainMessage(1, z ? 1 : 0, 0).sendToTarget();
            Iterator<qg2> it = this.f20770f.iterator();
            while (it.hasNext()) {
                it.next().mo6665g(z, this.f20775k);
            }
        }
    }

    /* JADX INFO: renamed from: b */
    public final void m8554b(sg2... sg2VarArr) {
        ah2 ah2Var = this.f20769e;
        if (ah2Var.f12162v) {
            Log.w("ExoPlayerImplInternal", "Ignoring messages sent after release.");
        } else {
            ah2Var.f12132B++;
            ah2Var.f12150j.obtainMessage(11, sg2VarArr).sendToTarget();
        }
    }

    /* JADX INFO: renamed from: c */
    public final void m8555c(sg2... sg2VarArr) {
        ah2 ah2Var = this.f20769e;
        synchronized (ah2Var) {
            if (ah2Var.f12162v) {
                Log.w("ExoPlayerImplInternal", "Ignoring messages sent after release.");
                return;
            }
            int i = ah2Var.f12132B;
            ah2Var.f12132B = i + 1;
            ah2Var.f12150j.obtainMessage(11, sg2VarArr).sendToTarget();
            while (ah2Var.f12133C <= i) {
                try {
                    ah2Var.wait();
                } catch (InterruptedException unused) {
                    Thread.currentThread().interrupt();
                }
            }
        }
    }

    /* JADX INFO: renamed from: d */
    public final long m8556d() {
        if (this.f20779o.m7863f()) {
            return -9223372036854775807L;
        }
        nh2 nh2Var = this.f20779o;
        m8558f();
        return og2.m8008a(nh2Var.m7864g(0, this.f20771g).f16761a);
    }

    /* JADX INFO: renamed from: e */
    public final long m8557e() {
        if (this.f20779o.m7863f() || this.f20776l > 0) {
            return this.f20785u;
        }
        this.f20779o.mo7498d(this.f20784t.f21532a, this.f20772h, false);
        return og2.m8008a(this.f20784t.f21534c) + og2.m8008a(0L);
    }

    /* JADX INFO: renamed from: f */
    public final int m8558f() {
        if (!this.f20779o.m7863f() && this.f20776l <= 0) {
            this.f20779o.mo7498d(this.f20784t.f21532a, this.f20772h, false);
        }
        return 0;
    }
}
