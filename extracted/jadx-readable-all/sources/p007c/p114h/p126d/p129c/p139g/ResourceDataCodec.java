package p007c.p114h.p126d.p129c.p139g;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.util.Pair;

/* JADX INFO: renamed from: c.h.d.c.g.e, reason: use source file name */
/* JADX INFO: compiled from: ResourceDataCodec.java */
/* JADX INFO: loaded from: classes.dex */
public class ResourceDataCodec extends ResourceCodec {
    public ResourceDataCodec(String str, String str2) {
        super(str, str2);
    }

    /* JADX INFO: renamed from: e */
    public Bitmap m2169e(String str) {
        Pair<Integer, Integer> pair = this.f4198c.get(str);
        if (pair == null) {
            return null;
        }
        return BitmapFactory.decodeByteArray(this.f4199d.array(), ((Integer) pair.first).intValue() + this.f4199d.arrayOffset(), ((Integer) pair.second).intValue());
    }
}
