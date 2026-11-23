package p007c.p114h.p126d.p129c.p133c;

import android.graphics.Bitmap;
import android.net.Uri;
import android.text.TextUtils;
import android.util.Log;
import android.util.Pair;
import java.io.IOException;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.List;
import p007c.p114h.p126d.p129c.p133c.p134e.DynamicColorBaseData;
import p007c.p114h.p126d.p129c.p133c.p134e.DynamicColorData;
import p007c.p114h.p126d.p129c.p139g.ResourceCodec;
import p007c.p114h.p126d.p129c.p139g.ResourceDataCodec;
import p007c.p114h.p126d.p129c.p143i.OpenGLUtils;
import p007c.p114h.p147g.p150c.BitmapUtils;

/* JADX INFO: renamed from: c.h.d.c.c.c, reason: use source file name */
/* JADX INFO: compiled from: DynamicColorLoader.java */
/* JADX INFO: loaded from: classes.dex */
public class DynamicColorLoader {

    /* JADX INFO: renamed from: a */
    public String f4128a;

    /* JADX INFO: renamed from: b */
    public DynamicColorData f4129b;

    /* JADX INFO: renamed from: c */
    public ResourceDataCodec f4130c;

    /* JADX INFO: renamed from: d */
    public final WeakReference<DynamicColorBaseFilter> f4131d;

    /* JADX INFO: renamed from: f */
    public int[] f4133f;

    /* JADX INFO: renamed from: j */
    public float f4137j;

    /* JADX INFO: renamed from: e */
    public HashMap<String, Integer> f4132e = new HashMap<>();

    /* JADX INFO: renamed from: g */
    public int f4134g = -1;

    /* JADX INFO: renamed from: h */
    public int f4135h = -1;

    /* JADX INFO: renamed from: i */
    public int f4136i = -1;

    /* JADX INFO: renamed from: k */
    public float f4138k = 1.0f;

    /* JADX INFO: renamed from: l */
    public float f4139l = 1.0f;

    public DynamicColorLoader(DynamicColorBaseFilter dynamicColorBaseFilter, DynamicColorData dynamicColorData, String str) {
        this.f4137j = 1.0f;
        this.f4131d = new WeakReference<>(dynamicColorBaseFilter);
        str = str.startsWith("file://") ? str.substring(7) : str;
        this.f4128a = str;
        this.f4129b = dynamicColorData;
        this.f4137j = dynamicColorData != null ? dynamicColorData.f4147f : 1.0f;
        Pair<String, String> pairM2166b = ResourceCodec.m2166b(str);
        if (pairM2166b != null) {
            this.f4130c = new ResourceDataCodec(this.f4128a + "/" + ((String) pairM2166b.first), this.f4128a + "/" + pairM2166b.second);
        }
        ResourceDataCodec resourceDataCodec = this.f4130c;
        if (resourceDataCodec != null) {
            try {
                resourceDataCodec.mo2168c();
            } catch (IOException e) {
                Log.e("DynamicColorLoader", "DynamicColorLoader: ", e);
                this.f4130c = null;
            }
        }
        if (!TextUtils.isEmpty(this.f4129b.f4149h) && this.f4131d.get() != null) {
            this.f4131d.get().f3999v = Uri.parse(this.f4128a + "/" + this.f4129b.f4149h);
            this.f4131d.get().f4000w = this.f4129b.f4150i;
        }
        List<DynamicColorBaseData.a> list = this.f4129b.f4146e;
        if (list == null || list.size() <= 0) {
            return;
        }
        this.f4133f = new int[this.f4129b.f4146e.size()];
        for (int i = 0; i < this.f4129b.f4146e.size(); i++) {
            ResourceDataCodec resourceDataCodec2 = this.f4130c;
            Bitmap bitmapM2169e = resourceDataCodec2 != null ? resourceDataCodec2.m2169e(this.f4129b.f4146e.get(i).f4152b) : null;
            bitmapM2169e = bitmapM2169e == null ? BitmapUtils.m2219a(this.f4128a + "/" + String.format(this.f4129b.f4146e.get(i).f4152b, new Object[0])) : bitmapM2169e;
            if (bitmapM2169e != null) {
                this.f4133f[i] = OpenGLUtils.m2183h(bitmapM2169e);
                bitmapM2169e.recycle();
            } else {
                this.f4133f[i] = -1;
            }
        }
    }
}
