package p007c.p190n.p194b.p266d.p298f.p299o;

import android.text.TextUtils;
import java.util.ArrayList;
import java.util.Iterator;
import p007c.p190n.p194b.p266d.p298f.C2602b;
import p007c.p190n.p194b.p266d.p298f.p299o.p300n.C2644b;
import p636z0.p691g.ArrayMap;
import p636z0.p691g.MapCollections;

/* JADX INFO: renamed from: c.n.b.d.f.o.c */
/* JADX INFO: compiled from: com.google.android.gms:play-services-base@@17.1.0 */
/* JADX INFO: loaded from: classes.dex */
public class C2630c extends Exception {

    /* JADX INFO: renamed from: f */
    public final ArrayMap<C2644b<?>, C2602b> f11609f;

    public C2630c(ArrayMap<C2644b<?>, C2602b> arrayMap) {
        this.f11609f = arrayMap;
    }

    @Override // java.lang.Throwable
    public String getMessage() {
        ArrayList arrayList = new ArrayList();
        Iterator it = ((MapCollections.c) this.f11609f.keySet()).iterator();
        boolean z = true;
        while (true) {
            MapCollections.a aVar = (MapCollections.a) it;
            if (!aVar.hasNext()) {
                break;
            }
            C2644b c2644b = (C2644b) aVar.next();
            C2602b c2602b = this.f11609f.get(c2644b);
            if (c2602b.m5197K()) {
                z = false;
            }
            String str = c2644b.f11630b.f11607c;
            String strValueOf = String.valueOf(c2602b);
            StringBuilder sb = new StringBuilder(strValueOf.length() + String.valueOf(str).length() + 2);
            sb.append(str);
            sb.append(": ");
            sb.append(strValueOf);
            arrayList.add(sb.toString());
        }
        StringBuilder sb2 = new StringBuilder();
        if (z) {
            sb2.append("None of the queried APIs are available. ");
        } else {
            sb2.append("Some of the queried APIs are unavailable. ");
        }
        sb2.append(TextUtils.join("; ", arrayList));
        return sb2.toString();
    }
}
