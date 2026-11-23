package p007c.p190n.p194b.p266d.p314j.p315a;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.IntentFilter;
import android.os.Handler;
import android.provider.Settings;
import android.view.View;
import android.webkit.WebView;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.UUID;
import java.util.regex.Pattern;
import org.json.JSONObject;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* JADX INFO: loaded from: classes.dex */
public final class nn1 extends jn1 {

    /* JADX INFO: renamed from: a */
    public static final Pattern f17175a = Pattern.compile("^[a-zA-Z0-9 ]+$");

    /* JADX INFO: renamed from: b */
    public final ln1 f17176b;

    /* JADX INFO: renamed from: e */
    public lo1 f17179e;

    /* JADX INFO: renamed from: c */
    public final List<bo1> f17177c = new ArrayList();

    /* JADX INFO: renamed from: f */
    public boolean f17180f = false;

    /* JADX INFO: renamed from: g */
    public boolean f17181g = false;

    /* JADX INFO: renamed from: h */
    public final String f17182h = UUID.randomUUID().toString();

    /* JADX INFO: renamed from: d */
    public gp1 f17178d = new gp1(null);

    public nn1(kn1 kn1Var, ln1 ln1Var) {
        this.f17176b = ln1Var;
        mn1 mn1Var = ln1Var.f16413g;
        if (mn1Var == mn1.HTML || mn1Var == mn1.JAVASCRIPT) {
            this.f17179e = new mo1(ln1Var.f16408b);
        } else {
            this.f17179e = new oo1(Collections.unmodifiableMap(ln1Var.f16410d), null);
        }
        this.f17179e.mo7594a();
        yn1.f21931a.f21932b.add(this);
        WebView webViewM7596c = this.f17179e.m7596c();
        Objects.requireNonNull(kn1Var);
        JSONObject jSONObject = new JSONObject();
        po1.m8133b(jSONObject, "impressionOwner", kn1Var.f15995a);
        if (kn1Var.f15997c == null || kn1Var.f15998d == null) {
            po1.m8133b(jSONObject, "videoEventsOwner", kn1Var.f15996b);
        } else {
            po1.m8133b(jSONObject, "mediaEventsOwner", kn1Var.f15996b);
            po1.m8133b(jSONObject, "creativeType", kn1Var.f15997c);
            po1.m8133b(jSONObject, "impressionType", kn1Var.f15998d);
        }
        po1.m8133b(jSONObject, "isolateVerificationScripts", Boolean.TRUE);
        eo1.m6651a(webViewM7596c, "init", jSONObject);
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.jn1
    /* JADX INFO: renamed from: a */
    public final void mo7364a() {
        if (this.f17180f) {
            return;
        }
        this.f17180f = true;
        yn1 yn1Var = yn1.f21931a;
        boolean zM8808c = yn1Var.m8808c();
        yn1Var.f21933c.add(this);
        if (!zM8808c) {
            fo1 fo1VarM6847a = fo1.m6847a();
            Objects.requireNonNull(fo1VarM6847a);
            ao1 ao1Var = ao1.f12237a;
            ao1Var.f12242f = fo1VarM6847a;
            ao1Var.f12239c = new zn1(ao1Var);
            IntentFilter intentFilter = new IntentFilter();
            intentFilter.addAction("android.intent.action.SCREEN_OFF");
            intentFilter.addAction("android.intent.action.SCREEN_ON");
            intentFilter.addAction("android.intent.action.USER_PRESENT");
            ao1Var.f12238b.registerReceiver(ao1Var.f12239c, intentFilter);
            ao1Var.f12240d = true;
            ao1Var.m5838b();
            if (!ao1Var.f12241e) {
                zo1.f22366a.m8896b();
            }
            wn1 wn1Var = fo1VarM6847a.f14085c;
            wn1Var.f21269c = wn1Var.m8659a();
            wn1Var.m8660b();
            wn1Var.f21267a.getContentResolver().registerContentObserver(Settings.System.CONTENT_URI, true, wn1Var);
        }
        this.f17179e.m7599f(fo1.m6847a().f14084b);
        this.f17179e.mo7597d(this, this.f17176b);
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.jn1
    /* JADX INFO: renamed from: b */
    public final void mo7365b(View view) {
        if (this.f17181g || m7897g() == view) {
            return;
        }
        this.f17178d = new gp1(view);
        lo1 lo1Var = this.f17179e;
        Objects.requireNonNull(lo1Var);
        lo1Var.f16432b = System.nanoTime();
        lo1Var.f16433c = 1;
        Collection<nn1> collectionM8806a = yn1.f21931a.m8806a();
        if (collectionM8806a == null || collectionM8806a.size() <= 0) {
            return;
        }
        for (nn1 nn1Var : collectionM8806a) {
            if (nn1Var != this && nn1Var.m7897g() == view) {
                nn1Var.f17178d.clear();
            }
        }
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.jn1
    /* JADX INFO: renamed from: c */
    public final void mo7366c() {
        BroadcastReceiver broadcastReceiver;
        if (this.f17181g) {
            return;
        }
        this.f17178d.clear();
        if (!this.f17181g) {
            this.f17177c.clear();
        }
        this.f17181g = true;
        eo1.m6651a(this.f17179e.m7596c(), "finishSession", new Object[0]);
        yn1 yn1Var = yn1.f21931a;
        boolean zM8808c = yn1Var.m8808c();
        yn1Var.f21932b.remove(this);
        yn1Var.f21933c.remove(this);
        if (zM8808c && !yn1Var.m8808c()) {
            fo1 fo1VarM6847a = fo1.m6847a();
            Objects.requireNonNull(fo1VarM6847a);
            zo1 zo1Var = zo1.f22366a;
            Objects.requireNonNull(zo1Var);
            Handler handler = zo1.f22368c;
            if (handler != null) {
                handler.removeCallbacks(zo1.f22370e);
                zo1.f22368c = null;
            }
            zo1Var.f22371f.clear();
            zo1.f22367b.post(new uo1(zo1Var));
            ao1 ao1Var = ao1.f12237a;
            Context context = ao1Var.f12238b;
            if (context != null && (broadcastReceiver = ao1Var.f12239c) != null) {
                context.unregisterReceiver(broadcastReceiver);
                ao1Var.f12239c = null;
            }
            ao1Var.f12240d = false;
            ao1Var.f12241e = false;
            ao1Var.f12242f = null;
            wn1 wn1Var = fo1VarM6847a.f14085c;
            wn1Var.f21267a.getContentResolver().unregisterContentObserver(wn1Var);
        }
        this.f17179e.mo7595b();
        this.f17179e = null;
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.jn1
    /* JADX INFO: renamed from: d */
    public final void mo7367d(View view, pn1 pn1Var, String str) {
        bo1 next;
        if (this.f17181g) {
            return;
        }
        if (str != null && (str.length() > 50 || !f17175a.matcher(str).matches())) {
            throw new IllegalArgumentException("FriendlyObstruction has improperly formatted detailed reason");
        }
        Iterator<bo1> it = this.f17177c.iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (next.f12758a.get() != view);
        if (next == null) {
            this.f17177c.add(new bo1(view, pn1Var, str));
        }
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.jn1
    @Deprecated
    /* JADX INFO: renamed from: e */
    public final void mo7368e(View view) {
        mo7367d(view, pn1.OTHER, null);
    }

    /* JADX INFO: renamed from: g */
    public final View m7897g() {
        return this.f17178d.get();
    }
}
