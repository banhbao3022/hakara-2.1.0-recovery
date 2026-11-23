package androidx.work;

import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import p636z0.p709j0.Data;
import p636z0.p709j0.InputMerger;

/* JADX INFO: loaded from: classes.dex */
public final class OverwritingInputMerger extends InputMerger {
    @Override // p636z0.p709j0.InputMerger
    /* JADX INFO: renamed from: a */
    public Data mo938a(List<Data> list) {
        Data.a aVar = new Data.a();
        HashMap map = new HashMap();
        Iterator<Data> it = list.iterator();
        while (it.hasNext()) {
            map.putAll(Collections.unmodifiableMap(it.next().f37260c));
        }
        aVar.m15882b(map);
        return aVar.m15881a();
    }
}
