package p007c.p190n.p194b.p266d.p314j.p315a;

import android.content.Context;
import android.view.View;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* JADX INFO: loaded from: classes.dex */
public final class ld2 implements Runnable {

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ Context f16321f;

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ View f16322g;

    public ld2(Context context, View view) {
        this.f16321f = context;
        this.f16322g = view;
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            pd2.f17936z.mo4853b(this.f16321f, this.f16322g, null);
        } catch (Exception e) {
            pd2.f17931B.m7914c(2020, -1L, e);
        }
    }
}
