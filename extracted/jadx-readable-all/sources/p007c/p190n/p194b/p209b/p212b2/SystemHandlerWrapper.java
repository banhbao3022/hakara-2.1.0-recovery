package p007c.p190n.p194b.p209b.p212b2;

import android.os.Handler;
import android.os.Message;

/* JADX INFO: renamed from: c.n.b.b.b2.e0, reason: use source file name */
/* JADX INFO: compiled from: SystemHandlerWrapper.java */
/* JADX INFO: loaded from: classes.dex */
public final class SystemHandlerWrapper {

    /* JADX INFO: renamed from: a */
    public final Handler f6291a;

    public SystemHandlerWrapper(Handler handler) {
        this.f6291a = handler;
    }

    /* JADX INFO: renamed from: a */
    public Message m3071a(int i) {
        return this.f6291a.obtainMessage(i);
    }

    /* JADX INFO: renamed from: b */
    public Message m3072b(int i, int i2, int i3) {
        return this.f6291a.obtainMessage(i, i2, i3);
    }

    /* JADX INFO: renamed from: c */
    public Message m3073c(int i, Object obj) {
        return this.f6291a.obtainMessage(i, obj);
    }

    /* JADX INFO: renamed from: d */
    public boolean m3074d(int i) {
        return this.f6291a.sendEmptyMessage(i);
    }
}
