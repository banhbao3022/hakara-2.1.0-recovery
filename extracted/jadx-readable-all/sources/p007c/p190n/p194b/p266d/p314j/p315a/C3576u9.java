package p007c.p190n.p194b.p266d.p314j.p315a;

import android.os.Parcel;
import android.os.ParcelFileDescriptor;

/* JADX INFO: renamed from: c.n.b.d.j.a.u9 */
/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* JADX INFO: loaded from: classes.dex */
public final class C3576u9 implements qu1<C3502s9, ParcelFileDescriptor> {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ C3280m9 f20244a;

    public C3576u9(C3280m9 c3280m9) {
        this.f20244a = c3280m9;
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.qu1
    /* JADX INFO: renamed from: a */
    public final kv1<ParcelFileDescriptor> mo4612a(C3502s9 c3502s9) throws Exception {
        C3502s9 c3502s10 = c3502s9;
        C3147io c3147io = new C3147io();
        C3280m9 c3280m9 = this.f20244a;
        BinderC3539t9 binderC3539t9 = new BinderC3539t9(c3147io);
        Parcel parcelM7001E0 = c3502s10.m7001E0();
        ig2.m7251b(parcelM7001E0, c3280m9);
        ig2.m7253d(parcelM7001E0, binderC3539t9);
        try {
            c3502s10.f14577f.transact(2, parcelM7001E0, null, 1);
            return c3147io;
        } finally {
            parcelM7001E0.recycle();
        }
    }
}
