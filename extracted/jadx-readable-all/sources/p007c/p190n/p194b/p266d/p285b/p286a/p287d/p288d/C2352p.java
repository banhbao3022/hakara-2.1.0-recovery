package p007c.p190n.p194b.p266d.p285b.p286a.p287d.p288d;

import android.content.Context;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;

/* JADX INFO: renamed from: c.n.b.d.b.a.d.d.p */
/* JADX INFO: compiled from: com.google.android.gms:play-services-auth@@19.0.0 */
/* JADX INFO: loaded from: classes.dex */
public final class C2352p {

    /* JADX INFO: renamed from: a */
    public static C2352p f10949a;

    /* JADX INFO: renamed from: b */
    public C2339c f10950b;

    /* JADX INFO: renamed from: c */
    public GoogleSignInAccount f10951c;

    public C2352p(Context context) {
        C2339c c2339cM4912a = C2339c.m4912a(context);
        this.f10950b = c2339cM4912a;
        this.f10951c = c2339cM4912a.m4914b();
        this.f10950b.m4915c();
    }

    /* JADX INFO: renamed from: b */
    public static synchronized C2352p m4932b(Context context) {
        C2352p c2352p;
        Context applicationContext = context.getApplicationContext();
        synchronized (C2352p.class) {
            c2352p = f10949a;
            if (c2352p == null) {
                c2352p = new C2352p(applicationContext);
                f10949a = c2352p;
            }
        }
        return c2352p;
        return c2352p;
    }

    /* JADX INFO: renamed from: a */
    public final synchronized void m4933a() {
        C2339c c2339c = this.f10950b;
        c2339c.f10938c.lock();
        try {
            c2339c.f10939d.edit().clear().apply();
            c2339c.f10938c.unlock();
            this.f10951c = null;
        } catch (Throwable th) {
            c2339c.f10938c.unlock();
            throw th;
        }
    }
}
