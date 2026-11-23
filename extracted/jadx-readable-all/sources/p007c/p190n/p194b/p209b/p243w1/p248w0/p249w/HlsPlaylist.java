package p007c.p190n.p194b.p209b.p243w1.p248w0.p249w;

import java.util.Collections;
import java.util.List;
import p007c.p190n.p194b.p209b.p242v1.FilterableManifest;

/* JADX INFO: renamed from: c.n.b.b.w1.w0.w.h, reason: use source file name */
/* JADX INFO: compiled from: HlsPlaylist.java */
/* JADX INFO: loaded from: classes.dex */
public abstract class HlsPlaylist implements FilterableManifest<HlsPlaylist> {

    /* JADX INFO: renamed from: a */
    public final String f9611a;

    /* JADX INFO: renamed from: b */
    public final List<String> f9612b;

    /* JADX INFO: renamed from: c */
    public final boolean f9613c;

    public HlsPlaylist(String str, List<String> list, boolean z) {
        this.f9611a = str;
        this.f9612b = Collections.unmodifiableList(list);
        this.f9613c = z;
    }
}
