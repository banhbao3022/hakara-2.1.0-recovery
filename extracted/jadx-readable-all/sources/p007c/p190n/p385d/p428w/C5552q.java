package p007c.p190n.p385d.p428w;

import android.graphics.Bitmap;
import android.util.Log;
import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.util.logging.Level;
import java.util.logging.Logger;
import p007c.p190n.p194b.p266d.p314j.p323i.C4069d;
import p007c.p190n.p194b.p266d.p333n.AbstractC4781i;

/* JADX INFO: renamed from: c.n.d.w.q */
/* JADX INFO: compiled from: com.google.firebase:firebase-messaging@@21.0.1 */
/* JADX INFO: loaded from: classes.dex */
public class C5552q implements Closeable {

    /* JADX INFO: renamed from: f */
    public final URL f27284f;

    /* JADX INFO: renamed from: g */
    public AbstractC4781i<Bitmap> f27285g;

    /* JADX INFO: renamed from: h */
    public volatile InputStream f27286h;

    public C5552q(URL url) {
        this.f27284f = url;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        try {
            InputStream inputStream = this.f27286h;
            Logger logger = C4069d.f23013a;
            if (inputStream == null) {
                return;
            }
            try {
                inputStream.close();
            } catch (IOException e) {
                try {
                    C4069d.f23013a.logp(Level.WARNING, "com.google.common.io.Closeables", "close", "IOException thrown while closing Closeable.", (Throwable) e);
                } catch (IOException e2) {
                    throw new AssertionError(e2);
                }
            }
        } catch (NullPointerException e3) {
            Log.e("FirebaseMessaging", "Failed to close the image download stream.", e3);
        }
    }
}
