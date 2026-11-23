package p007c.p190n.p194b.p266d.p314j.p315a;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* JADX INFO: loaded from: classes.dex */
public final class ji0 implements cs1<lv2, Bitmap> {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ double f15598a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ boolean f15599b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ ki0 f15600c;

    public ji0(ki0 ki0Var, double d, boolean z) {
        this.f15600c = ki0Var;
        this.f15598a = d;
        this.f15599b = z;
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.cs1
    public final Bitmap apply(lv2 lv2Var) {
        ki0 ki0Var = this.f15600c;
        byte[] bArr = lv2Var.f16617b;
        double d = this.f15598a;
        boolean z = this.f15599b;
        BitmapFactory.Options options = new BitmapFactory.Options();
        options.inDensity = (int) (d * 160.0d);
        if (!z) {
            options.inPreferredConfig = Bitmap.Config.RGB_565;
        }
        AbstractC3718y2<Boolean> abstractC3718y2 = C3052g3.f14218K3;
        C2862b c2862b = C2862b.f12493a;
        if (((Boolean) c2862b.f12496d.m6596a(abstractC3718y2)).booleanValue()) {
            options.inJustDecodeBounds = true;
            ki0Var.m7500a(bArr, options);
            options.inJustDecodeBounds = false;
            int i = options.outWidth * options.outHeight;
            if (i > 0) {
                options.inSampleSize = 1 << ((33 - Integer.numberOfLeadingZeros((i - 1) / ((Integer) c2862b.f12496d.m6596a(C3052g3.f14224L3)).intValue())) / 2);
            }
        }
        return ki0Var.m7500a(bArr, options);
    }
}
