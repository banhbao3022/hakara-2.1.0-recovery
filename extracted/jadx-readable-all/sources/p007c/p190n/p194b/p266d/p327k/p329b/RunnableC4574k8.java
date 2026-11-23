package p007c.p190n.p194b.p266d.p327k.p329b;

import android.os.RemoteException;
import android.text.TextUtils;
import java.util.Collections;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: renamed from: c.n.b.d.k.b.k8 */
/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement-impl@@18.0.0 */
/* JADX INFO: loaded from: classes.dex */
public final class RunnableC4574k8 implements Runnable {

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ AtomicReference f24076f;

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ String f24077g;

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ String f24078h;

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ String f24079i;

    /* JADX INFO: renamed from: j */
    public final /* synthetic */ boolean f24080j;

    /* JADX INFO: renamed from: k */
    public final /* synthetic */ C4480ca f24081k;

    /* JADX INFO: renamed from: l */
    public final /* synthetic */ C4677t7 f24082l;

    public RunnableC4574k8(C4677t7 c4677t7, AtomicReference atomicReference, String str, String str2, String str3, boolean z, C4480ca c4480ca) {
        this.f24082l = c4677t7;
        this.f24076f = atomicReference;
        this.f24077g = str;
        this.f24078h = str2;
        this.f24079i = str3;
        this.f24080j = z;
        this.f24081k = c4480ca;
    }

    @Override // java.lang.Runnable
    public final void run() {
        synchronized (this.f24076f) {
            try {
                try {
                    C4677t7 c4677t7 = this.f24082l;
                    InterfaceC4569k3 interfaceC4569k3 = c4677t7.f24455d;
                    if (interfaceC4569k3 == null) {
                        c4677t7.mo10684l().f24418f.m10814d("(legacy) Failed to get user properties; not connected to service", C4662s3.m10738s(this.f24077g), this.f24078h, this.f24079i);
                        this.f24076f.set(Collections.emptyList());
                        this.f24076f.notify();
                    } else {
                        if (TextUtils.isEmpty(this.f24077g)) {
                            this.f24076f.set(interfaceC4569k3.mo10407v3(this.f24078h, this.f24079i, this.f24080j, this.f24081k));
                        } else {
                            this.f24076f.set(interfaceC4569k3.mo10390I1(this.f24077g, this.f24078h, this.f24079i, this.f24080j));
                        }
                        this.f24082l.m10772F();
                        this.f24076f.notify();
                    }
                } catch (RemoteException e) {
                    this.f24082l.mo10684l().f24418f.m10814d("(legacy) Failed to get user properties; remote exception", C4662s3.m10738s(this.f24077g), this.f24078h, e);
                    this.f24076f.set(Collections.emptyList());
                    this.f24076f.notify();
                }
            } catch (Throwable th) {
                this.f24076f.notify();
                throw th;
            }
        }
    }
}
