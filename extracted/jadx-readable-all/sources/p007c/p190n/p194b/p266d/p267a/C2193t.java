package p007c.p190n.p194b.p266d.p267a;

import android.os.RemoteException;
import androidx.annotation.RecentlyNonNull;
import p007c.p190n.p194b.p266d.p298f.C2622l;
import p007c.p190n.p194b.p266d.p314j.p315a.BinderC3273m2;
import p007c.p190n.p194b.p266d.p314j.p315a.InterfaceC3087h1;

/* JADX INFO: renamed from: c.n.b.d.a.t */
/* JADX INFO: compiled from: com.google.android.gms:play-services-ads-lite@@20.1.0 */
/* JADX INFO: loaded from: classes.dex */
public final class C2193t {

    /* JADX INFO: renamed from: a */
    public final Object f10590a = new Object();

    /* JADX INFO: renamed from: b */
    public InterfaceC3087h1 f10591b;

    /* JADX INFO: renamed from: c */
    public a f10592c;

    /* JADX INFO: renamed from: c.n.b.d.a.t$a */
    /* JADX INFO: compiled from: com.google.android.gms:play-services-ads-lite@@20.1.0 */
    public static abstract class a {
        /* JADX INFO: renamed from: a */
        public void mo4637a() {
        }

        /* JADX INFO: renamed from: b */
        public void mo4638b() {
        }

        /* JADX INFO: renamed from: c */
        public void mo4639c() {
        }
    }

    /* JADX INFO: renamed from: a */
    public void m4635a(@RecentlyNonNull a aVar) {
        C2622l.m5379i(aVar, "VideoLifecycleCallbacks may not be null.");
        synchronized (this.f10590a) {
            this.f10592c = aVar;
            InterfaceC3087h1 interfaceC3087h1 = this.f10591b;
            if (interfaceC3087h1 != null) {
                try {
                    interfaceC3087h1.mo5775g4(new BinderC3273m2(aVar));
                } catch (RemoteException e) {
                    C2622l.m5438t3("Unable to call setVideoLifecycleCallbacks on video controller.", e);
                }
            }
        }
    }

    /* JADX INFO: renamed from: b */
    public final void m4636b(InterfaceC3087h1 interfaceC3087h1) {
        synchronized (this.f10590a) {
            this.f10591b = interfaceC3087h1;
            a aVar = this.f10592c;
            if (aVar != null) {
                m4635a(aVar);
            }
        }
    }
}
