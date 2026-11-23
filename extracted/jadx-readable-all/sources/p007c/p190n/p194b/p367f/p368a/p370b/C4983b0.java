package p007c.p190n.p194b.p367f.p368a.p370b;

import android.os.ParcelFileDescriptor;
import java.io.InputStream;
import java.util.concurrent.ExecutionException;
import p007c.p190n.p194b.p334e.C4799a;
import p007c.p190n.p194b.p367f.p368a.p373d.InterfaceC5086d0;

/* JADX INFO: renamed from: c.n.b.f.a.b.b0 */
/* JADX INFO: loaded from: classes.dex */
public final class C4983b0 {

    /* JADX INFO: renamed from: a */
    public final InterfaceC5086d0<InterfaceC5037o2> f25704a;

    public C4983b0(InterfaceC5086d0<InterfaceC5037o2> interfaceC5086d0) {
        this.f25704a = interfaceC5086d0;
    }

    /* JADX INFO: renamed from: a */
    public final InputStream m11425a(int i, String str, String str2, int i2) {
        try {
            ParcelFileDescriptor parcelFileDescriptor = (ParcelFileDescriptor) C4799a.m10980c(this.f25704a.m11529a().mo11437e(i, str, str2, i2));
            if (parcelFileDescriptor == null || parcelFileDescriptor.getFileDescriptor() == null) {
                throw new C5011i0(String.format("Corrupted ParcelFileDescriptor, session %s packName %s sliceId %s, chunkNumber %s", Integer.valueOf(i), str, str2, Integer.valueOf(i2)), i);
            }
            return new ParcelFileDescriptor.AutoCloseInputStream(parcelFileDescriptor);
        } catch (InterruptedException e) {
            throw new C5011i0("Extractor was interrupted while waiting for chunk file.", e, i);
        } catch (ExecutionException e2) {
            throw new C5011i0(String.format("Error opening chunk file, session %s packName %s sliceId %s, chunkNumber %s", Integer.valueOf(i), str, str2, Integer.valueOf(i2)), e2, i);
        }
    }
}
