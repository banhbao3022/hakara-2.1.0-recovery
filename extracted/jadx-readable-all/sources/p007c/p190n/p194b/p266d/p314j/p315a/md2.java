package p007c.p190n.p194b.p266d.p314j.p315a;

import android.app.Activity;
import android.content.Context;
import android.view.View;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* JADX INFO: loaded from: classes.dex */
public final class md2 implements Runnable {

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ Context f16729f;

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ String f16730g;

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ View f16731h;

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ Activity f16732i;

    public md2(Context context, String str, View view, Activity activity) {
        this.f16729f = context;
        this.f16730g = str;
        this.f16731h = view;
        this.f16732i = activity;
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            pd2.f17936z.mo4854c(this.f16729f, this.f16730g, this.f16731h, this.f16732i);
        } catch (Exception e) {
            pd2.f17931B.m7914c(2021, -1L, e);
        }
    }
}
