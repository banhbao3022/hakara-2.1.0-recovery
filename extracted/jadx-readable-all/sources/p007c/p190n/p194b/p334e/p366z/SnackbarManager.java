package p007c.p190n.p194b.p334e.p366z;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import java.util.Objects;

/* JADX INFO: renamed from: c.n.b.e.z.e, reason: use source file name */
/* JADX INFO: compiled from: SnackbarManager.java */
/* JADX INFO: loaded from: classes.dex */
public class SnackbarManager {

    /* JADX INFO: renamed from: a */
    public static SnackbarManager f25689a;

    /* JADX INFO: renamed from: b */
    public final Object f25690b = new Object();

    /* JADX INFO: renamed from: c */
    public final Handler f25691c = new Handler(Looper.getMainLooper(), new a());

    /* JADX INFO: renamed from: c.n.b.e.z.e$a */
    /* JADX INFO: compiled from: SnackbarManager.java */
    public class a implements Handler.Callback {
        public a() {
        }

        @Override // android.os.Handler.Callback
        public boolean handleMessage(Message message) {
            if (message.what != 0) {
                return false;
            }
            SnackbarManager snackbarManager = SnackbarManager.this;
            b bVar = (b) message.obj;
            synchronized (snackbarManager.f25690b) {
                try {
                    if (bVar == null) {
                        Objects.requireNonNull(bVar);
                        throw null;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            return true;
        }
    }

    /* JADX INFO: renamed from: c.n.b.e.z.e$b */
    /* JADX INFO: compiled from: SnackbarManager.java */
    public static class b {
    }
}
