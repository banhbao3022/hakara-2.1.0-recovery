package p007c.p114h.p126d.p129c.p141h;

import android.content.Context;
import java.util.ArrayList;
import java.util.List;
import p007c.p114h.p126d.p129c.p130a.GLImageAudioFilter;
import p007c.p114h.p126d.p129c.p141h.p142g.DynamicSticker;

/* JADX INFO: renamed from: c.h.d.c.h.a, reason: use source file name */
/* JADX INFO: compiled from: DynamicStickerBaseFilter.java */
/* JADX INFO: loaded from: classes.dex */
public class DynamicStickerBaseFilter extends GLImageAudioFilter {

    /* JADX INFO: renamed from: C */
    public DynamicSticker f4216C;

    /* JADX INFO: renamed from: D */
    public List<DynamicStickerLoader> f4217D;

    public DynamicStickerBaseFilter(Context context, DynamicSticker dynamicSticker, String str, String str2) {
        super(context, str, str2);
        this.f4216C = dynamicSticker;
        this.f4217D = new ArrayList();
    }
}
