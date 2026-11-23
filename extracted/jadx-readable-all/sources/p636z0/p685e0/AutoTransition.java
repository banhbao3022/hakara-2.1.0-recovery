package p636z0.p685e0;

import android.content.Context;
import android.util.AttributeSet;

/* JADX INFO: renamed from: z0.e0.a, reason: use source file name */
/* JADX INFO: compiled from: AutoTransition.java */
/* JADX INFO: loaded from: classes.dex */
public class AutoTransition extends TransitionSet {
    public AutoTransition() {
        m15459T();
    }

    /* JADX INFO: renamed from: T */
    public final void m15459T() {
        m15528S(1);
        m15524O(new Fade(2));
        m15524O(new ChangeBounds());
        m15524O(new Fade(1));
    }

    public AutoTransition(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        m15459T();
    }
}
