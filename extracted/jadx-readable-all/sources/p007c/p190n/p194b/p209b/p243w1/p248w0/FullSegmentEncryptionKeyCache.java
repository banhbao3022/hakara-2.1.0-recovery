package p007c.p190n.p194b.p209b.p243w1.p248w0;

import android.net.Uri;
import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: renamed from: c.n.b.b.w1.w0.i, reason: use source file name */
/* JADX INFO: compiled from: FullSegmentEncryptionKeyCache.java */
/* JADX INFO: loaded from: classes.dex */
public final class FullSegmentEncryptionKeyCache {

    /* JADX INFO: renamed from: a */
    public final LinkedHashMap<Uri, byte[]> f9358a;

    /* JADX INFO: renamed from: c.n.b.b.w1.w0.i$a */
    /* JADX INFO: compiled from: FullSegmentEncryptionKeyCache.java */
    public class a extends LinkedHashMap<Uri, byte[]> {

        /* JADX INFO: renamed from: f */
        public final /* synthetic */ int f9359f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(FullSegmentEncryptionKeyCache fullSegmentEncryptionKeyCache, int i, float f, boolean z, int i2) {
            super(i, f, z);
            this.f9359f = i2;
        }

        @Override // java.util.LinkedHashMap
        public boolean removeEldestEntry(Map.Entry<Uri, byte[]> entry) {
            return size() > this.f9359f;
        }
    }

    public FullSegmentEncryptionKeyCache(int i) {
        this.f9358a = new a(this, i + 1, 1.0f, false, i);
    }
}
