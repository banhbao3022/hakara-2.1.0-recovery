package p007c.p190n.p194b.p367f.p368a.p370b;

import java.util.Map;
import p007c.p071d.p078c.p079a.outline;
import p007c.p190n.p194b.p367f.p368a.p370b.p371h2.C5009a;
import p007c.p190n.p194b.p367f.p368a.p377h.AbstractC5152p;

/* JADX INFO: renamed from: c.n.b.f.a.b.a */
/* JADX INFO: loaded from: classes.dex */
public class C4978a extends AbstractC5152p {
    /* JADX WARN: Illegal instructions before constructor call */
    public C4978a(int i) {
        String strM1553D;
        Object[] objArr = new Object[2];
        objArr[0] = Integer.valueOf(i);
        Map<Integer, String> map = C5009a.f25821a;
        Integer numValueOf = Integer.valueOf(i);
        if (map.containsKey(numValueOf)) {
            String str = map.get(numValueOf);
            String str2 = C5009a.f25822b.get(numValueOf);
            strM1553D = outline.m1553D(new StringBuilder(String.valueOf(str).length() + 113 + String.valueOf(str2).length()), str, " (https://developer.android.com/reference/com/google/android/play/core/assetpacks/model/AssetPackErrorCode.html#", str2, ")");
        } else {
            strM1553D = "";
        }
        objArr[1] = strM1553D;
        super(String.format("Asset Pack Download Error(%d): %s", objArr));
        if (i == 0) {
            throw new IllegalArgumentException("errorCode should not be 0.");
        }
    }
}
