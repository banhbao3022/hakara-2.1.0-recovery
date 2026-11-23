package p007c.p190n.p194b.p266d.p290d.p291r.p292l.p293i;

import android.content.Context;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.AsyncTask;
import p007c.p190n.p194b.p266d.p290d.p291r.p292l.C2446b;

/* JADX INFO: renamed from: c.n.b.d.d.r.l.i.a */
/* JADX INFO: compiled from: com.google.android.gms:play-services-cast-framework@@18.1.0 */
/* JADX INFO: loaded from: classes.dex */
public final class C2460a implements InterfaceC2463d {

    /* JADX INFO: renamed from: a */
    public final Context f11310a;

    /* JADX INFO: renamed from: b */
    public final C2446b f11311b;

    /* JADX INFO: renamed from: c */
    public Uri f11312c;

    /* JADX INFO: renamed from: d */
    public AsyncTaskC2461b f11313d;

    /* JADX INFO: renamed from: e */
    public Bitmap f11314e;

    /* JADX INFO: renamed from: f */
    public boolean f11315f;

    /* JADX INFO: renamed from: g */
    public InterfaceC2462c f11316g;

    public C2460a(Context context) {
        this(context, new C2446b(-1, 0, 0));
    }

    /* JADX INFO: renamed from: a */
    public final void m5089a() {
        m5090b();
        this.f11316g = null;
    }

    /* JADX INFO: renamed from: b */
    public final void m5090b() {
        AsyncTaskC2461b asyncTaskC2461b = this.f11313d;
        if (asyncTaskC2461b != null) {
            asyncTaskC2461b.cancel(true);
            this.f11313d = null;
        }
        this.f11312c = null;
        this.f11314e = null;
        this.f11315f = false;
    }

    /* JADX INFO: renamed from: c */
    public final boolean m5091c(Uri uri) {
        int i;
        if (uri == null) {
            m5090b();
            return true;
        }
        if (uri.equals(this.f11312c)) {
            return this.f11315f;
        }
        m5090b();
        this.f11312c = uri;
        C2446b c2446b = this.f11311b;
        int i2 = c2446b.f11209g;
        if (i2 == 0 || (i = c2446b.f11210h) == 0) {
            this.f11313d = new AsyncTaskC2461b(this.f11310a, this);
        } else {
            this.f11313d = new AsyncTaskC2461b(this.f11310a, i2, i, false, this);
        }
        this.f11313d.executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, this.f11312c);
        return false;
    }

    public C2460a(Context context, C2446b c2446b) {
        this.f11310a = context;
        this.f11311b = c2446b;
        new C2466g();
        m5090b();
    }
}
