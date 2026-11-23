package p636z0.p644b.p653h;

import android.graphics.Typeface;
import android.widget.TextView;

/* JADX INFO: renamed from: z0.b.h.y, reason: use source file name */
/* JADX INFO: compiled from: AppCompatTextHelper.java */
/* JADX INFO: loaded from: classes.dex */
public class AppCompatTextHelper2 implements Runnable {

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ TextView f35263f;

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ Typeface f35264g;

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ int f35265h;

    public AppCompatTextHelper2(AppCompatTextHelper appCompatTextHelper, TextView textView, Typeface typeface, int i) {
        this.f35263f = textView;
        this.f35264g = typeface;
        this.f35265h = i;
    }

    @Override // java.lang.Runnable
    public void run() {
        this.f35263f.setTypeface(this.f35264g, this.f35265h);
    }
}
