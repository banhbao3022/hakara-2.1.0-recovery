package p007c.p190n.p194b.p367f.p368a.p374e;

import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import p007c.p190n.p194b.p367f.p368a.p373d.C5089f;

/* JADX INFO: renamed from: c.n.b.f.a.e.c */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC5126c<StateT> {

    /* JADX INFO: renamed from: a */
    public final C5089f f26077a;

    /* JADX INFO: renamed from: b */
    public final IntentFilter f26078b;

    /* JADX INFO: renamed from: c */
    public final Context f26079c;

    /* JADX INFO: renamed from: d */
    public final Set<InterfaceC5124a<StateT>> f26080d = new HashSet();

    /* JADX INFO: renamed from: e */
    public C5125b f26081e = null;

    /* JADX INFO: renamed from: f */
    public volatile boolean f26082f = false;

    public AbstractC5126c(C5089f c5089f, IntentFilter intentFilter, Context context) {
        this.f26077a = c5089f;
        this.f26078b = intentFilter;
        Context applicationContext = context.getApplicationContext();
        this.f26079c = applicationContext != null ? applicationContext : context;
    }

    /* JADX INFO: renamed from: a */
    public abstract void mo11469a(Context context, Intent intent);

    /* JADX INFO: renamed from: b */
    public final void m11559b() {
        C5125b c5125b;
        if ((this.f26082f || !this.f26080d.isEmpty()) && this.f26081e == null) {
            C5125b c5125b2 = new C5125b(this);
            this.f26081e = c5125b2;
            this.f26079c.registerReceiver(c5125b2, this.f26078b);
        }
        if (this.f26082f || !this.f26080d.isEmpty() || (c5125b = this.f26081e) == null) {
            return;
        }
        this.f26079c.unregisterReceiver(c5125b);
        this.f26081e = null;
    }

    /* JADX INFO: renamed from: c */
    public final synchronized void m11560c(StateT statet) {
        Iterator it = new HashSet(this.f26080d).iterator();
        while (it.hasNext()) {
            ((InterfaceC5124a) it.next()).m11558a(statet);
        }
    }
}
