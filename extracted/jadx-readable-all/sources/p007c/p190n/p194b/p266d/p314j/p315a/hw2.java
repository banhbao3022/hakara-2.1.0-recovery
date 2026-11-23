package p007c.p190n.p194b.p266d.p314j.p315a;

import java.util.Comparator;
import java.util.List;
import p007c.p190n.p194b.p266d.p267a.C2191r;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads-lite@@20.1.0 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class hw2 implements Comparator {

    /* JADX INFO: renamed from: f */
    public static final Comparator f15042f = new hw2();

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        List<String> list = C2191r.f10581a;
        return list.indexOf((String) obj) - list.indexOf((String) obj2);
    }
}
