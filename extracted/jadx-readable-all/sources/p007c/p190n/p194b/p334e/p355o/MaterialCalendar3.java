package p007c.p190n.p194b.p334e.p355o;

import android.view.View;
import mtp.media.karaoke.R;
import p636z0.p725k.p739l.AccessibilityDelegateCompat;
import p636z0.p725k.p739l.p740b0.AccessibilityNodeInfoCompat;

/* JADX INFO: renamed from: c.n.b.e.o.i, reason: use source file name */
/* JADX INFO: compiled from: MaterialCalendar.java */
/* JADX INFO: loaded from: classes.dex */
public class MaterialCalendar3 extends AccessibilityDelegateCompat {

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ MaterialCalendar f25254d;

    public MaterialCalendar3(MaterialCalendar materialCalendar) {
        this.f25254d = materialCalendar;
    }

    @Override // p636z0.p725k.p739l.AccessibilityDelegateCompat
    /* JADX INFO: renamed from: d */
    public void mo382d(View view, AccessibilityNodeInfoCompat accessibilityNodeInfoCompat) {
        this.f37977b.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfoCompat.f38018b);
        accessibilityNodeInfoCompat.m16274r(this.f25254d.f25245n0.getVisibility() == 0 ? this.f25254d.m16546Q(R.string.mtrl_picker_toggle_to_year_selection) : this.f25254d.m16546Q(R.string.mtrl_picker_toggle_to_day_selection));
    }
}
