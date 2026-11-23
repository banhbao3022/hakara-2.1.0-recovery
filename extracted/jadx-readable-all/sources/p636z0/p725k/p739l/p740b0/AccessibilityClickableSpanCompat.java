package p636z0.p725k.p739l.p740b0;

import android.os.Bundle;
import android.text.style.ClickableSpan;
import android.view.View;

/* JADX INFO: renamed from: z0.k.l.b0.a, reason: use source file name */
/* JADX INFO: compiled from: AccessibilityClickableSpanCompat.java */
/* JADX INFO: loaded from: classes.dex */
public final class AccessibilityClickableSpanCompat extends ClickableSpan {

    /* JADX INFO: renamed from: f */
    public final int f38014f;

    /* JADX INFO: renamed from: g */
    public final AccessibilityNodeInfoCompat f38015g;

    /* JADX INFO: renamed from: h */
    public final int f38016h;

    public AccessibilityClickableSpanCompat(int i, AccessibilityNodeInfoCompat accessibilityNodeInfoCompat, int i2) {
        this.f38014f = i;
        this.f38015g = accessibilityNodeInfoCompat;
        this.f38016h = i2;
    }

    @Override // android.text.style.ClickableSpan
    public void onClick(View view) {
        Bundle bundle = new Bundle();
        bundle.putInt("ACCESSIBILITY_CLICKABLE_SPAN_ID", this.f38014f);
        AccessibilityNodeInfoCompat accessibilityNodeInfoCompat = this.f38015g;
        accessibilityNodeInfoCompat.f38018b.performAction(this.f38016h, bundle);
    }
}
