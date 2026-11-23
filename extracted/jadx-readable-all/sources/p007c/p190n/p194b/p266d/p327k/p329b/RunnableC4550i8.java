package p007c.p190n.p194b.p266d.p327k.p329b;

import android.os.RemoteException;
import android.text.TextUtils;
import java.util.Collections;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: renamed from: c.n.b.d.k.b.i8 */
/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement-impl@@18.0.0 */
/* JADX INFO: loaded from: classes.dex */
public final class RunnableC4550i8 implements Runnable {

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ AtomicReference f24003f;

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ String f24004g;

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ String f24005h;

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ String f24006i;

    /* JADX INFO: renamed from: j */
    public final /* synthetic */ C4480ca f24007j;

    /* JADX INFO: renamed from: k */
    public final /* synthetic */ C4677t7 f24008k;

    public RunnableC4550i8(C4677t7 c4677t7, AtomicReference atomicReference, String str, String str2, String str3, C4480ca c4480ca) {
        this.f24008k = c4677t7;
        this.f24003f = atomicReference;
        this.f24004g = str;
        this.f24005h = str2;
        this.f24006i = str3;
        this.f24007j = c4480ca;
    }

    @Override // java.lang.Runnable
    public final void run() {
        synchronized (this.f24003f) {
            try {
                try {
                    C4677t7 c4677t7 = this.f24008k;
                    InterfaceC4569k3 interfaceC4569k3 = c4677t7.f24455d;
                    if (interfaceC4569k3 == null) {
                        c4677t7.mo10684l().f24418f.m10814d("(legacy) Failed to get conditional properties; not connected to service", C4662s3.m10738s(this.f24004g), this.f24005h, this.f24006i);
                        this.f24003f.set(Collections.emptyList());
                        this.f24003f.notify();
                    } else {
                        if (TextUtils.isEmpty(this.f24004g)) {
                            this.f24003f.set(interfaceC4569k3.mo10399g3(this.f24005h, this.f24006i, this.f24007j));
                        } else {
                            this.f24003f.set(interfaceC4569k3.mo10397b3(this.f24004g, this.f24005h, this.f24006i));
                        }
                        this.f24008k.m10772F();
                        this.f24003f.notify();
                    }
                } catch (RemoteException e) {
                    this.f24008k.mo10684l().f24418f.m10814d("(legacy) Failed to get conditional properties; remote exception", C4662s3.m10738s(this.f24004g), this.f24005h, e);
                    this.f24003f.set(Collections.emptyList());
                    this.f24003f.notify();
                }
            } catch (Throwable th) {
                this.f24003f.notify();
                throw th;
            }
        }
    }
}
