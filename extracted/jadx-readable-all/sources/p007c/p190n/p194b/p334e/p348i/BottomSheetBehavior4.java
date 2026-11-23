package p007c.p190n.p194b.p334e.p348i;

import android.view.View;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import p636z0.p725k.p739l.p740b0.AccessibilityViewCommand;

/* JADX INFO: renamed from: c.n.b.e.i.c, reason: use source file name */
/* JADX INFO: compiled from: BottomSheetBehavior.java */
/* JADX INFO: loaded from: classes.dex */
public class BottomSheetBehavior4 implements AccessibilityViewCommand {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f25057a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ BottomSheetBehavior f25058b;

    public BottomSheetBehavior4(BottomSheetBehavior bottomSheetBehavior, int i) {
        this.f25058b = bottomSheetBehavior;
        this.f25057a = i;
    }

    @Override // p636z0.p725k.p739l.p740b0.AccessibilityViewCommand
    /* JADX INFO: renamed from: a */
    public boolean mo935a(View view, AccessibilityViewCommand.a aVar) {
        this.f25058b.m12740K(this.f25057a);
        return true;
    }
}
