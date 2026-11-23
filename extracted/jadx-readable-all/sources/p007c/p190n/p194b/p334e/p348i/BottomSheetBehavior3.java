package p007c.p190n.p194b.p334e.p348i;

import android.view.View;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import p007c.p190n.p194b.p334e.p360t.ViewUtils3;
import p007c.p190n.p194b.p334e.p360t.ViewUtils4;
import p636z0.p725k.p739l.WindowInsetsCompat;

/* JADX INFO: renamed from: c.n.b.e.i.b, reason: use source file name */
/* JADX INFO: compiled from: BottomSheetBehavior.java */
/* JADX INFO: loaded from: classes.dex */
public class BottomSheetBehavior3 implements ViewUtils3 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ BottomSheetBehavior f25056a;

    public BottomSheetBehavior3(BottomSheetBehavior bottomSheetBehavior) {
        this.f25056a = bottomSheetBehavior;
    }

    @Override // p007c.p190n.p194b.p334e.p360t.ViewUtils3
    /* JADX INFO: renamed from: a */
    public WindowInsetsCompat mo11121a(View view, WindowInsetsCompat windowInsetsCompat, ViewUtils4 viewUtils4) {
        this.f25056a.f28846j = windowInsetsCompat.f37981b.mo16256g().f37854e;
        this.f25056a.m12749T(false);
        return windowInsetsCompat;
    }
}
