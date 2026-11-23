package p007c.p190n.p194b.p266d.p298f.p299o.p300n;

import android.app.PendingIntent;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import com.google.android.gms.common.api.internal.LifecycleCallback;
import java.util.concurrent.atomic.AtomicReference;
import p007c.p190n.p194b.p266d.p298f.C2602b;
import p007c.p190n.p194b.p266d.p298f.C2608e;
import p007c.p190n.p194b.p266d.p314j.p319e.HandlerC3807c;

/* JADX INFO: renamed from: c.n.b.d.f.o.n.c1 */
/* JADX INFO: compiled from: com.google.android.gms:play-services-base@@17.1.0 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractDialogInterfaceOnCancelListenerC2649c1 extends LifecycleCallback implements DialogInterface.OnCancelListener {

    /* JADX INFO: renamed from: g */
    public volatile boolean f11644g;

    /* JADX INFO: renamed from: h */
    public final AtomicReference<C2655e1> f11645h;

    /* JADX INFO: renamed from: i */
    public final Handler f11646i;

    /* JADX INFO: renamed from: j */
    public final C2608e f11647j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AbstractDialogInterfaceOnCancelListenerC2649c1(InterfaceC2668j interfaceC2668j) {
        super(interfaceC2668j);
        C2608e c2608e = C2608e.f11563d;
        this.f11645h = new AtomicReference<>(null);
        this.f11646i = new HandlerC3807c(Looper.getMainLooper());
        this.f11647j = c2608e;
    }

    @Override // com.google.android.gms.common.api.internal.LifecycleCallback
    /* JADX INFO: renamed from: c */
    public void mo5504c(int i, int i2, Intent intent) {
        C2655e1 c2655e1 = this.f11645h.get();
        boolean z = false;
        if (i != 1) {
            if (i == 2) {
                int iMo5206c = this.f11647j.mo5206c(m12663b());
                z = iMo5206c == 0;
                if (c2655e1 == null) {
                    return;
                }
                if (c2655e1.f11653b.f11553h == 18 && iMo5206c == 18) {
                    return;
                }
            }
        } else if (i2 == -1) {
            z = true;
        } else if (i2 == 0) {
            C2655e1 c2655e2 = new C2655e1(new C2602b(intent != null ? intent.getIntExtra("<<ResolutionFailureErrorDetail>>", 13) : 13, null, c2655e1.f11653b.toString()), c2655e1.f11652a);
            this.f11645h.set(c2655e2);
            c2655e1 = c2655e2;
        }
        if (z) {
            m5508j();
        } else if (c2655e1 != null) {
            mo5507i(c2655e1.f11653b, c2655e1.f11652a);
        }
    }

    @Override // com.google.android.gms.common.api.internal.LifecycleCallback
    /* JADX INFO: renamed from: d */
    public void mo5505d(Bundle bundle) {
        if (bundle != null) {
            this.f11645h.set(bundle.getBoolean("resolving_error", false) ? new C2655e1(new C2602b(bundle.getInt("failed_status"), (PendingIntent) bundle.getParcelable("failed_resolution")), bundle.getInt("failed_client_id", -1)) : null);
        }
    }

    @Override // com.google.android.gms.common.api.internal.LifecycleCallback
    /* JADX INFO: renamed from: f */
    public void mo5506f(Bundle bundle) {
        C2655e1 c2655e1 = this.f11645h.get();
        if (c2655e1 != null) {
            bundle.putBoolean("resolving_error", true);
            bundle.putInt("failed_client_id", c2655e1.f11652a);
            bundle.putInt("failed_status", c2655e1.f11653b.f11553h);
            bundle.putParcelable("failed_resolution", c2655e1.f11653b.f11554i);
        }
    }

    /* JADX INFO: renamed from: i */
    public abstract void mo5507i(C2602b c2602b, int i);

    /* JADX INFO: renamed from: j */
    public final void m5508j() {
        this.f11645h.set(null);
        Handler handler = ((C2695v) this).f11763l.f11672t;
        handler.sendMessage(handler.obtainMessage(3));
    }

    @Override // android.content.DialogInterface.OnCancelListener
    public void onCancel(DialogInterface dialogInterface) {
        C2602b c2602b = new C2602b(13, null);
        C2655e1 c2655e1 = this.f11645h.get();
        mo5507i(c2602b, c2655e1 == null ? -1 : c2655e1.f11652a);
        m5508j();
    }
}
