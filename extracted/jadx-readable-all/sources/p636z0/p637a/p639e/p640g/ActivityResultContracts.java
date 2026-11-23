package p636z0.p637a.p639e.p640g;

import android.content.Context;
import android.content.Intent;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import p636z0.p691g.ArrayMap;
import p636z0.p725k.p727d.ContextCompat;

/* JADX INFO: renamed from: z0.a.e.g.b, reason: use source file name */
/* JADX INFO: compiled from: ActivityResultContracts.java */
/* JADX INFO: loaded from: classes.dex */
public final class ActivityResultContracts extends ActivityResultContract<String[], Map<String, Boolean>> {
    @Override // p636z0.p637a.p639e.p640g.ActivityResultContract
    /* JADX INFO: renamed from: a */
    public Intent mo14498a(Context context, String[] strArr) {
        return new Intent("androidx.activity.result.contract.action.REQUEST_PERMISSIONS").putExtra("androidx.activity.result.contract.extra.PERMISSIONS", strArr);
    }

    @Override // p636z0.p637a.p639e.p640g.ActivityResultContract
    /* JADX INFO: renamed from: b */
    public ActivityResultContract.a<Map<String, Boolean>> mo14499b(Context context, String[] strArr) {
        String[] strArr2 = strArr;
        if (strArr2 == null || strArr2.length == 0) {
            return new ActivityResultContract.a<>(Collections.emptyMap());
        }
        ArrayMap arrayMap = new ArrayMap();
        boolean z = true;
        for (String str : strArr2) {
            boolean z2 = ContextCompat.m16133a(context, str) == 0;
            arrayMap.put(str, Boolean.valueOf(z2));
            if (!z2) {
                z = false;
            }
        }
        if (z) {
            return new ActivityResultContract.a<>(arrayMap);
        }
        return null;
    }

    @Override // p636z0.p637a.p639e.p640g.ActivityResultContract
    /* JADX INFO: renamed from: c */
    public Map<String, Boolean> mo14500c(int i, Intent intent) {
        if (i != -1) {
            return Collections.emptyMap();
        }
        if (intent == null) {
            return Collections.emptyMap();
        }
        String[] stringArrayExtra = intent.getStringArrayExtra("androidx.activity.result.contract.extra.PERMISSIONS");
        int[] intArrayExtra = intent.getIntArrayExtra("androidx.activity.result.contract.extra.PERMISSION_GRANT_RESULTS");
        if (intArrayExtra == null || stringArrayExtra == null) {
            return Collections.emptyMap();
        }
        HashMap map = new HashMap();
        int length = stringArrayExtra.length;
        for (int i2 = 0; i2 < length; i2++) {
            map.put(stringArrayExtra[i2], Boolean.valueOf(intArrayExtra[i2] == 0));
        }
        return map;
    }
}
