package p007c.p190n.p194b.p266d.p290d.p291r.p292l.p293i;

import android.content.Context;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.AsyncTask;
import android.os.RemoteException;
import p007c.p190n.p194b.p266d.p290d.p295s.C2518b;
import p007c.p190n.p194b.p266d.p310g.BinderC2800b;
import p007c.p190n.p194b.p266d.p314j.p320f.C3858f;
import p007c.p190n.p194b.p266d.p314j.p320f.InterfaceC3878h;

/* JADX INFO: renamed from: c.n.b.d.d.r.l.i.b */
/* JADX INFO: compiled from: com.google.android.gms:play-services-cast-framework@@18.1.0 */
/* JADX INFO: loaded from: classes.dex */
public final class AsyncTaskC2461b extends AsyncTask<Uri, Long, Bitmap> {

    /* JADX INFO: renamed from: a */
    public static final C2518b f11317a = new C2518b("FetchBitmapTask");

    /* JADX INFO: renamed from: b */
    public final InterfaceC2467h f11318b;

    /* JADX INFO: renamed from: c */
    public final InterfaceC2463d f11319c;

    public AsyncTaskC2461b(Context context, InterfaceC2463d interfaceC2463d) {
        this(context, 0, 0, false, 2097152L, 5, 333, 10000, interfaceC2463d);
    }

    @Override // android.os.AsyncTask
    public final Bitmap doInBackground(Uri[] uriArr) {
        Uri[] uriArr2 = uriArr;
        if (uriArr2.length != 1 || uriArr2[0] == null) {
            return null;
        }
        try {
            return this.f11318b.mo5093K5(uriArr2[0]);
        } catch (RemoteException e) {
            f11317a.m5120b(e, "Unable to call %s on %s.", "doFetch", InterfaceC2467h.class.getSimpleName());
            return null;
        }
    }

    @Override // android.os.AsyncTask
    public final void onPostExecute(Bitmap bitmap) {
        Bitmap bitmap2 = bitmap;
        InterfaceC2463d interfaceC2463d = this.f11319c;
        if (interfaceC2463d != null) {
            C2460a c2460a = (C2460a) interfaceC2463d;
            c2460a.f11314e = bitmap2;
            c2460a.f11315f = true;
            InterfaceC2462c interfaceC2462c = c2460a.f11316g;
            if (interfaceC2462c != null) {
                interfaceC2462c.mo5055a(bitmap2);
            }
            c2460a.f11313d = null;
        }
    }

    public AsyncTaskC2461b(Context context, int i, int i2, boolean z, InterfaceC2463d interfaceC2463d) {
        this(context, i, i2, false, 2097152L, 5, 333, 10000, interfaceC2463d);
    }

    public AsyncTaskC2461b(Context context, int i, int i2, boolean z, long j2, int i3, int i4, int i5, InterfaceC2463d interfaceC2463d) {
        Context applicationContext = context.getApplicationContext();
        InterfaceC2467h interfaceC2467hMo9030D4 = null;
        BinderC2465f binderC2465f = new BinderC2465f(this, null);
        C2518b c2518b = C3858f.f22572a;
        try {
            interfaceC2467hMo9030D4 = C3858f.m9021a(applicationContext.getApplicationContext()).mo9030D4(new BinderC2800b(this), binderC2465f, i, i2, z, 2097152L, 5, 333, 10000);
        } catch (RemoteException e) {
            C3858f.f22572a.m5120b(e, "Unable to call %s on %s.", "newFetchBitmapTaskImpl", InterfaceC3878h.class.getSimpleName());
        }
        this.f11318b = interfaceC2467hMo9030D4;
        this.f11319c = interfaceC2463d;
    }
}
