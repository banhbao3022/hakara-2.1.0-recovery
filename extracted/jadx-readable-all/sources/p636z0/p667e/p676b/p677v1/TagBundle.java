package p636z0.p667e.p676b.p677v1;

import android.util.ArrayMap;
import java.util.Map;

/* JADX INFO: renamed from: z0.e.b.v1.m1, reason: use source file name */
/* JADX INFO: compiled from: TagBundle.java */
/* JADX INFO: loaded from: classes.dex */
public class TagBundle {

    /* JADX INFO: renamed from: a */
    public static final TagBundle f36212a = new TagBundle(new ArrayMap());

    /* JADX INFO: renamed from: b */
    public final Map<String, Integer> f36213b;

    public TagBundle(Map<String, Integer> map) {
        this.f36213b = map;
    }

    /* JADX INFO: renamed from: a */
    public Integer m15397a(String str) {
        return this.f36213b.get(str);
    }
}
