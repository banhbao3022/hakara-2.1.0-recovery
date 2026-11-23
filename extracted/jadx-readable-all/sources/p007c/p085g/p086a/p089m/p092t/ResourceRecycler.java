package p007c.p085g.p086a.p089m.p092t;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;

/* JADX INFO: renamed from: c.g.a.m.t.z, reason: use source file name */
/* JADX INFO: compiled from: ResourceRecycler.java */
/* JADX INFO: loaded from: classes.dex */
public class ResourceRecycler {

    /* JADX INFO: renamed from: a */
    public boolean f3389a;

    /* JADX INFO: renamed from: b */
    public final Handler f3390b = new Handler(Looper.getMainLooper(), new a());

    /* JADX INFO: renamed from: c.g.a.m.t.z$a */
    /* JADX INFO: compiled from: ResourceRecycler.java */
    public static final class a implements Handler.Callback {
        @Override // android.os.Handler.Callback
        public boolean handleMessage(Message message) {
            if (message.what != 1) {
                return false;
            }
            ((Resource2) message.obj).mo1830b();
            return true;
        }
    }

    /* JADX INFO: renamed from: a */
    public synchronized void m1845a(Resource2<?> resource2, boolean z) {
        if (this.f3389a || z) {
            this.f3390b.obtainMessage(1, resource2).sendToTarget();
        } else {
            this.f3389a = true;
            resource2.mo1830b();
            this.f3389a = false;
        }
    }
}
