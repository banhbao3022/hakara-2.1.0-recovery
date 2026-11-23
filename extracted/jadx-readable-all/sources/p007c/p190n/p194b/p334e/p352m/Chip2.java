package p007c.p190n.p194b.p334e.p352m;

import android.annotation.TargetApi;
import android.graphics.Outline;
import android.view.View;
import android.view.ViewOutlineProvider;
import com.google.android.material.chip.Chip;

/* JADX INFO: renamed from: c.n.b.e.m.a, reason: use source file name */
/* JADX INFO: compiled from: Chip.java */
/* JADX INFO: loaded from: classes.dex */
public class Chip2 extends ViewOutlineProvider {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ Chip f25119a;

    public Chip2(Chip chip) {
        this.f25119a = chip;
    }

    @Override // android.view.ViewOutlineProvider
    @TargetApi(21)
    public void getOutline(View view, Outline outline) {
        ChipDrawable chipDrawable = this.f25119a.f28916l;
        if (chipDrawable != null) {
            chipDrawable.getOutline(outline);
        } else {
            outline.setAlpha(0.0f);
        }
    }
}
