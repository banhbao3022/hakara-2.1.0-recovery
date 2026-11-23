package p636z0.p667e.p668a.p670e.p671w1.p674q;

import android.util.Range;
import p636z0.p667e.p668a.p670e.p671w1.p673p.AeFpsRangeLegacyQuirk;
import p636z0.p667e.p676b.p677v1.Quirks;

/* JADX INFO: renamed from: z0.e.a.e.w1.q.a, reason: use source file name */
/* JADX INFO: compiled from: AeFpsRange.java */
/* JADX INFO: loaded from: classes.dex */
public class AeFpsRange {

    /* JADX INFO: renamed from: a */
    public final Range<Integer> f35825a;

    public AeFpsRange(Quirks quirks) {
        AeFpsRangeLegacyQuirk aeFpsRangeLegacyQuirk = (AeFpsRangeLegacyQuirk) quirks.m15353a(AeFpsRangeLegacyQuirk.class);
        if (aeFpsRangeLegacyQuirk == null) {
            this.f35825a = null;
        } else {
            this.f35825a = aeFpsRangeLegacyQuirk.f35818a;
        }
    }
}
