package p007c.p190n.p194b.p266d.p314j.p315a;

import android.util.Base64OutputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import p007c.p190n.p194b.p266d.p298f.C2622l;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* JADX INFO: loaded from: classes.dex */
public final class mq2 {

    /* JADX INFO: renamed from: a */
    public ByteArrayOutputStream f16835a = new ByteArrayOutputStream(4096);

    /* JADX INFO: renamed from: b */
    public Base64OutputStream f16836b = new Base64OutputStream(this.f16835a, 10);

    /* JADX WARN: Multi-variable type inference failed */
    public final String toString() {
        try {
            this.f16836b.close();
        } catch (IOException e) {
            C2622l.m5438t3("HashManager: Unable to convert to Base64.", e);
        }
        try {
            this.f16835a.close();
            return this.f16835a.toString();
        } catch (IOException e2) {
            C2622l.m5438t3("HashManager: Unable to convert to Base64.", e2);
            return "";
        } finally {
            this.f16835a = null;
            this.f16836b = null;
        }
    }
}
