package p007c.p154j.p157i;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import p007c.p154j.OnProgressListener;
import p007c.p154j.Progress;

/* JADX INFO: renamed from: c.j.i.a, reason: use source file name */
/* JADX INFO: compiled from: ProgressHandler.java */
/* JADX INFO: loaded from: classes.dex */
public class ProgressHandler extends Handler {

    /* JADX INFO: renamed from: a */
    public final OnProgressListener f4428a;

    public ProgressHandler(OnProgressListener onProgressListener) {
        super(Looper.getMainLooper());
        this.f4428a = onProgressListener;
    }

    @Override // android.os.Handler
    public void handleMessage(Message message) {
        if (message.what != 1) {
            super.handleMessage(message);
            return;
        }
        OnProgressListener onProgressListener = this.f4428a;
        if (onProgressListener != null) {
            onProgressListener.mo2223a((Progress) message.obj);
        }
    }
}
