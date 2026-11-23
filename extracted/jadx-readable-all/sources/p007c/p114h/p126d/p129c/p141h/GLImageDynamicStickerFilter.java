package p007c.p114h.p126d.p129c.p141h;

import android.content.Context;
import p007c.p114h.p126d.p129c.p130a.GLImageGroupFilter;
import p007c.p114h.p126d.p129c.p141h.p142g.DynamicSticker;
import p007c.p114h.p126d.p129c.p141h.p142g.DynamicStickerFrameData;
import p007c.p114h.p126d.p129c.p141h.p142g.DynamicStickerNormalData;
import p007c.p114h.p126d.p129c.p141h.p142g.StaticStickerNormalData;

/* JADX INFO: renamed from: c.h.d.c.h.e, reason: use source file name */
/* JADX INFO: compiled from: GLImageDynamicStickerFilter.java */
/* JADX INFO: loaded from: classes.dex */
public class GLImageDynamicStickerFilter extends GLImageGroupFilter {
    public GLImageDynamicStickerFilter(Context context, DynamicSticker dynamicSticker) {
        super(context);
        if (dynamicSticker == null || dynamicSticker.f4258a == null) {
            return;
        }
        for (int i = 0; i < dynamicSticker.f4258a.size(); i++) {
            if (dynamicSticker.f4258a.get(i) instanceof DynamicStickerNormalData) {
                this.f4064v.add(new DynamicStickerNormalFilter(context, dynamicSticker));
                break;
            }
        }
        for (int i2 = 0; i2 < dynamicSticker.f4258a.size(); i2++) {
            if (dynamicSticker.f4258a.get(i2) instanceof DynamicStickerFrameData) {
                this.f4064v.add(new DynamicStickerFrameFilter(context, dynamicSticker));
                break;
            }
        }
        for (int i3 = 0; i3 < dynamicSticker.f4258a.size(); i3++) {
            if (dynamicSticker.f4258a.get(i3) instanceof StaticStickerNormalData) {
                this.f4064v.add(new StaticStickerNormalFilter(context, dynamicSticker));
                return;
            }
        }
    }
}
