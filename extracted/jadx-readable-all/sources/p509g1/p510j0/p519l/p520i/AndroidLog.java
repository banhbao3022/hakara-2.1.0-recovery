package p509g1.p510j0.p519l.p520i;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.logging.Logger;
import p477d1.p483s.Maps7;
import p477d1.p483s.MapsJVM;
import p477d1.p493x.p495c.Intrinsics2;
import p509g1.OkHttpClient;
import p509g1.p510j0.p513f.TaskRunner;
import p509g1.p510j0.p517j.Http2;

/* JADX INFO: renamed from: g1.j0.l.i.c, reason: use source file name */
/* JADX INFO: compiled from: AndroidLog.kt */
/* JADX INFO: loaded from: classes2.dex */
public final class AndroidLog {

    /* JADX INFO: renamed from: a */
    public static final CopyOnWriteArraySet<Logger> f30552a = new CopyOnWriteArraySet<>();

    /* JADX INFO: renamed from: b */
    public static final Map<String, String> f30553b;

    /* JADX INFO: renamed from: c */
    public static final AndroidLog f30554c = null;

    static {
        Map<String, String> mapM13053b;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Package r1 = OkHttpClient.class.getPackage();
        String name = r1 != null ? r1.getName() : null;
        if (name != null) {
            linkedHashMap.put(name, "OkHttp");
        }
        String name2 = OkHttpClient.class.getName();
        Intrinsics2.m13086b(name2, "OkHttpClient::class.java.name");
        linkedHashMap.put(name2, "okhttp.OkHttpClient");
        String name3 = Http2.class.getName();
        Intrinsics2.m13086b(name3, "Http2::class.java.name");
        linkedHashMap.put(name3, "okhttp.Http2");
        String name4 = TaskRunner.class.getName();
        Intrinsics2.m13086b(name4, "TaskRunner::class.java.name");
        linkedHashMap.put(name4, "okhttp.TaskRunner");
        Intrinsics2.m13089e(linkedHashMap, "$this$toMap");
        int size = linkedHashMap.size();
        if (size == 0) {
            mapM13053b = Maps7.f29520f;
        } else if (size != 1) {
            Intrinsics2.m13089e(linkedHashMap, "$this$toMutableMap");
            mapM13053b = new LinkedHashMap<>(linkedHashMap);
        } else {
            mapM13053b = MapsJVM.m13053b(linkedHashMap);
        }
        f30553b = mapM13053b;
    }
}
