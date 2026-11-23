package p007c.p190n.p194b.p266d.p298f;

import java.lang.ref.WeakReference;

/* JADX INFO: renamed from: c.n.b.d.f.f0 */
/* JADX INFO: compiled from: com.google.android.gms:play-services-basement@@17.6.0 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractBinderC2611f0 extends AbstractBinderC2607d0 {

    /* JADX INFO: renamed from: h */
    public static final WeakReference<byte[]> f11569h = new WeakReference<>(null);

    /* JADX INFO: renamed from: i */
    public WeakReference<byte[]> f11570i;

    public AbstractBinderC2611f0(byte[] bArr) {
        super(bArr);
        this.f11570i = f11569h;
    }

    /* JADX INFO: renamed from: K2 */
    public abstract byte[] mo5194K2();

    @Override // p007c.p190n.p194b.p266d.p298f.AbstractBinderC2607d0
    /* JADX INFO: renamed from: i1 */
    public final byte[] mo5202i1() {
        byte[] bArrMo5194K2;
        synchronized (this) {
            bArrMo5194K2 = this.f11570i.get();
            if (bArrMo5194K2 == null) {
                bArrMo5194K2 = mo5194K2();
                this.f11570i = new WeakReference<>(bArrMo5194K2);
            }
        }
        return bArrMo5194K2;
    }
}
