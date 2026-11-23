package p007c.p114h.p126d.p129c.p141h;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.net.Uri;
import android.opengl.GLES30;
import android.opengl.GLUtils;
import android.text.TextUtils;
import android.util.Log;
import android.util.Pair;
import java.io.IOException;
import java.lang.ref.WeakReference;
import java.util.Objects;
import p007c.p071d.p078c.p079a.outline;
import p007c.p114h.p126d.p129c.p130a.GLImageAudioFilter;
import p007c.p114h.p126d.p129c.p139g.ResourceCodec;
import p007c.p114h.p126d.p129c.p139g.ResourceIndexCodec;
import p007c.p114h.p126d.p129c.p141h.p142g.DynamicStickerData;
import p007c.p114h.p126d.p129c.p143i.OpenGLUtils;
import p007c.p114h.p144e.LandmarkEngine;
import p007c.p114h.p147g.p150c.BitmapUtils;

/* JADX INFO: renamed from: c.h.d.c.h.c, reason: use source file name */
/* JADX INFO: compiled from: DynamicStickerLoader.java */
/* JADX INFO: loaded from: classes.dex */
public class DynamicStickerLoader {

    /* JADX INFO: renamed from: a */
    public boolean f4223a;

    /* JADX INFO: renamed from: b */
    public int f4224b;

    /* JADX INFO: renamed from: c */
    public int f4225c;

    /* JADX INFO: renamed from: d */
    public String f4226d;

    /* JADX INFO: renamed from: e */
    public DynamicStickerData f4227e;

    /* JADX INFO: renamed from: f */
    public ResourceIndexCodec f4228f;

    /* JADX INFO: renamed from: g */
    public int f4229g;

    /* JADX INFO: renamed from: h */
    public long f4230h;

    /* JADX INFO: renamed from: i */
    public final WeakReference<DynamicStickerBaseFilter> f4231i;

    public DynamicStickerLoader(boolean z, DynamicStickerBaseFilter dynamicStickerBaseFilter, DynamicStickerData dynamicStickerData, String str) {
        this.f4223a = false;
        this.f4229g = -1;
        this.f4230h = -1L;
        this.f4223a = z;
        this.f4231i = new WeakReference<>(dynamicStickerBaseFilter);
        this.f4224b = -1;
        this.f4225c = -1;
        str = str.startsWith("file://") ? str.substring(7) : str;
        this.f4226d = str;
        this.f4227e = dynamicStickerData;
        Pair<String, String> pairM2166b = ResourceCodec.m2166b(str);
        if (pairM2166b != null) {
            this.f4228f = new ResourceIndexCodec(this.f4226d + "/" + ((String) pairM2166b.first), this.f4226d + "/" + ((String) pairM2166b.second));
        }
        ResourceIndexCodec resourceIndexCodec = this.f4228f;
        if (resourceIndexCodec != null) {
            try {
                resourceIndexCodec.mo2168c();
            } catch (IOException e) {
                Log.e("DynamicStickerLoader", "init merge res reader failed", e);
                this.f4228f = null;
            }
        }
        this.f4224b = -1;
        this.f4225c = -1;
        Objects.requireNonNull(this.f4227e);
        if (TextUtils.isEmpty(null)) {
            return;
        }
        String strSubstring = this.f4226d.startsWith("file://") ? this.f4226d.substring(7) : this.f4226d;
        if (this.f4231i.get() != null) {
            DynamicStickerBaseFilter dynamicStickerBaseFilter2 = this.f4231i.get();
            StringBuilder sbM1561L = outline.m1561L(strSubstring, "/");
            Objects.requireNonNull(this.f4227e);
            sbM1561L.append((String) null);
            dynamicStickerBaseFilter2.f3999v = Uri.parse(sbM1561L.toString());
            DynamicStickerBaseFilter dynamicStickerBaseFilter3 = this.f4231i.get();
            Objects.requireNonNull(this.f4227e);
            dynamicStickerBaseFilter3.f4000w = false;
        }
    }

    /* JADX INFO: renamed from: a */
    public void m2173a() {
        if (this.f4224b == -1) {
            this.f4224b = this.f4225c;
        }
        OpenGLUtils.m2185j(this.f4224b);
        this.f4224b = -1;
        this.f4225c = -1;
        if (this.f4231i.get() != null) {
            this.f4231i.clear();
        }
    }

    /* JADX INFO: renamed from: b */
    public void m2174b() {
        int i;
        if (!LandmarkEngine.b.f4266a.m2193c() && !this.f4223a) {
            this.f4230h = -1L;
            if (this.f4231i.get() != null) {
                this.f4231i.get().m2127u();
                return;
            }
            return;
        }
        Objects.requireNonNull(this.f4227e);
        Bitmap bitmapM2219a = null;
        if (!TextUtils.isEmpty(null)) {
            Objects.requireNonNull(this.f4227e);
            if (this.f4231i.get() != null) {
                DynamicStickerBaseFilter dynamicStickerBaseFilter = this.f4231i.get();
                GLImageAudioFilter.c cVar = GLImageAudioFilter.c.INIT;
                if (dynamicStickerBaseFilter.f3999v != null) {
                    GLImageAudioFilter.c cVar2 = dynamicStickerBaseFilter.f4002y;
                    if (cVar2 == GLImageAudioFilter.c.RELEASE) {
                        GLImageAudioFilter.b bVar = new GLImageAudioFilter.b(dynamicStickerBaseFilter, dynamicStickerBaseFilter.f4028b, dynamicStickerBaseFilter);
                        dynamicStickerBaseFilter.f4003z = bVar;
                        try {
                            bVar.setDataSource(dynamicStickerBaseFilter.f4028b, dynamicStickerBaseFilter.f3999v);
                            dynamicStickerBaseFilter.f4003z.setOnPreparedListener(dynamicStickerBaseFilter.f3998B);
                            dynamicStickerBaseFilter.f3997A.add(dynamicStickerBaseFilter.f4003z);
                            dynamicStickerBaseFilter.f4003z.prepareAsync();
                            dynamicStickerBaseFilter.f4003z.setLooping(dynamicStickerBaseFilter.f4000w);
                            dynamicStickerBaseFilter.f4002y = cVar;
                            dynamicStickerBaseFilter.f4001x = true;
                        } catch (IOException e) {
                            Log.e(dynamicStickerBaseFilter.f4027a, "initPlayer: ", e);
                        }
                    } else if (cVar2 == GLImageAudioFilter.c.PREPARED) {
                        dynamicStickerBaseFilter.f4003z.start();
                        dynamicStickerBaseFilter.f4003z.seekTo(0);
                        dynamicStickerBaseFilter.f4002y = GLImageAudioFilter.c.PLAYING;
                    } else if (cVar2 == cVar) {
                        dynamicStickerBaseFilter.f4001x = true;
                    }
                }
            }
        }
        if (this.f4230h == -1) {
            this.f4230h = System.currentTimeMillis();
        }
        long jCurrentTimeMillis = System.currentTimeMillis() - this.f4230h;
        Objects.requireNonNull(this.f4227e);
        int i2 = (int) (jCurrentTimeMillis / ((long) 0));
        Objects.requireNonNull(this.f4227e);
        if (i2 >= 0) {
            Objects.requireNonNull(this.f4227e);
            this.f4230h = -1L;
            this.f4225c = this.f4224b;
            this.f4224b = -1;
            this.f4229g = -1;
            return;
        }
        if (i2 < 0) {
            i2 = 0;
        }
        if (this.f4229g == i2) {
            return;
        }
        if (i2 == 0) {
            Objects.requireNonNull(this.f4227e);
        }
        ResourceIndexCodec resourceIndexCodec = this.f4228f;
        if (resourceIndexCodec != null) {
            Objects.requireNonNull(resourceIndexCodec);
            if (i2 >= 0) {
                int[] iArr = resourceIndexCodec.f4203e;
                if (i2 < iArr.length) {
                    int i3 = iArr[i2];
                    int i4 = resourceIndexCodec.f4204f[i2];
                    if (i3 != -1 && i4 != -1) {
                        bitmapM2219a = BitmapFactory.decodeByteArray(resourceIndexCodec.f4199d.array(), resourceIndexCodec.f4199d.arrayOffset() + i3, i4);
                    }
                }
            }
        }
        if (bitmapM2219a == null) {
            Objects.requireNonNull(this.f4227e);
            bitmapM2219a = BitmapUtils.m2219a(this.f4226d + "/" + String.format("null_%03d.png", Integer.valueOf(i2)));
        }
        if (bitmapM2219a == null) {
            this.f4225c = this.f4224b;
            this.f4224b = -1;
            this.f4229g = -1;
            return;
        }
        if (this.f4224b == -1 && (i = this.f4225c) != -1) {
            this.f4224b = i;
        }
        int i5 = this.f4224b;
        if (i5 == -1) {
            this.f4224b = OpenGLUtils.m2183h(bitmapM2219a);
        } else {
            float[] fArr = OpenGLUtils.f4259a;
            int[] iArr2 = new int[1];
            if (i5 == -1) {
                iArr2[0] = OpenGLUtils.m2183h(bitmapM2219a);
            } else {
                iArr2[0] = i5;
                if (bitmapM2219a != null && !bitmapM2219a.isRecycled()) {
                    GLES30.glBindTexture(3553, iArr2[0]);
                    GLUtils.texSubImage2D(3553, 0, 0, 0, bitmapM2219a);
                }
            }
            this.f4224b = iArr2[0];
        }
        this.f4225c = this.f4224b;
        this.f4229g = i2;
        bitmapM2219a.recycle();
    }

    public DynamicStickerLoader(DynamicStickerBaseFilter dynamicStickerBaseFilter, DynamicStickerData dynamicStickerData, String str) {
        this(false, dynamicStickerBaseFilter, dynamicStickerData, str);
    }
}
