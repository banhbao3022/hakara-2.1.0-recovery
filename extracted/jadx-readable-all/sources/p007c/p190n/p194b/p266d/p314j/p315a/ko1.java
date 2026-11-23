package p007c.p190n.p194b.p266d.p314j.p315a;

import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import org.json.JSONObject;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* JADX INFO: loaded from: classes.dex */
public final class ko1 implements ho1 {

    /* JADX INFO: renamed from: a */
    public final int[] f16004a = new int[2];

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.ho1
    /* JADX INFO: renamed from: a */
    public final void mo7150a(View view, JSONObject jSONObject, go1 go1Var, boolean z) {
        int i;
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            if (!z) {
                for (int i2 = 0; i2 < viewGroup.getChildCount(); i2++) {
                    ((zo1) go1Var).m8895a(viewGroup.getChildAt(i2), this, jSONObject);
                }
                return;
            }
            HashMap map = new HashMap();
            for (int i3 = 0; i3 < viewGroup.getChildCount(); i3++) {
                View childAt = viewGroup.getChildAt(i3);
                ArrayList arrayList = (ArrayList) map.get(Float.valueOf(childAt.getZ()));
                if (arrayList == null) {
                    arrayList = new ArrayList();
                    map.put(Float.valueOf(childAt.getZ()), arrayList);
                }
                arrayList.add(childAt);
            }
            ArrayList arrayList2 = new ArrayList(map.keySet());
            Collections.sort(arrayList2);
            int size = arrayList2.size();
            int i4 = 0;
            while (i4 < size) {
                ArrayList arrayList3 = (ArrayList) map.get((Float) arrayList2.get(i4));
                int size2 = arrayList3.size();
                int i5 = 0;
                while (true) {
                    i = i4 + 1;
                    if (i5 < size2) {
                        ((zo1) go1Var).m8895a((View) arrayList3.get(i5), this, jSONObject);
                        i5++;
                    }
                }
                i4 = i;
            }
        }
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.ho1
    /* JADX INFO: renamed from: c */
    public final JSONObject mo7151c(View view) {
        if (view == null) {
            return po1.m8132a(0, 0, 0, 0);
        }
        int width = view.getWidth();
        int height = view.getHeight();
        view.getLocationOnScreen(this.f16004a);
        int[] iArr = this.f16004a;
        return po1.m8132a(iArr[0], iArr[1], width, height);
    }
}
