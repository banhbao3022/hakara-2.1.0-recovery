package p636z0.p667e.p668a.p670e.p671w1.p673p;

import android.hardware.camera2.CameraCharacteristics;
import android.util.Range;
import com.facebook.stetho.websocket.CloseCodes;
import p636z0.p667e.p668a.p670e.p671w1.CameraCharacteristicsCompat;
import p636z0.p667e.p676b.p677v1.Quirk;

/* JADX INFO: renamed from: z0.e.a.e.w1.p.a, reason: use source file name */
/* JADX INFO: compiled from: AeFpsRangeLegacyQuirk.java */
/* JADX INFO: loaded from: classes.dex */
public class AeFpsRangeLegacyQuirk implements Quirk {

    /* JADX INFO: renamed from: a */
    public final Range<Integer> f35818a;

    public AeFpsRangeLegacyQuirk(CameraCharacteristicsCompat cameraCharacteristicsCompat) {
        Range[] rangeArr = (Range[]) cameraCharacteristicsCompat.m15209a(CameraCharacteristics.CONTROL_AE_AVAILABLE_TARGET_FPS_RANGES);
        Range<Integer> range = null;
        if (rangeArr != null && rangeArr.length != 0) {
            for (Range range2 : rangeArr) {
                Range<Integer> range3 = new Range<>(Integer.valueOf(((Integer) range2.getLower()).intValue() >= 1000 ? ((Integer) range2.getLower()).intValue() / CloseCodes.NORMAL_CLOSURE : ((Integer) range2.getLower()).intValue()), Integer.valueOf(((Integer) range2.getUpper()).intValue() >= 1000 ? ((Integer) range2.getUpper()).intValue() / CloseCodes.NORMAL_CLOSURE : ((Integer) range2.getUpper()).intValue()));
                if (((Integer) range3.getUpper()).intValue() == 30 && (range == null || ((Integer) range3.getLower()).intValue() < ((Integer) range.getLower()).intValue())) {
                    range = range3;
                }
            }
        }
        this.f35818a = range;
    }
}
